# reuseSoftEsp052019

## Factory Method
Repositório de atividades para exercícios para disciplina de Reuso de Software -Arquitetura e Engenharia de Software

### Motivações
- Desejar não ser responsável pela construção dos objetos (Injeção de dependência)
- Situações onde a instanciação de um objeto exige processamento ou algum tipo de lógica de negócios 
- A decisão de qual sub-tipo criar não é uma decisão trivial
- É melhor usar um objeto, do que decidir se devo ou não criar um objeto

### Problema 1
Problema: Definir qual o tipo de veículo criar em um cenário onde a quantidade de pessoas e o tempo são as questões mais importantes.

Dados de entrada:
- Condição metereológica {Sol, Chuva}
- Quantidade de pessoas 

Regra de negõcio: 
- Só cria objeto para distâncias até 500 km
- Para até 2 (duas) pessoas criar um Tesla Roadster Eletricidade
- Para até 5 (cinco) pessoas e tempo de Sol, criar um Escort Xr3 conversível Alcool (Carro conversível)
- Para até 5 (cinco) pessoas e tempo de Chuva, criar um Opala a gasolina (Carro convencional)
- Para mais de 5 (cinco) pessoas e menos de 20 (vinte) pessoas, criar uma Besta a Diesel (Van)

Extensão do problema: O cenário mudou. Agora os caminhoneiros estão em greve e todo abastecimento de combustível fóssil foi interrompido. O principal critério é o tipo de combustível
