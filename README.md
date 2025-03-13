## Sistema de atendimento de chamados

O sistema gerencia o fluxo de incidentes reportados por clientes, encaminhando-os para equipes especializadas com base no tipo do problema.

---

## Padrões de projeto 
| Padrão                      | Classes Envolvidas                          |
|-----------------------------|---------------------------------------------|
| **Singleton**               | Garante que exista apenas uma instância para cada tipo e estado do incidente, para cada equipe e para o suporte técnico. |
| **State**                   | Controla o ciclo de vida dos incidentes, permitindo transições entre estados como Reportado, Em Análise e Resolvido. |
| **Observer**                | Notifica os clientes sobre mudanças no status de seus chamados.|
| **Strategy**                | Permite que diferentes estratégias de resolução sejam aplicadas a cada tipo de incidente. |
| **Template Method**         | Define um fluxo base para tratamento de incidentes nas equipes, permitindo customizações. |
| **Mediator**                | O suporte técnico atua como mediador entre clientes e a equipe técnica. |
| **Chain of Responsibility** | Garante que cada equipe atue somente nos incidentes que correspondem à sua área de especialização, repassando para outra equipe se necessário. |
| **Visitor**                 | Facilita a exibição das informações do incidente sem modificar sua estrutura interna, permitindo diferentes representações do mesmo objeto. |
| **Memento**                 | Mantém um histórico das mudanças de estado do incidente, permitindo a restauração para estados anteriores caso necessário. |
