package com.eduardo.riskflow_api.dominio.risco;

public class RegraSaldoRecemCriada implements RegraDeRisco {
    @Override
    public ResumoRisco avaliar() {
        return new ResumoRisco("Saldo recém criado!", NivelRisco.BAIXO);
    }
}
