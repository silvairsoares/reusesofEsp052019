# reuseSoftEsp052019
Repositório de atividades para exercícios para disciplina de Reuso de Software -Arquitetura e Engenharia de Software

## Decorator

### Curiosidade
- Um Decorator é um Component
- Um Decorator tem um Component
- Ajuda na garantia do principio da segregação da interface

### Problema
Problema: Restaurante famoso cQG possui 2(dois) pratos definidos:
- Prato A: R$ 10,00
- Prato B: R$ 12,00

O restaurante também permite adicionar adicionais individualmente e em números indeterminados.
Os adicionais são
- 1 (um) ovo frito: R$ 1,50
- 50 (cinquenta) gramas de cebola frita: R$ 1,00

Pergunta de R$ 1.000.000...
É possível resolver esse problema com uma solução Decorator ?

Dados de entrada:
- Prato A + 2 adicionais de ovo.
- Prato A + 1 adicional de cebola.
- Prato B sem adicionais


Regra de negõcio: 
- Adicional só é possível depois que escolher um dos pratos definidos.
