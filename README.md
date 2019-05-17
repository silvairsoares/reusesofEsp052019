# reusesofEsp052019

## Factory Method
Repositório de atividades para exercícios para disciplina de Reuso de Software -Arquitetura e Engenharia de Software

### Motivações
- Desejar não ser responsável pela construção dos objetos (Injeção de dependência)
- Situações onde a instanciação de um objeto exige processamento ou algum tipo de lógica de negócios 
- A decisão de qual sub-tipo criar não é uma decisão trivial
- É melhor usar um objeto, do que decidir se devo ou não criar um objeto

### Problema
Dados de entrada:
- Condição metereológica {Sol, Chuva}
- Quantidade de pessoas 

Problema: De posse dos dados de entrada, definir qual o tipo de veículo criar.

Regra de negõcio: 
- Só cria objeto para distâncias até 500 km
- Só cria objeto para no máximo 20 pessoas 
- Para até 4 (quatro) pessoas e tempo de Sol, criar um Escort Xr3 conversível (Carro conversível)
- Para até 4 (quatro) pessoas e tempo de Chuva, criar um Opala (Carro convencional)
- Para mais de 4 (quatro) pessoas, criar uma Besta (Van)
