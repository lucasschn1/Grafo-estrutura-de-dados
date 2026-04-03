# Sistema de Recomendação de Livros com Grafos 📚

Projeto acadêmico desenvolvido como Atividade Somativa para a disciplina de Estrutura de Dados no curso de Análise e Desenvolvimento de Sistemas. O objetivo é aplicar os conceitos matemáticos e lógicos de **Grafos** na prática, construindo o motor central de um sistema de recomendação.

## Sobre o Projeto

O sistema simula o comportamento de plataformas digitais ao recomendar leituras baseadas no histórico do usuário. Para isso, foi utilizada a estrutura de **Grafos Direcionados** implementada através de uma **Lista de Adjacência**. 

* **Nós (Vértices):** Representam os livros disponíveis no catálogo (instâncias da classe `Livro`).
* **Arestas (Conexões):** Representam as recomendações diretas de uma obra para outra.

O coração do sistema é construído em Java nativo, utilizando a estrutura de Lista de Adjacência através de um HashMap<Livro, Set<Livro>>. O uso de Set garante uma busca rápida e otimizada das recomendações dentro da memória, evitando o uso de laços de repetição complexos ao consultar os vizinhos de cada nó.

## Estrutura de Arquivos

O projeto não utiliza pacotes complexos ou dependências externas, mantendo o foco na lógica algorítmica.

```text
sistema-recomendacao/
└── src/
    ├── Livro.java  # Classe de modelo (Nó), contém os atributos
    ├── Grafo.java  # Estrutura de dados que gerencia o HashMap e a criação de arestas.
    └── Main.java   # Classe executável que povoa o grafo com 10 livros e simula recomendações.
