package com.eduardo.riskflow_api;

import com.eduardo.riskflow_api.dominio.Cliente;
import com.eduardo.riskflow_api.dominio.Conta;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Eduardo Zaniboni", "123.456.789.10", "(27) 9 9988-7766");
        final Conta conta = new Conta(new BigDecimal("100"), cliente, Status.ATIVA);

        System.out.println(conta.getSaldo());

        conta.setSaldo(new BigDecimal("200"));

        System.out.println(conta.getSaldo());

        conta.setSaldo(new BigDecimal("-0.01"));

        System.out.println(conta.getSaldo());

    }
}
