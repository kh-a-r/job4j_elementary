package ru.job4j.bank;

import org.junit.Test;

import java.util.Optional;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BankServiceTest {

    @Test
    public void addUser() {
        Optional<User> user = Optional.of(new User("3434", "Petr Arsentev"));
            BankService bank = new BankService();
            bank.addUser(user.get());
            assertThat(bank.findByPassport("3434").get(), is(user.get()));
        }

    @Test
    public void addAccount() {
        Optional<User> user = Optional.of(new User("3434", "Petr Arsentev"));
        BankService bank = new BankService();
        bank.addUser(user.get());
        bank.addAccount(user.get().getPassport(), new Account("5546", 150D));
        assertThat(bank.findByRequisite("3434", "5546").get().getBalance(), is(150D));
    }

    @Test
    public void addDublAccount() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        bank.addAccount(user.getPassport(), new Account("5546", 100D));
        assertThat(bank.findByRequisite("3434", "5546").get().getBalance(), is(150D));
    }

    @Test
    public void whenEnterInvalidPassport() {
        Optional<User> user = Optional.of(new User("3423", "Petr Arsentev"));
        BankService bank = new BankService();
        bank.addUser(user.get());
        bank.addAccount(user.get().getPassport(), new Account("5546", 150D));
        assertThat(bank.findByRequisite("34", "5546"), is(Optional.empty()));
    }

    @Test
    public void whenEnterInvalidRequisite() {
        Optional<User> user = Optional.of(new User("3423", "Petr Arsentev"));
        BankService bank = new BankService();
        bank.addUser(user.get());
        bank.addAccount(user.get().getPassport(), new Account("5546", 150D));
        assertThat(bank.findByRequisite("34", "5546"), is(Optional.empty()));
    }

    @Test
    public void findByPassport() {
        Optional<User> user = Optional.of(new User("123", "Bob Marley"));
        BankService bank = new BankService();
        bank.addUser(user.get());
        bank.addAccount("123", new Account("2222", 100D));
        assertThat((bank.findByPassport(user.get().getPassport())).get().getPassport(), is("123"));
    }

    @Test
    public void findByRequisite() {
        Optional<User> user = Optional.of(new User("123", "Bob Marley"));
        BankService bank = new BankService();
        bank.addUser(user.get());
        bank.addAccount("123", new Account("2222", 100D));
        assertThat(bank.findByRequisite(user.get().getPassport(), "2222").get().getRequisite(), is("2222"));
    }

    @Test
    public void transferMoney() {
        Optional<User> user = Optional.of(new User("3423", "Petr Arsentev"));
        BankService bank = new BankService();
        bank.addUser(user.get());
        bank.addAccount(user.get().getPassport(), new Account("5546", 150D));
        bank.addAccount(user.get().getPassport(), new Account("113", 50D));
        bank.transferMoney(user.get().getPassport(), "5546", user.get().getPassport(), "113", 150D);
        assertThat(bank.findByRequisite(user.get().getPassport(), "113").get().getBalance(), is(200D));
    }

    @Test
    public void whenBalanceLessForTransferMoney() {
        Optional<User> user = Optional.of(new User("3423", "Petr Arsentev"));
        BankService bank = new BankService();
        bank.addUser(user.get());
        bank.addAccount(user.get().getPassport(), new Account("5546", 100D));
        bank.addAccount(user.get().getPassport(), new Account("113", 50D));
        bank.transferMoney(user.get().getPassport(), "5546", user.get().getPassport(), "113", 101D);
        //assertThat(bank.findByRequisite(user.getPassport(), "113").getBalance(), is(50D));
        assertThat(bank.transferMoney(user.get().getPassport(), "5546", user.get().getPassport(), "113", 101D), is(false));
    }
}