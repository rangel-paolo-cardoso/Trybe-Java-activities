package com.rangel;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class BankAccountTest {

    @Test
    @DisplayName("Tests whether the application can return the customer name.")
    public void testCustomerName() {
        BankAccount account = new BankAccount();
        account.setCustomerName("Paul");
        assertEquals("Paul", account.getCustomerName());
    }

    @Test
    @DisplayName("Tests whether the application can return a valid customer's CPF.")
    public void testCustomerValidCPF() {
        BankAccount account = new BankAccount();
        account.setCustomerCPF("02758787083");
        assertEquals("02758787083", account.getCustomerCPF());
    }

    @Test
    @DisplayName("Tests whether the application can return an valid customer's CPF.")
    public void testCustomerInvalidCPF() {
        BankAccount account = new BankAccount();
        account.setCustomerCPF("02758787089");
        assertNull(account.getCustomerCPF());
    }

    @Test
    @DisplayName("Tests whether the application can perform a deposit to the account.")
    public void testDeposit() {
        BankAccount account = new BankAccount();
        assertEquals(5_000, account.deposit(5_000));
    }

    @Test
    @DisplayName("Tests whether the application can perform a withdraw from the account.")
    public void testWithdraw() {
        BankAccount account = new BankAccount();
        account.deposit(5_000);
        assertEquals(3_000, account.withdraw(2_000));
    }

    @Test
    @DisplayName("Tests whether the application can verify balance.")
    public void testCheckBalance() {
        BankAccount account = new BankAccount();
        account.deposit(5_000);
        assertEquals(5_000, account.checkBalance());
    }
}
