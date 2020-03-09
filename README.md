# Design Patterns
Olá!

Esse repositório irá conter alguns **design patterns** com alguns exemplos aplicados e implementados dos mesmos.

A intenção desse repositório é servir de estudo e consulta, uma vez que eu vá aprimorando e aprendendo novos padrões de design, porém espero que não sirva apenas para mim.

Meus dois principais guias nesses estudos foram o site **[Refactoring Guru]**, que é um excelente site com exemplos em diversas linguagens para design patterns e refatoração, e o curso da **[Alura]** de **Design Patterns com Java**, onde o professor Maurício explica o conceito e consigo ver em uma aula sua aplicação.

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
    - [Observer](#Observer)
- Padrões estruturais
    - [Decorator](#Decorator)
- Padrões criacionais
    - [Builder](#Builder)
    - [Factory Method](#Factory-Method)

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
da **[Alura]**, um do **[Refactoring Guru]**, um que criei onde simula uma máquina de vendas e 
por último um exemplo que tirei da *cachola* a fim de passar uma reclamação para a área responsável.

Tal pattern consiste em abstrairmos em uma interface ou em uma classe abstrata (para unirmos
o *boiling plate code*) uma execução que será implementada por todos os **handlers**. 
Os **handlers** serão classes concretas que terão comportamentos específicos. Como se trata de uma **cadeia**, ou de um 
**fluxo**, a ideia é que cada **handler** execute seu comportamento e passe para o próximo **handler** da cadeia, até que
se quebre por algum motivo ou passe por todo esse fluxo que foi definido.

Por exemplo o código da [Alura], é simulado que existam produtos em um orçamento, e você poderá ganhar desconto
dependendo da quantidade de itens ou do valor total dos itens que você tiver no seu orçamento.

Nossa cadeia será abstraida por uma interface chamada de **Desconto**, e as classes concretas (**DescontoPorCincoItens**, 
**DescontoValorMaiorQuinhentosReais** e **SemDesconto**) serão responsáveis por verificar se esse orçamento é passível
de desconto ou não, caso seja a classe responsável por essa verificação irá retornar o desconto do orçamento, caso não 
irá chegar na classe **SemDesconto** onde retornará 0.

O exemplo da [Alura] é mais tranquilo e legal de se ver funcionando o **Chain**, entretanto o exemplo do [Refactoring Guru], 
que inclusive usei de base para solucionar os outros exemplos que resolvi, é mais elegante pois vemos o boiling plate
apenas na classe abstrata, ao contrário da [Alura] que utiliza interface, te obrigando a reescrever esse código. 

### Template Method

No pacote referente ao **Template Method** temos dois exemplos até o momento, um do [Refactoring Guru] 
e outro criado por mim.

Tal pattern consiste em utilizarmos uma classe abstrata que servirá como esqueleto, onde teremos o,
de fato, *template method*, que será o método que definirá o fluxo principal, e diversos outros métodos
que serão (não obrigatoriamente) abstratos e utilizados dentro do *template method*. Classes concretas deverão extender 
desta classe abstrata e dar sua própria implementação dos métodos abstratos, porém seguirá o fluxo definido no *template method*.

Como sou péssimo explicando, vamos ao exemplo abaixo:

No exemplo do [Refactoring Guru] devemos imaginar que queremos trabalhar com diferentes redes sociais,
como por exemplo o Twitter e o Facebook, e queremos efetuar certas ações com as duas redes sociais.

Temos então a classe **Network**, que é a classe abstrata onde teremos o método *post()*. Esse método
contém as regras do que iremos fazer que no caso são: 

- Logaremos na rede
- Caso tenhamos sucesso ao logar, iremos enviar uma mensagem e logo após deslogar
- Caso a mensagem seja enviada com sucesso, iremos retornar *true* no método, caso contrário *false*
- Caso não tenhamos sucesso, apenas retornaremos *false* no método

Perceba que temos esse fluxo a ser respeitado, mas a forma de se logar, enviar mensagem e efetuar o logout
será diferente em cada rede social, logo abstraimos esses comportamentos para métodos abstratos dentro da classe **Network**
e deixaremos as classes concretas responsáveis por cada rede social implementar da sua forma.

Logo teremos as classes **Facebook** e **Twitter** extendendo de **Network**, que irão obrigatoriamente manter 
o método *post()* porém irão reescrever os métodos de logar, enviar mensagem e de logout.

>Acho legal ressaltar que no caso do Facebook adicionamos um novo step dentro do logIn(), sem influenciar em
>nada o fluxo do método *post()*

O que achei legal nesse pattern foi a facilidade de criarmos outras classes que seguirão esse método,
por exemplo no case do [Refactoring Guru] caso desejássemos adicionar novas redes sociais, apenas deveríamos 
criar uma classe para cada rede social nova, extender de **Network**, reescrever os métodos e pronto, já estaria apto a 
ser utilizado pelo cliente desse método!

![TemplateMethod Image](https://refactoring.guru/images/patterns/diagrams/template-method/structure.png) 

**UML do pattern Template Method**

![TemplateMethod RefactoringGuru Image](https://image.prntscr.com/image/L3CXJYgLRuaO7UN3dNNnIQ.png)

**UML do exemplo do site Refactoring Guru**

### State

No pacote **State** temos dois exemplos, ambos do [Refactoring Guru], sendo que um é a cópia
do exemplo deles em Java, já o segundo eu passei o exemplo deles em *pseudocode* para o Java.

Parafraseando esse site, o pattern **State** consiste em permitir que um objeto mude seu comportamento
quando seu estado interno for alterado. Tal site utiliza uma ótima analogia para que possamos entender esse pattern:

Os botões de um smartphone se comportam de forma diferente dependendo do estado atual do seu dispositivo:

- Quando o aparelho está desbloqueado, esses botões podem executam várias funções
- Quando o aparelho está bloqueado, pressionar qualquer botão leva o aparelho a desbloquear a tela
- Quando o aparelho está sem bateria mas carregando, pressionar qualquer botão mostra a tela com ele carregando

Esse exemplo é uma ótima forma de entendermos o pattern **State**.

No pacote **anotherrefactoringguru** está implementado um exemplo onde um usuário pode publicar um texto, mas existem 
algumas regras:

- Tal documento pode estar em três estágios: **Draft**, **Moderation** ou **Published**. Tais estágios foram abstraidos para
classes.

- O texto ao ser criado sempre passará pelo estado de **Draft**, porém: 

    - Caso o usuário que o publicou seja administrador ele irá alterar o estado do texto para **Published** 
    (Visto que um admin não precisa de permissão para publicar).
    
    - Caso o usuário não seja um administrador, tal documento irá passar para o estado de **Moderation**, e só sairá desse
    estado quando algum usuário administrador publicá-lo (simulando uma aprovação).

Dessa forma utilizamos a composição para alterar os estados dentro de um objeto, onde os estados que estão abstraidos 
em classes tem a visibilidade do objeto que os contém para que eles possam intercambiar de um estado para outro.

![State Image](https://refactoring.guru/images/patterns/diagrams/state/structure-en.png) 

**UML do pattern State**

![State Example Image](https://image.prntscr.com/image/cPvRDqVBQaKc8DBLuFug_w.png) 

**UML do pacote anotherrefactoringguru implementando o State**

### Observer

## Structural patterns (Padrões estruturais)

### Decorator

No pacote **Decorator** estão dois exemplos, um do site [Refactoring Guru], outro foi um exercício que encontrei na internet
onde deveria solucionar utilizando o pattern **Decorator**.

Tal pattern consiste em uma interface (*component*) que será implementado pelo o que chamamos de *concrete component*. 
O *concrete component* conterá a função principal do que queremos fazer (ficará mais claro com os exemplos abaixo). 
Teremos também o que chamaremos de *base decorator* onde também implementará o *component* e servirá de base para os
*concrete decorators*.
Os *concrete decorators* serão responsáveis por mudar o comportamento antes que ocorra a principal função que deverá ocorrer
(código que fica no *concrete component*).

No site [Refactoring Guru] foi-se utilizado um exemplo onde se irá escrever um arquivo (*concrete component*), e antes
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

## Creational patterns (Padrões criacionais)

### Builder

No pacote **Builder** temos três exemplos, um do [Refactoring Guru], um da [Alura] e outro criado por mim.

Tal pattern consiste na criação de objetos complexos de forma simplificada, evitando utilizar o inúmeros **set...()** ou
um construtor gigantesco com várias referências nula.

Para exemplificar utilizarei o exemplo da Alura, onde nosso problema é criar o objeto NotaFiscal. Tal objeto contém 
inúmeros atributos e cairíamos exatamente nos problemas citados acima, e solucionaremos isso com o pattern **Builder**.

Criamos uma classe chamada **NotaFiscalBuilder**, essa classe será responsável por criar os objetos NotaFiscal. Tal classe
conterá todos os atributos que o **NotaFiscal** tem. Tal builder irá ter um método valorar cada atributo do NotaFiscal, porém
esses métodos retornarão o próprio **NotaFiscalBuilder** para que possamos setar um valor atrás do outro, e por fim chamar o método
**construir()** que retornará uma referência do objeto **NotaFiscal**.

Para ficar mais fácil a visualização, note a implementação
pelo client abaixo:

![Implementation Builder](https://image.prntscr.com/image/ZQQEkuu6S2WonxHoY049sA.png)

Tal pattern é ótimo para criação dos objetos complexos. Vale ressaltar que existe uma classe opcional que podemos
utilizar chamada de **Director**, tal classe conteria o builder e retornaria uma instância que ocorre a todo momento no sistema.

Podemos observar o exemplo de utilização dessa classe opcional nos pacotes **refactoringguru** e **gabrielfalcao**.

![UML Builder](https://refactoring.guru/images/patterns/diagrams/builder/structure.png)

**UML do pattern Builder**

![UML Implementation Builder](https://image.prntscr.com/image/5uODOJymSr6-Jjkj4U5q6Q.png)

**UML do exemplo da Alura**

### Factory Method

[Refactoring Guru]: https://refactoring.guru/
[Alura]: https://www.alura.com.br/
