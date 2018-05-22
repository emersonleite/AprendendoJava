# Curso de Fundamentos de Java 

## Classes e objetos

### 1. Programação procedural

1. Orientada a procedimentos ou funções;

#### 1.1 Problemas:
- Mudanças de requisitos;
- Problema em mexer em código que está pronto. Sempre há riscos de introdução de novos bugs;
- Mudança de desenvolvedor. Necessidade de conhecimento profundo do códigos dos novos desenvolvedores;
- Muitas pessoas responsáveis por colocar o mesmo código em vários lugares. Possibilidade de esquecimento de alteração em determinada parte do código é grande; 

### 2. Orientação a objetos

- Escever menos código -> reutilização de código;
- Concentrar responsabilidades nos locais certos;
- Flexibilização da aplicação;
- Encapsular lógica de negócio;
- Polimorfismo (variação do comportamento);

#### 2.1 Classes

- Uma *classe* representa um tipo de dados;
- É uma estrutura;
- O programador define os elementos que a classe terá.
- *Atributos* são as coisas que uma classe tem. São características da estrutura (classe). São características que a classe sabe sobre si mesma;
- *Métodos* são operações que se podem realizar na classe.
- *Atributos* são representados por substantivos.
- *Métodos* são operações que a classe é capaz de realizar. Representa-se por verbos.

#### 2.2 Objetos

- A *classe* é apenas uma estrutura;
- Os *objetos* é o que se cria a partir de uma estrutura;
- Podem ser criados quando objetos quantos se queiram a partir das classes;
- Classes são utilizadas para instanciar objetos. 

Exemplo abaixo:

![Classes e objetos](src/img/fig01_objetos.png)

Cada objeto acima é diferente entre si. Tem atributos diferentes. Mas são criados com base na classe livro.

#### 2.3 Declarando classes no Java

- No java, classe são declaradas utlizando a palavra reservada *class*:


```java
public class livro {
...
}

```
- Um arquivo *.java* pode ter apenas uma classe declarada como pública dentro dele. O nome do arquivo java é o nome da classe. 

#### 2.4 Declarando Métodos e Atributos

- Atributos definidos como se definem variáveis.
- No exemplo abaixo são criados dois atributos: *isbn* e *numPaginas*;
- Abaixo são declarados dois métodos.
- O java inicializa os atributos automaticamente. O Java atribui valores padrão para os valores. Para variáveis numéricos atribui o valor 0 e para o *boolean*, por exemplo, atribui o valor *false*.


```java
public class livro {

//atributos 
String isbn;
int numPaginas;
...

	//métodos
	void emprestar (Cliente c){
	...
	}
	void devolver (){
	...
	}
}

```





![Classes e objetos](src/img/fig01_objetos.png)
