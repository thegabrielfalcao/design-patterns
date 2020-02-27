# Design Patterns
Olá!

Esse repositório irá conter alguns **design patterns** com alguns exemplos aplicados e implementados dos mesmos.

A intenção desse repositório é servir de estudo e consulta, uma vez que eu vá aprimorando e aprendendo novos padrões de design, porém espero que não sirva apenas para mim.

Meus dois principais guias nesses estudos foram o site **Refactoring Guru**, que é um excelente site com exemplos em diversas linguagens para design patterns e refatoração, e o curso da **Alura** de **Design Patterns com Java**, onde o professor Maurício explica o conceito e consigo ver em uma aula sua aplicação.

A maioria (se não todos) dos design patterns nos pacotes conterão exemplos desses dois sites, além de um exemplo que criei a partir do momento em que eu estudava, ou de um exercício encontrado na internet.

Minhas principais intenções com o aprendizado desses padrões são eliminar os ifs desnecessários, aumentar a reusabilidade e evitar a duplicação de código.

> **Observação:** Aconselho que estude as motivações e as formas de implementar os design patterns por fora, e use esse 
repositório apenas para ver como foi implementado nos exemplos que commitei.

## Index

- Padrões Comportamentais
    - [Strategy](#Strategy)
    - [Chain of Responsability](#Chain-of-Responsability)
    - [Template Method](#Template-Method)
    - [State](#State)
- Padrões estruturais
    - [Decorator](#Decorator)

## Behavioral patterns (Padrões comportamentais)

### Strategy
No pacote do **Strategy** temos dois exemplos, um criado por mim, que é uma calculadora bem simples.
Nesse caso específico em vez de receber uma *String* com o nome da operação, 
e ter quatro *ifs* para cada operação possível nessa calculadora, eu crio uma interface que chamo
de **OperacaoMatematica** e abstraio cada operação para uma classe, por exemplo:

A classe **Subtracao** irá implementar a interface, obrigando a essa classe ter o método **calcular()**, e dentro desse
método calcular da classe **Subtracao** irá ter a operação que subtrairá o primeiro número com o segundo.

Isso será feito com todas as quatro classes (Subtracao, Adicao, Multiplicacao e Divisao), 
alterando apenas a forma como a implementação é feita.

O outro exemplo é a solução para o seguinte exercício:

*1. Escreva um programa que descubra o dia da semana e, repasse o controle para
 uma estratégia específica:*

- *A estratégia deve imprimir a mensagemDoDia() correspondente ao dia
 da semana.*

- *Para descobrir o dia da semana crie um new GregorianCalendar() para
 obter a data corrente e use get(Calendar.DAY_OF_WEEK) para obter o
 dia da semana (de 0 a 6)*
 
Para solucionar esse exercício utilizei o mesmo modelo, criei uma interface *MensagemDoDia* que abstrai todas as 
implementações, criei uma classe concreta para cada dia da semana que irá devolver uma *String* diferente para tal dia,
a única diferença aqui é na classe *Context*, onde preferi utilizar um **enum** que receberá o id do dia da semana e
devolverá a instância do dia corretamente, escrevendo o texto para o dia da semana que for.

![Strategy Image](https://refactoring.guru/images/patterns/diagrams/strategy/structure.png)

**UML do pattern Strategy**

![Strategy Calculadora Image](https://i.imgur.com/PQ2zqPD.png)

**UML do exemplo que criei**

### Chain of Responsability
No pacote referente ao **Chain of Responsability** iremos encontrar quatro exemplos, um 
da **Alura**, um do **Refactoring Guru**, um que criei onde simula uma máquina de vendas e 
por último um exemplo que tirei da *cachola* a fim de passar uma reclamação para a área responsável.

Tal pattern consiste em abstrairmos em uma interface ou em uma classe abstrata (para unirmos
o *boiling plate code*) uma execução que será implementada por todos os **handlers**. 
Os **handlers** serão classes concretas que terão comportamentos específicos. Como se trata de uma **cadeia**, ou de um 
**fluxo**, a ideia é que cada **handler** execute seu comportamento e passe para o próximo **handler** da cadeia, até que
se quebre por algum motivo ou passe por todo esse fluxo que foi definido.

Por exemplo o código da Alura, é simulado que existam produtos em um orçamento, e você poderá ganhar desconto
dependendo da quantidade de itens ou do valor total dos itens que você tiver no seu orçamento.

Nossa cadeia será abstraida por uma interface chamada de **Desconto**, e as classes concretas (**DescontoPorCincoItens**, 
**DescontoValorMaiorQuinhentosReais** e **SemDesconto**) serão responsáveis por verificar se esse orçamento é passível
de desconto ou não, caso seja a classe responsável por essa verificação irá retornar o desconto do orçamento, caso não 
irá chegar na classe **SemDesconto** onde retornará 0.

O exemplo da Alura é mais tranquilo e legal de se ver funcionando o **Chain**, entretanto o exemplo do Refactoring Guru, 
que inclusive usei de base para solucionar os outros exemplos que resolvi, é mais elegante pois vemos o boiling plate
apenas na classe abstrata, ao contrário da Alura que utiliza interface, te obrigando a reescrever esse código. 

### Template Method

### State

## Structural patterns (Padrões estruturais)

### Decorator

No pacote **Decorator** estão dois exemplos, um do site Refactoring Guru, outro foi um exercício que encontrei na internet
onde deveria solucionar utilizando o pattern **Decorator**.

Tal pattern consiste em uma interface (*component*) que será implementado pelo o que chamamos de *concrete component*. 
O *concrete component* conterá a função principal do que queremos fazer (ficará mais claro com os exemplos abaixo). 
Teremos também o que chamaremos de *base decorator* onde também implementará o *component* e servirá de base para os
*concrete decorators*.
Os *concrete decorators* serão responsáveis por mudar o comportamento antes que ocorra a principal função que deverá ocorrer
(código que fica no *concrete component*).

No site Refactoring Guru foi-se utilizado um exemplo onde se irá escrever um arquivo (*concrete component*), e antes
que isso ocorra, ou seja, antes de escrever o arquivo, iremos usar os *concrete decorators* para podermos, se quisermos,
criptografar e/ou comprimir o arquivo.

No exercício que fiz foi para resolver o seguinte exercício:

*Crie um objeto simples que armazene um texto que possa ser recuperado com
um método getTexto(). Crie decoradores que retornem o texto: a) em caixa-alta,
b) invertido e c) cercado por tags \<b> e <\/b>. Teste os decoradores
individualmente e em cascata.*

Para a solução acima o *concrete component* terá a única responsabilidade de retornar uma *String*, ou seja, o texto que
eu passar para essa classe irá me retornar a mesma, porém além disso existem os decorators, que nesse caso irão mudar o
comportamento principal de retornar essa String, ou seja, agora eu tenho uma classe específica para tornar o texto em 
caixa alta, tornar esse texto tagueado, e tornar esse texto invertido, podendo utilizar nenhum, um ou todos esses decorators 
para retornar o texto da forma que eu bem entender.


![Decorator Image](https://refactoring.guru/images/patterns/diagrams/decorator/structure.png)

**UML do pattern Decorator**

![Decorator Image Exemplo](https://i.imgur.com/GbZ1j9s.png)

**UML gerado para o exercício que solucionei**