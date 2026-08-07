# 🔄 Workflow e Rotina de Estudos

Este documento define como o código será versionado no Git e alinha as expectativas sobre o tempo real de conclusão de cada etapa do plano.

## 🕰️ O Mito do "Dia": Rotina vs Calendário

**Um "Dia" no plano de estudo NÃO significa 24 horas no calendário real.**

A vida acontece: você trabalha, estuda e tem outras obrigações. É perfeitamente normal, e até esperado, que o "Dia 01" demore 3, 4 dias ou até uma semana para ser finalizado. Não se coloque a pressão de terminar um arquivo por dia.

* **Consistência > Velocidade:** O aprendizado profundo leva tempo. É preferível codar 30 minutos por dia e terminar um ciclo na sexta-feira, do que tentar virar a madrugada, não entender a essência, e abandonar o plano.
* O "Dia" é apenas uma **unidade de escopo**. Considere como um "Módulo" ou "Fase". Avance para a próxima fase apenas quando estiver confortável com a atual, independentemente do tempo que passou no calendário.

## 🌿 Estratégia de Branches (Feature Branching)

Para mostrar organização de nível Sênior no seu GitHub, não commitaremos tudo direto na `main`. Usaremos a abordagem de **Feature Branching**:

1. A branch `main` será a sua base segura. O código nela sempre deve compilar.
2. Ao iniciar uma nova etapa, você cria e muda para uma nova branch baseada na `main`:
   ```bash
   git checkout main
   git checkout -b feat/dia-01
   ```
3. Trabalhe, faça testes e comite nessa branch durante a semana.
4. Quando finalizar o objetivo daquele dia e validar que está funcionando, "feche" o ciclo fazendo o merge de volta:
   ```bash
   git checkout main
   git merge feat/dia-01
   ```

## 📝 Padrão de Commits (Conventional Commits)

Cada mensagem de commit deve contar uma história clara do que foi feito. Use os prefixos abaixo:

* `feat:` Nova funcionalidade ou novo exercício resolvido.
  * *Ex: `feat: criacao das classes de dominio Conta e Cliente`*
* `fix:` Correção de algum bug ou problema.
  * *Ex: `fix: resolve NullPointerException ao buscar operacoes sem data`*
* `refactor:` Melhoria de código que não muda o comportamento final, apenas a estrutura.
  * *Ex: `refactor: converte classes de DTO para Records (Dia 04)`*
* `docs:` Alterações em documentação (Markdown, README, etc).
  * *Ex: `docs: adiciona plano de estudos e regras de workflow`*
* `chore:` Tarefas de configuração, dependências ou ferramentas (Docker, Pom.xml).
  * *Ex: `chore: configura docker-compose com postgres e redis`*

**Como fazer na prática:**
```bash
git add .
git commit -m "feat: implementa interface polimorfica para validacao de risco"
```
