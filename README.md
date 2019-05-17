# reuseSoftEsp052019
Repositório de atividades para exercícios para disciplina de Reuso de Software -Arquitetura e Engenharia de Software

## Abstract Factory

### Curiosidade
- Mesmo conceito do Factory Method, contudo, esse padrão é uma fábrica de objetos que constrói vários tipos de objetos.
- Faz sentido somente quando dois tipos de objetos 

### Problema
Problema: 
Uma empresa de transportes deve preparar seus veículos para transportes de carga. Cada preparação consiste em adequar o módulo de cargas (carroceria) e aplicar um seguro adequado para a carga transportada. Os tipos de carga trasnportadas pela empresa são:
- Carga viva (gado, porco)
- Combustível 
- Matéria orgânica (milho e soja)

Dados de entrada:
- Tipo de transporte a ser realizado.

Regra de negõcio: 
- Para cada "viagem" o caminhão deve ser preparado com:
-- Carroceria específica
-- Seguro adequado ao tipo de mercadoria transportada
