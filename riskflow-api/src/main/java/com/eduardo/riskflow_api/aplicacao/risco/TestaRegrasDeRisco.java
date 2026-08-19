package com.eduardo.riskflow_api.aplicacao.risco;

import com.eduardo.riskflow_api.dominio.risco.*;

import java.util.ArrayList;
import java.util.List;

public class TestaRegrasDeRisco {
    public static void main(String[] args) {
        List<RegraDeRisco> regraDeRiscos = new ArrayList<>();

        regraDeRiscos.add(new RegraSaldoMuitoBaixo());
        regraDeRiscos.add(new RegraSaldoRecemCriada());

        for (RegraDeRisco regra : regraDeRiscos) {
            ResumoRisco resultado = regra.avaliar();
            System.out.println("Veredito da regra: " + resultado);
        }
    }
}
