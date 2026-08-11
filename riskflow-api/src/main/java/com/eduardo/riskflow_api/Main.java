package com.eduardo.riskflow_api;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Eduardo Zaniboni", "123.456.789.10", "(27) 9 9988-7766");
        final Conta conta = new Conta(new BigDecimal("100"), cliente, Status.ATIVA);

        System.out.println(conta);

        conta.setSaldo(new BigDecimal("200"));

        /*conta = new Conta(new BigDecimal("100"), cliente, Status.ATIVA);*/

        final int primitivo = 5;
        primitivo = 6;

        final Integer wrapper = 5;
        wrapper = 6;

        final int[] numeros = {1, 2, 3};
        numeros[0] = 99;

        final Integer integer = Integer.parseInt("10");

        List<Integer> idades = new ArrayList<>();

    }
}
