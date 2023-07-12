package com.rangel;

public class BankAccount {

    private int balance;
    private Customer customer;

    public BankAccount() {
        this.balance = 0;
        this.customer = new Customer();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public void setCustomerName(String customerName) {
        this.customer.setName(customerName);
    }

    public String getCustomerCPF() {
        return customer.getCpf();
    }

    public void setCustomerCPF(String cpf) {
        this.customer.setCpf(cpf);
    }

    public int deposit(int value) {
        balance += value;
        return balance;
    }

    public int withdraw(int value) {
        balance -= value;
        return balance;
    }

    public int checkBalance() {
        return balance;
    }
}
