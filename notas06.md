# Curso de Fundamentos de Java .

  
<img src='https://g.gravizo.com/svg? @startuml; actor User; participant "First Class" as A; participant "Second Class" as B; participant "Last Class" as C; User -> A: DoWork; activate A; A -> B: Create Request; activate B; B -> C: DoWork; activate C; C --> B: WorkDone; destroy C; B --> A: Request Created; deactivate B; A --> User: Done; deactivate A; @enduml '>

## Herança e Polimorfismo

### 1. Herança

- A herança é um mecanismo que permite que uma classe possa herdar o comportamento de outra classe, ao mesmo tempo em que novos comportamentos podem ser estabelecidos;
- A relação de herança se dá entre classes. Uma é chamada superclasse e a outra subclasse. Subclasse é a classe que herda comportamentos da superclasse. 
- A subclasse também pode estabelecer comportamentos para ela;
- A vantagem da herança é agrupar coisas comuns para poder reaproveitar código.

### Programando a herança no Java







- Restringem o acesso aos elementos de uma classe, como atributos e métodos;
- Alguns modificadores:
1. _private_: visivel apenas para a classe que o declara;
2. _public_: elemento visível a todas as classes;

#### 1.1 Atributos e métodos
 
- Marcar um atributo ou método como _private_ esconde o atributo de quem usa a classe. 
- É interessante marcar métodos como _private_ quando este método é auxiliar da classe, e que não deve estar acessível externamente. 


```java
class Livro{
	private String isbn;
	private int numPaginas;
	
	public void emprestar(Cliente c){
	...
	}
	public void devolver() {
	...
	} 
```
 - Os atributos acima são acessíveis somente pela classe livro, que os enxerga.
 - Os métodos acima são públicos, ou seja, qualquer outra classe consegue enxergar esses métodos;
 - Não é regra mas atributos são, normalmente, declarados como _private_ e métodos são declarados como _public_.
 - O ideal é que objetos colaborem através de trocas de mensagens, ou sejam chamadas de métodos, e não através de manipulação direta de atributos. 
 - Os atributos não são expostos externamente, somente os métodos. Isso protege os atributos.
 
#### 1.2 Classes

- Quase sempre classe também são declaradas como _public_;
- Apenas uma classe definidad como _public_ pode existir num arquivo Java;
- O nome do arquivo deve ser igual ao nome da classe definida como _public_, conforme abaixo:

![Nome de arquivo x classes](src/img/fig16_nome_classes.png)

- Classe não declaradas como _public_ são chamadas _inner classes_, incluindo classes declaradas dentro de outras classes;

### 2. Princípio do Encapsulamento

- Encapsular é esconder detalhes de funcionamento do programa; 
- É fundamental para permitir que o programa seja suscetível a mudanças.

#### 2.1 Métodos Getters e Setters

- Quando os atributos são declarados como _private_, externamente eles não podem ser acessados. Nesse caso se utiliza os métodos _getters e setters_;
- Os getters são usados para expor os valores de atributos;
- Os setters são usados para alterar os valores de atributos. 

![Nome de arquivo x classes](src/img/fig17_getters_setters.png)

##### 2.1.1 Benefícios dos métodos getters e setters

- Protegem os atributos;
- Evitam mudanças de códigos em diversos lugares;
- Não utilizar getters e setters quando não for necessário;
- Permitem validação na entrada de dados;

##### 2.1.2 Assinatura dos métodos getters e setters

- A assinatura dos getters e setters segue um padrão:
- Get ou set concatenado com o nome do atributo como nome do método;
- A primeira letra do atributo fica maiúscula;
- No caso de atributos tipo boolean, o padrão do getter é _is..._, porém o get também pode ser utilizado.

![Nome de arquivo x classes](src/img/fig18_assinatuta_getters_setters.png)

### 3. Construtores

- O construtor de uma classe é chamado toda vez que um objeto da classe é instanciado;
- No momento da instanciação do objeto, se for necessário executar determinado código, esse código deve ser colocado dentro do construtor;
- O construtor possui o mesmo nome da classe;
- logo após da instanciação do objeto o construtor é chamado.
- O construtores ainda podem: validar parâmetros, podem chamar outros métodos, instanciar outros objetos etc.

![Construtores](src/img/fig19_construtores.png)

#### 3.1 Construtor Padrão

- Quando o construtor não é fornecido, o Java fornece um construtor padrão (sem parâmetros);
- Toda classe deve ter um construtor, por isso o Java fornece um construtor padrão, se não for descrito um.
- A partir do momento em que se define um construtor, o construtor padrão (sem parâmetros) não está mais disponível. Ele terá que ser definido manualmente. 

![Construtor padrão](src/img/fig20_construtor_padrao.png)

#### 3.2 Construtor com parâmetros

- Construtores podem receber parâmetros da mesma forma que métodos.
- Os parâmetros são passados no momento em que o _new_ é executado.

![Construtor com parâmetros](src/img/fig21_construtor_parametros.png)

#### 3.3 Sobrecarga de Construtores

- Dois cosntrutores na mesma classe que recebem parâmetros diferentes;
- Java diferencia pelo parâmetros passados quando o _new_ é executado;
- O _this()_ é uma forma que existe de invocar um outro construtor a partir de um construtor.
- Em _this()_ pode ser passado parâmetros para o outro construtor, se for necessário.

![Sobrecarga de construtores](src/img/fig22_sobrecarga_construtores.png)

### 4. Atributos e Métodos Estáticos 

- Atributos e/ou métodos podem não estar atrelados a um objeto específico, mas sim à classe;
- Esse atributos e métodos da classe são definidos pelo modificador _static_.

#### 4.1 Declarando Elementos Estáticos

- Os valores dos atributos estáticos são compartilhados entre todas as instâncias da classe;
- Métodos estáticos só podem acessar atributos ou outros métodos que também sejam estáticos.

![Elementos estáticos](src/img/fig23_elementos_estaticos.png)

#### 4.2 Invocando Elementos Estáticos

- O acesso é feito utilizando diretamente a classe. Não é necessário criar um objeto.

![Invocando Elementos estáticos](src/img/fig24_invocando_elementos_estaticos.png)

#### 4.3 Criação de Constantes

- Atributos estáticos são uma forma bastante usada para criar constantes no Java;
- O modificador final indicado que o vlaor de _VERSAO_ não pode ser alterado.

![Criação de constantes](src/img/fig25_criacao_de_constantes.png)

#### 4.4 O Bloco _static_

- Uma classe pode ter um bloco _static_;
- O bloco _static_ é executado quando a classe é referenciada pela primeira vez. Nas próximas instâncias ele não será executado. Ele só é executado **uma vez**.
- Uma classe só pode ter um bloco _static_. Mas o bloco não é obrigatório.
- O bloco só é executado uma vez.
- Ele é utilizado para duas coisas, basicamente:
	1. Inicializar atributos estáticos;
	2. Executar um código antes que a classe seja utilizada.



```java
public class MinhaClasse {
	private static int x;
	
	static {					   //Bloco static
		x = 10;
		Programa.inicializar();
	}
}

```




<!--stackedit_data:
eyJoaXN0b3J5IjpbLTE5NDA2Mjc5NzQsLTc0NjU1MTUyNywtNz
QwOTQ5MTg3LC03NDA5NDkxODcsLTE0NjM3OTg5MzMsLTE4Nzc0
Mjc3NDYsMTk2ODMyNjI4NCwyOTkyODUwNDMsMTQ1OTMwNDU0LD
MwMTYzMDEwNywtMTg0Mzk0NDU0NCwtMTg0Mzk0NDU0NF19
-->