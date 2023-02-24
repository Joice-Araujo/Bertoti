1. O que é engenharia de sofware?

We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play.On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth.

- Na engenharia de software identifica-se a necessidade de desenvolver um software que envelheça bem, não só atendendo as necessidades que a organização tem no momento, como também suas demandas futuras. Fazendo boas escolhas não só quanto a qual linguagem se adequa melhor, como também aos requisitos funcionais e não funcionais, sabendo que muitas decisões são difíceis, e que as vezes é preciso abrir mão de alguma funcionalidade para ganhar outra.

1.1 Qual a relação de engenharia de software com programação?

facilitar a vida do programador no futuro e do usuário final.
programção com tempo, escala e trade-offs.

Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming  is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming.

- A engenharia de software diferente da programação ela não ira apenas desenvolver, vai se dividir em categorias importantes para guiar a construção do software, como pensar em possiveis modificações que podem ser necessárias, se a manutenção desse software vai ser possível ou se ele precisará ser reescrito, o tempo (blibiotecas, tecnologias, vida útil) são pontos a serem considerados. Um exemplo foi a API do primeiro semestre, que se tivesse passado por um tempo de planejamento maior, não só os requisitos teriam sido compreendidos com  clareza e a entrega seria feita de forma mais simples, facilitando a própia programação em si, já que como era o primeiro semestre muitas pessoas estavam tendo seu primeiro contato com a programação e as tecnologias usadas como também em um aprendizado mais tranquilo já que esse era o principal objetivo.   


Bibliografia: Livro Software Engineering at Google : Lessons Learned from Programming Over Time
https://abseil.io/resources/swe-book

2. O que são requitos ou o que é requisito?
Necessidade do cliente, o que ele deseja que tenha ou como ele quer que seja seu site por exemplo. 
 <!--  -->

2.1 Requisitos funcioniais 
- É tudo aquilo que se vê, que se usa, geralmente usados verbos no infinitivo para descrevelos, como: salvar, excluir, editar, gerar relatórios, etc.
<!-- Ações, tarefas que o sistema realiza -->

2.2 Requisitos não funcionais
- Eles não são vistos, qualidades do sistema, porém são percebidos como a usabilidade de um site, segurança, acessibilidade, escalabilidade, espressados com adjetivos. 
<!--  -->
Desafio 
Escreva dois exemplos de trade-offs envolvendo requisitos não funcionais.
- Escolha de banco de dados, um exemplo seria o duckdb onde ele atenderia grandes alterações simultâneas em várias tabelas grandes, por exemplo, anexando linhas, adicionando/removendo/atualizando colunas porém não seria uma escolha para casos de uso transacionais de alto volume (por exemplo, rastreamento de pedidos em uma loja virtual) como já é descrito no próprio site.
<!-- banco de dados não relacionais, relacionais, depende das buscas.  -->

- Escolha de linguagem, java uma linguagem para portabilidade, python muito usado para raspagem de dados , tudo depende da sua  necessidade.
outro ex: performance vs curva de aprendizagem, rust, go.



