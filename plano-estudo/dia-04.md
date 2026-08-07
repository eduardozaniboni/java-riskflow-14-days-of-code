# Dia 04 — Interface, Record, Enum: Contratos, Dados e Tipos Fixos

🎯 **Objetivo do dia**: Construir contratos claros e usar as ferramentas modernas do Java para transporte e tipagem.

📖 **Conceito**
* **Interface:** É um contrato de comportamento. "Quem assina, promete ter estes métodos". Não armazena estado.
* **Record (Java 14+):** Uma estrutura concisa e imutável feita especificamente para transportar dados (substitui os antigos DTOs com Lombok).
* **Enum:** Tipo seguro para domínios fechados (ex: DIAS_DA_SEMANA). Evita "magic strings" e erros de digitação.

🏦 **No RiskFlow**
Temos níveis de risco, regras que avaliam operações, e resumos gerados.

✍️ **Escreva do zero**
1. Crie um `enum NivelRisco` (BAIXO, MEDIO, ALTO).
2. Crie uma `interface RegraDeRisco` com método `NivelRisco avaliar()`.
3. Crie duas implementações: `RegraSaldoMuitoBaixo` e `RegraContaRecemCriada`.
4. Crie um `record ResumoRisco(String mensagem, NivelRisco nivel)`.
5. Em uma `Main`, crie uma `List<RegraDeRisco>`, adicione as duas regras, e faça um loop `for` chamando `avaliar()` em cada uma, sem `if/else`.

⚖️ **Compare e justifique**
Por que `RegraDeRisco` é uma interface e não uma classe abstrata? (Dica: herança múltipla de comportamento vs restrição da classe).

🎤 **Entrevista Check**
"Qual a diferença entre interface e classe abstrata? Dê um exemplo real de cada um."

🚫 **Anti-padrão do dia**
Usar `String status = "ALTO";` ao invés de usar `NivelRisco.ALTO`. O compilador não te salva de strings digitadas erradas.

📋 **Checklist**
* [ ] Criou e iterou uma lista de Interfaces.
* [ ] Criou um Record corretamente.
* [ ] Entendeu a proteção oferecida pelos Enums.

🔗 **Próximo passo**: Manipular conjuntos maiores de dados na memória.
