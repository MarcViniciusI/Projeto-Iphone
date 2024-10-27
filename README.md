# Projeto: Simulação de iPhone com Funções Multimídia, Telefone e Navegador
Este projeto em Java implementa uma simulação de algumas funcionalidades principais do iPhone: reprodutor musical, aparelho telefônico e navegador de internet. A estrutura utiliza interfaces para representar cada funcionalidade, promovendo flexibilidade e modularidade.

## Estrutura do Projeto
O projeto contém as seguintes interfaces e classe:

#### Interfaces:

MusicaPlayer: Define métodos para a funcionalidade de reprodutor musical, como tocar, pausar e avançar a música.

Telefone: Define métodos para a funcionalidade de telefone, como fazer e encerrar chamadas.

WebBrowser: Define métodos para a funcionalidade de navegador, como abrir e fechar páginas da web.

#### Classe:
iPhone: Implementa as três interfaces (MusicaPlayer, Telefone, e WebBrowser) e fornece a implementação dos métodos para simular o comportamento de um iPhone.
Estrutura do Código
Cada interface declara um conjunto de métodos abstratos, e a classe iPhone implementa todos esses métodos utilizando a anotação @Override. Com isso, a classe iPhone cumpre o contrato de cada interface, oferecendo todas as funcionalidades.

## Funcionalidades
Reproduzir Música: Possibilidade de tocar, pausar e avançar para a próxima faixa.
Telefone: Realizar e encerrar chamadas simuladas.
Navegador Web: Abrir e fechar uma página da web.
## Tecnologias Utilizadas
Java: Linguagem principal do projeto, explorando conceitos de interfaces, polimorfismo e classes concretas.
## Licença
Este projeto é de uso livre para fins educacionais da DIO.
