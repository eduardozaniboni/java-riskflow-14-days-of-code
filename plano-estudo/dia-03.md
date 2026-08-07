# Dia 03 — Herança, Composição e Polimorfismo: O Verbo 'É UM' vs 'TEM UM'

🎯 **Objetivo do dia**: Evitar a armadilha da herança excessiva e dominar o polimorfismo.

📖 **Conceito**
* **Herança (É UM):** Cria acoplamento forte. Deve ser evitada a menos que a relação seja estritamente verdadeira em qualquer contexto.
* **Composição (TEM UM):** Delegação. Mais flexível. Uma Conta "tem um" Cliente, não "é um" Cliente.
* **Polimorfismo:** Tratar diferentes objetos específicos através de um tipo genérico comum.
* `@Override`: Garante ao compilador que você está sobrescrevendo o método certo. Evita bugs silenciosos se a classe mãe mudar.

🏦 **No RiskFlow**
Temos `OperacaoCredito` e `OperacaoDebito`. Ambas são "Operações". Como organizamos isso?

✍️ **Escreva do zero**
1. Crie uma classe abstrata `Operacao` ou uma Interface (escolha e justifique) com um método `void processar()`.
2. Crie `OperacaoCredito` e `OperacaoDebito` implementando/herdando `Operacao`.
3. Crie uma classe `ProcessadorDeOperacao` com um método `public void executar(Operacao op)`.
4. Esse método deve chamar o `.processar()` da operação, sem usar `if (op instanceof OperacaoCredito)`.

⚖️ **Compare e justifique**
Herança vs Composição no RiskFlow. Se amanhã surgir `OperacaoTransferenciaPix`, o que quebra se usarmos `if/else`? O que muda na abordagem polimórfica?

🎤 **Entrevista Check**
"Dê um exemplo de quando herança é uma armadilha e composição é a saída."

🚫 **Anti-padrão do dia**
Usar `instanceof` e cast desnecessários no lugar de polimorfismo.

📋 **Checklist**
* [ ] Diferencia É UM de TEM UM.
* [ ] Implementou polimorfismo limpo.
* [ ] Usou `@Override` corretamente.

🔗 **Próximo passo**: Fixar contratos estritos usando Interfaces e Records.
