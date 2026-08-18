package com.eduardo.riskflow_api.aplicacao;

import com.eduardo.riskflow_api.dominio.Operacao;

public class ProcessadorDeOperacao {
    public void executar(Operacao op) {
        op.processar();
    }
}
