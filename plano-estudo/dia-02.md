# Dia 02 — Encapsulamento e Organização: O DNA do Código Limpo

🎯 **Objetivo do dia**: Proteger o estado dos objetos e organizar pacotes usando mentalidade DDD.

📖 **Conceito**
* Modificadores de acesso: `public` (todos veem), `private` (só a classe vê), `protected` (pacote e filhas veem), `default` (só o pacote vê).
* Getters e setters não são obrigações burocráticas; eles servem para aplicar regras. Se não houver regra, pense se o atributo deveria mesmo ser exposto.
* DDD (Domain-Driven Design) organiza o código pelo negócio, não pelo framework. Em vez de pacotes genéricos como `models`, usamos pacotes que refletem áreas do sistema (ex: `dominio`, `infraestrutura`).

🏦 **No RiskFlow**
As classes `Cliente` e `Conta` criadas ontem fazem parte do domínio central (core) do sistema.

✍️ **Escreva do zero**
1. Crie uma estrutura de pacotes: `com.seu_nome.riskflow.dominio` e `com.seu_nome.riskflow.aplicacao`.
2. Mova `Conta` e `Cliente` para `dominio`.
3. No `setter` do saldo na classe `Conta`, lance uma exceção se alguém tentar atribuir um valor negativo (mesmo que básico).
4. Crie uma classe `ValidadorDocumento` no pacote `aplicacao`.
5. Tente acessar um atributo `private` ou `default` da `Conta` de dentro de `ValidadorDocumento` e veja o erro do compilador.

⚖️ **Compare e justifique**
Por que usar `dominio` em vez de criar um pacote `models` e um `controllers` logo de cara? (Dica: o sistema existe independente de ser web ou desktop).

🎤 **Entrevista Check**
"Por que encapsulamento é importante em sistemas financeiros?"

🚫 **Anti-padrão do dia**
Gerar getters e setters cegamente para todos os atributos (ferindo o encapsulamento ao expor todo o estado interno sem critério).

📋 **Checklist**
* [ ] Sabe o escopo de public, private, default, protected.
* [ ] Consegue gerar erro de compilação por escopo incorreto.
* [ ] Reorganizou as pastas.

🔗 **Próximo passo**: Como lidar com a evolução das operações? (Polimorfismo e Herança).
