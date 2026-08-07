# Dia 09 — JPA e Hibernate: Objetos que Viram Tabelas

🎯 **Objetivo do dia**: Mapear as regras de negócio para o banco relacional (PostgreSQL) usando ORM, respeitando ACID.

📖 **Conceito**
* **ORM:** Mapeia objetos Java para tabelas (resolve o Impedance Mismatch).
* **Anotações core:** `@Entity`, `@Id`, `@GeneratedValue`.
* **Relacionamentos:** `@OneToMany`, `@ManyToOne`.
* **Lazy vs Eager:** Eager carrega as dependências junto. Lazy só carrega quando o `get()` é chamado (cuidado com N+1).
* **ACID:** Atomicidade, Consistência, Isolamento, Durabilidade (Garantido pelo BD + `@Transactional`).

🏦 **No RiskFlow**
A `Conta` e as `Operacao`s agora devem ser salvas no Postgres.

✍️ **Escreva do zero**
1. Anote `Conta` e `Operacao` com `@Entity` e coloque `@Id`.
2. Crie a relação na `Operacao`: `@ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "conta_id") private Conta conta;`
3. Crie `OperacaoRepository extends JpaRepository<Operacao, Long>` com o método `List<Operacao> findByContaId(Long contaId);`.
4. No Service, salve uma operação usando o repository. Anote o método do Service com `@Transactional`.

⚖️ **Compare e justifique**
Por que usar `JPA` é mais produtivo que fazer `INSERT INTO` via JDBC puro, mas exige profundo entendimento do Hibernate por baixo dos panos?

🎤 **Entrevista Check**
"O que é N+1 problem? Como evitar? Explique ACID e por que é importante em sistemas financeiros."

🚫 **Anti-padrão do dia**
Usar `FetchType.EAGER` em `@OneToMany`. Isso carrega o banco de dados inteiro na memória e trava o sistema.

📋 **Checklist**
* [ ] Entidades mapeadas corretamente.
* [ ] Entende `@Transactional`.
* [ ] Compreende o perigo do problema N+1.

🔗 **Próximo passo**: Expor esses dados para o mundo via API REST.
