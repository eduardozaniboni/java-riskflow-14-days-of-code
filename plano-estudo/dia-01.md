# Dia 01 — Pensando em Java: Variáveis, Tipos e o Primeiro Objeto

🎯 **Objetivo do dia**: Entender o que realmente é um objeto na memória e diferenciar tipos primitivos de wrappers.

📖 **Conceito**
* Um objeto não é apenas "dados". Ele tem estado (atributos) e comportamento (métodos).
* Tipos primitivos (`int`, `double`) guardam valor direto. Wrappers (`Integer`, `Double`) guardam referência para um objeto na memória, permitindo valores nulos e métodos auxiliares.
* `final` em variáveis não congela os atributos do objeto, congela apenas a **referência** (a seta que aponta para a memória).

🏦 **No RiskFlow**
No sistema, um `Cliente` não é apenas um ID. É um objeto vivo. Uma `Conta` não é uma struct de dados, ela deve garantir sua própria consistência.

✍️ **Escreva do zero**
Crie uma classe `Conta` com saldo (`BigDecimal`), titular (`Cliente`), e status (`enum` com ATIVA, BLOQUEADA). Tudo deve ser `private`. Crie um construtor que exija todos os dados (nenhuma conta nasce vazia). Não copie, apenas escreva. Crie uma classe `Main` com o método `main` para instanciar a `Conta`.

⚖️ **Compare e justifique**
Se eu criar `final Conta c = new Conta()`, posso usar `c.setSaldo(novoSaldo)`? Sim. Posso fazer `c = new Conta()` novamente? Não. Por quê?

🎤 **Entrevista Check (Fale em voz alta)**
"Qual a diferença entre tipo primitivo e wrapper? Quando usar cada um?"

🚫 **Anti-padrão do dia**
Usar `double` para dinheiro (gera erros de arredondamento IEEE 754). O correto é `BigDecimal`.

📋 **Checklist**
* [ ] Diferencia primitivos de wrappers.
* [ ] Entende `final` em variáveis locais.
* [ ] Construtor bem definido.

🔗 **Próximo passo**: Amanhã organizaremos essas classes em pacotes e protegeremos seu acesso (Encapsulamento).
