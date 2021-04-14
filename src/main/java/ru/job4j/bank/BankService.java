package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> userList = users.get(user);
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
    public User findByPassport(String passport) {
        User rsl = null;
        for (User element : users.keySet()
        ) {
            if (element.getPassport().equals(passport)) {
                rsl = element;
                break;
            }
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
    public Account findByRequisite(String passport, String requisite) {
        Account account = null;
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> userList = users.get(user);
            for (Account element : userList
            ) {
                if (element.getRequisite().equals(requisite)) {
                    account = element;
                    break;
                }
            }
        }
        return account;
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
        Account scrAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (scrAccount != null && scrAccount.getBalance() >= amount && destAccount != null
                ) {
            scrAccount.setBalance(scrAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}

