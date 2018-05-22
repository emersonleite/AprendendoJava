# Curso de Fundamentos de Java 
## Classes e objetos

### 1. Programação procedural

1. Orientada a procecimentos ou funções;

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
- Podem ser criados quando objetos quanto se queira a partir das classes;
- Classes são utilizadas para instanciar objetos. 

Exemplo abaixo:

![Classes e objetos](src/img/fig01_objetos.png)

Cada objetos acima é diferente entre si. Tem atributos diferentes. Mas são criados com base na classe livro.

#### 2.3

- No java, classe são declaradas utlizando a palavra reservada *class*:


```java
public class livro {
...
}

```





![Classes e objetos](src/img/fig01_objetos.png)
![Classes e objetos](src/img/fig01_objetos.png)







1. sobrecarga de métodos;

```java
public class Aplicacao {

	public static void main(String[] args) {
		
		double baseT = 10.0;
		double alturaT = 20.0;
		double ladoQ = 12.0;
		double raio = 10.0;
		double areaT;
		double areaQ;
		double areaC;
		double BT = 10;
		double bT = 5;
		double areaTrap;
		double alturaTrap = 5;
```
