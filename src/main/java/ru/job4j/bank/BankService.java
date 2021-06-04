package ru.job4j.bank;

import java.util.*;
import java.util.stream.Collectors;

/**
        * Класс описывает работу банковского сервиса
        * @author Albina Khamatllina
        * @version 1.0
        */
public class BankService {
    /**
     * хранение клиента и его счетов осуществляется в коллекции типа Map
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет клиента, если он отсутствует
     * @param user клиент, который добавляется в список
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     *Метод добавляет банковский счет клиенту, сначала ищется клиент по
     * паспортным данным, и если клиент найден, проверяется наличие счета у клиента,
     * и если отсутствует данный счет, тогда добавляется в список счетов клиента
     * @param passport паспортные данные клиента
     * @param account банковский счет
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> userList = users.get(user.get());
            if (!userList.contains(account)) {
                userList.add(account);
            }
        }
    }

    /**
     *Метод осуществляет поиск клиента по паспортным данным
     * @param passport паспортные данные клиента
     * @return возвращает клиента по заданным паспортным данным
     */
    public Optional<User> findByPassport(String passport) {
        Optional<User> rsl = Optional.empty();
        rsl = users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst();
        if (rsl.isPresent()) {
            return rsl;
        }
        return rsl;
    }

    /**
     *Метод осуществляет поиск банковского счета по паспортным данным и реквизитам,
     * сначала ищется клиента по паспортным данным, и если клиент найден, тогда в списке его счетов
     * ищется банковский счет с данным номером счета
     * @param passport паспортные данные клиента
     * @param requisite номер банковского счета
     * @return возвращает банковский счет
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<Account> acc = Optional.empty();
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            return users.get(user.get())
                    .stream()
                    .filter(account -> account.getRequisite().equals(requisite))
                    .findFirst();
        }
        return acc;
    }

    /**
     *Метод осуществляет перевод средств со счета на счет, сначала ищется счет с которого будет осущестляться
     * перевод и счет на который планируется перевод, и если оба счета существуют , тогда осущесвляется
     * перевод.
     * Поиск счетов осуществляется с помощью паспортных данных и номер счета клиента
     * @param srcPassport паспортные данные клиента, отправитель средств
     * @param srcRequisite номер счета, с которого осуществляется перевод
     * @param destPassport паспортные данные клиента, получатель средств
     * @param destRequisite номер счета, на который осуществляется перевод
     * @param amount сумма перевода
     * @return возвращает успех  или неуспех перевода
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> scrAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if (scrAccount != null && scrAccount.get().getBalance() >= amount && destAccount != null
                ) {
            scrAccount.get().setBalance(scrAccount.get().getBalance() - amount);
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}

