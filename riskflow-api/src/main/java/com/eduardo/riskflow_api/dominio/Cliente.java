package com.eduardo.riskflow_api.dominio;

import com.eduardo.riskflow_api.Status;

import java.math.BigDecimal;

public class Cliente {
    private String nome;
    private String documento;
    private String telefone;

    public Cliente(String nome, String documento, String telefone) {
        this.nome = nome;
        this.documento = documento;
        this.telefone = telefone;
    }

    public void testarAcesso() {
        Cliente cliente = new Cliente("Titular Teste", "123.456.789.10", "(27) 9 9988-7766");
        final Conta conta = new Conta(new BigDecimal("100"), cliente, Status.ATIVA);

        conta.titular = cliente; // acesso por pacote ou "filhas" // protected
        conta.status = Status.ATIVA; // acesso padrão // default
        conta.teste = "Teste"; // acesso public // public
    }
}
