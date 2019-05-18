# reuseSoftEsp052019
Repositório de atividades para exercícios para disciplina de Reuso de Software -Arquitetura e Engenharia de Software

## Template Method

### Curiosidade
- Uso de herança e classes abstratas para "unir" as partes significantes
- Utilização de hook functions

### Problema
Problema: 
Na Receita Federal do Brasil toda consulta a dados de contribuinte é rastreada. Nesse cenário a Receita Federal adota dois procedimentos distintos dependendo da permissão do papel do Usuário que realiza a consulta. 
1 - Se o usuário que efetua a consulta é um fiscal da receita, então a consulta é registrada e são exibidos os dados do contribuinte. 
1 - Se a consulta não é feita por um fiscal da Receita a consulta é registrada em um repositório de operações ilegais e um aviso de consulta ilegal é exibido ao Usuário.

Dados de entrada:
- CPF válido

Regras de negócio:
- Somente um fiscal da Receita Federal pode efetuar consulta a um contribuinte
