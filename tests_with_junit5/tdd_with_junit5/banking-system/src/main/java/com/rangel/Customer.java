package com.rangel;

public class Customer {

    private String name;
    private String cpf;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (ValidateCPF.validateCpf(cpf)) {
            this.cpf = cpf;
        }
    }
}
