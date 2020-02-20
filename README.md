# Design Patterns
Olá!

Esse repositório irá conter alguns **design patterns** com alguns exemplos aplicados e implementados dos mesmos.

A intenção desse repositório é servir de estudo e consulta, uma vez que eu vá aprimorando e aprendendo novos padrões de design, porém espero que não sirva apenas para mim.

Meus dois principais guias nesses estudos foram o site **Refactoring Guru**, que é um excelente site com exemplos em diversas linguagens para design patterns e refatoração, e o curso da **Alura** de **Design Patterns com Java**, onde o professor Maurício explica o conceito e consigo ver em uma aula sua aplicação.

A maioria (se não todos) dos design patterns nos pacotes conterão exemplos desses dois sites, além de um exemplo que criei a partir do momento em que eu estudava, ou de um exercício encontrado na internet.

Minhas principais intenções com o aprendizado desses padrões são eliminar os ifs desnecessários, aumentar a reusabilidade e evitar a duplicação de código.

## Behavioral patterns (Padrões comportamentais)

### Strategy
No pacote do **Strategy** só teremos um exemplo, criado por mim, que é uma calculadora bem simples.
Nesse caso específico em vez de receber uma *String* com o nome da operação, 
e ter quatro *ifs* para cada operação possível nessa calculadora, eu crio uma interface que chamo
de **OperacaoMatematica** e abstraio cada operação para uma classe, por exemplo:

A classe **Subtracao** irá implementar a interface, obrigando a essa classe ter o método **calcular()**, e dentro desse
método calcular da classe **Subtracao** irá ter a operação que subtrairá o primeiro número com o segundo.

Isso será feito com todas as quatro classes (Subtracao, Adicao, Multiplicacao e Divisao), 
alterando apenas a forma como a implementação é feita.

### Chain of Responsability

### Template Method

## Structural patterns (Padrões estruturais)

### Decorator