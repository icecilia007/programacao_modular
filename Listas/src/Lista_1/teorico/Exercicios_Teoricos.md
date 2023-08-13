# Respostas Exercicios Teoricos
### por: Izabela Cecilia

13. O que é um método em um código de um sistema de informação?
> Métodos são semelhantes a funções e procedimento de algoritmos, em POO eles mudam o estado de um objeto, funcionam como meio de comunicação.  É usado para encapsular a lógica e a funcionalidade de um programa em unidades autônomas e reutilizáveis, por exemplo:
>> Em todo momento do codigo existe a necessidade de printar algo e sempre repete a mesma estrutura, como algo assim <p> for(Objeto i : objeto){ <p> printf(i.getName()) <p> } <p> Para melhorar visualiação e outros fatores deve de modulararizar a impressoão, fazendo algo como: <p> public void imprimir(Objeto i)
14. Por que é aconselhável dividir sistemas em métodos separados uns dos outros?
> Existem vários motivos, como:
> + Clean Code e Legibilidade;
> + Facilidade para teste;
> + Facilidade de Manutenção;
> + Depuração
> + Melhoria de Qualidade
> + Reutilização de Código
15. Defina o que é um parâmetro utilizado em um método Java. Depois de definir, explique por que é importante termos parâmetros em métodos.
> Um parâmetro é uma váriavel que pode ser passada para o método e recebe seu valor quando é chamado, exemplo:
>> <p> public int somar(int a, int b) <p> Neste caso, temos 2 pâmetros do tipo inteiro.
> Um parâmetro é importante por várias razões, como: <p>
> + Generalização
> + Abstração
> + Flexibilidade
> + Comunicação de dados
> + Manutenção
16.  O que acontece com um dado passado por parâmetro para um método após a execução deste método?
>Uma cópia desse dado é pasado para o método como parâmetro e qualquer alteração feita dentro do método não altera o valor original e após a conclusão do método a copia é removidas da memória.
17. Para cada situação abaixo, cite estruturas de dados que você utilizaria em sistemas de informação que precisam destes dados para resolver o problema. Observe o exemplo para dar suas respostas: <p> **EXEMPLO:** Um praticante realiza uma série de exercícios em sua academia a cada dia da semana. <p> **RESP:** Cada entidade praticante pode ter um vetor ou lista estática com os dias da semana (que é um dado conhecido e imutável). Cada dia da semana conterá uma fila de exercícios a serem feitos, assumindo que a ordem deles é importante.
> 1. Uma oficina mecânica realiza diversos serviços em automóveis. Cada automóvel pode ter recebido muitos serviços ao longo de sua existência. Um automóvel está sempre associado a um proprietário, que pode ser pessoa física ou jurídica (empresa).
>> **Classe Automóvel** <p> Nessa classe teria o modelo do carro, ano, placa, referência ao proprietáio e uma lista de serviços para armezenar todos os serviços realizados no automóvel, algo como ArrayList. <p> **Classe Propriétario** <p> Nessa classe teria informações do proprietário como nome, CPF/CNPJ, endereço, e etc. <p> **Classe Serviço** <p> Nessa classe teriamos informações do serviço oferecido pela mecânica, como descrição, data, valor e etc. <p> **Classe Oficina** <p> Nessa classe teriamos uma representação da gerencia dos automóveis, teriamos um HashMap para associar o proprietario ao automovel.
> 2. Um candidato possui uma série de habilidades para se candidatar a vagas de emprego. Cada vaga tem suas habilidades específicas exigidas e deve possuir um conjunto de candidatos hábeis, destacando aquele que for mais adequado para a vaga no momento.
>> **Classe Candidato** <p> Nessa classe teriamos uma representação do candidato, com  nome, experiência e uma lista de habilidades que o mesmo possui. <p> **Classe VagaEmprego** <p> Nessa classe teriamos uma presentação da vaga de emprego, nela teriamos uma descrição, uma lista de habilidades requeridas, uma lista de candidatos e o candidato selecionado para a vaga.
> 3. Um posto de saúde atende a milhares de pacientes. O posto tem um calendário anual de vacinação e cada paciente possui um prontuário com as vacinas tomadas, incluindo seu nome, lote e data de aplicação.
>> **Classe Paciente** <p> Nessa classe teriamos uma representação do paciente, com nome, CPF, e um prontuário que seria uma lista das vacinas toamdas. <p> **Classe Vacina** <p> Nessa classe teriamos uma representação de uma vacina, com seu nome, lote, data de vencimento e data de aplicação. <p> **Classe CalendarioVacinacao** <p> Nessa classe teriamos uma representação do calendário de vacinação do posto, nela teriamos um HashMap das datas para se vacinar e as uma lista de vacinas que devem para serem aplicadas nessa data.