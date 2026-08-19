package com.eduardo.riskflow_api.dominio.risco;

public class RegraSaldoMuitoBaixo implements RegraDeRisco {
    @Override
    public ResumoRisco avaliar() {
        return new ResumoRisco("Saldo muito baixo!", NivelRisco.ALTO);
    }
}
