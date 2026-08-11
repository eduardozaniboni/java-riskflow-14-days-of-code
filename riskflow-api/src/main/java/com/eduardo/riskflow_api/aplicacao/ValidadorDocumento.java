package com.eduardo.riskflow_api.aplicacao;

import com.eduardo.riskflow_api.Status;
import com.eduardo.riskflow_api.dominio.Cliente;
import com.eduardo.riskflow_api.dominio.Conta;

import java.math.BigDecimal;

public class ValidadorDocumento {
    public void testarAcesso() {
        Cliente cliente = new Cliente("Eduardo Zaniboni", "123.456.789.10", "(27) 9 9988-7766");
        final Conta conta = new Conta(new BigDecimal("100"), cliente, Status.ATIVA);

        conta.teste = "Teste"; // acesso public
        // conta.saldo // não vou conseguir acessar, pois é private*/
        // conta.titular // não vou conseguir acessar, pois é protected e não está no mesmo pacote
    }
}
