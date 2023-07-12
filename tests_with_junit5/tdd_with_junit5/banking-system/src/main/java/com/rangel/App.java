package com.rangel;

public class App {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setCpf("45500221833");
        System.out.println("CPF: " + customer.getCpf());
    }
}
