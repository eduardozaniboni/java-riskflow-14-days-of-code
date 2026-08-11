package com.eduardo.riskflow_api;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Conta {
    private BigDecimal saldo;
    private Cliente titular;
    private Status status;

    public Conta(BigDecimal saldo, Cliente titular, Status status) {
        this.saldo = saldo;
        this.titular = titular;
        this.status = status;
    }
}