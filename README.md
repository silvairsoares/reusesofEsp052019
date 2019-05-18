# reuseSoftEsp052019
Repositório de atividades para exercícios para disciplina de Reuso de Software -Arquitetura e Engenharia de Software

## Observer

### Curiosidade
- Push vs Pull
- Existem variações de Observable Pattern

### Problema
Problema: 
Em Goiânia existe uma estação de coleta de informações metereológicas (Temperatura, Pressão e Umidade). Cada vez que é feita uma leitura de qualquer uma das informações, alguns interessados (ClimaTempo, Inmet, Campos Universitários etc) gostariam de ser notificados.

Dados de entrada:
- Uma estação que colete as 3 informações (temperatura, pressão e umidade) independentes uma da outra
- Quando houver modificação notificar os interessados

Regra de negõcio: 
- As leituras devem ser feitas independente uma da outra.
- Os interessados podem pedir as informações para a estação.

