package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (!users.containsKey(user)) {
            users.put(user, new ArrayList<Account>());
        }
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> userList = users.get(user);
            if (!userList.contains(account)) {
                userList.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        User rsl = null;
        for (User element : users.keySet()
        ) {
            if (users.keySet().contains(passport)) {
                rsl = element;
            }
        }
        return rsl;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account account = null;
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> userList = users.get(user);
            for (Account element : userList
            ) {
                if (userList.equals(requisite)) {
                    account = element;
                }
            }
        }
        return account;
    }


    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {

        boolean rsl = false;
        return rsl;
    }
//Метод для перечисления денег с одного счёта на другой счёт.
//Если счёт не найден или не хватает денег на счёте srcAccount (с которого переводят), то метод должен вернуть false.
//
//Посмотрите на методы Map.putIfAbsent и List.contains, как их можно применить в этом задании.
//
//Метод putIfAbsent позволяет проверить, если ли такой ключ в карте или нет и если его нет, то произвести вставку данных.
//Этот метод позволяет уменьшить количество кода.
//Метод List.indexOf позволяет найти индекс элемента по значению. Проверка элементов в этом методе происходит по методу equals.
  //  Обратите внимание, что в моделях User и Account используется только одно поле passport и requisite для
//    сравнения объектов. Это позволяет использовать эти методы, без информации о всех полях.
}
