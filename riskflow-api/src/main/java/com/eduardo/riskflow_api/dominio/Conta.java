package com.eduardo.riskflow_api.dominio;

import com.eduardo.riskflow_api.Status;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class Conta {
    private BigDecimal saldo;
    protected Cliente titular;
    Status status; // default
    public String teste;

    public Conta(BigDecimal saldo, Cliente titular, Status status) {
        this.saldo = saldo;
        this.titular = titular;
        this.status = status;
    }

    public void setSaldo(BigDecimal saldo) {
        if (saldo.signum() < 0) {
            throw new IllegalArgumentException("Não utilizamos cheque especial, com isso o saldo não pode ser negativo.");
        }
        this.saldo = saldo;
    }
}