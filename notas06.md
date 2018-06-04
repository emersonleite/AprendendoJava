# Curso de Fundamentos de Java.

## Herança e Polimorfismo

### 1. Herança

- A herança é um mecanismo que permite que uma classe possa herdar o comportamento de outra classe, ao mesmo tempo em que novos comportamentos podem ser estabelecidos;

- A relação de  herança é dada entre classes;

- Uma classe é chamada de superclasse e a outra de subclasse. Subclasse é a classe que herda da superclasse;

- A Subclasse herda o comportamento da superclasse e também pode estabelecer outros comportamentos para ela;

- A vantagem da herança é agrupar coisas comuns para poder reaproveitar código.

#### 1.1 Programando a herança

#### Exemplo:

- Classe Telefone;
- Classe orelhão e celular que herdam de telefone;
- Relação "é um". A subclasse é sempre do tipo da superclasse (classe mãe);

#### Sintaxe:

```java

public class Celular extends Telefone {
	...
}
```

---

```java
public class Orelhao extends Telefone {
	...
}

```

- A palavra _extends_ é a maneira de se dizer que celular e orelhão herdam de telefone, seguido do nome da superclasse.

#### 1.2 Herança da Classe _Object_

- O Java permite apenas herança simples e não múltipla;

- Toda classe em Java herda de apenas uma superclasse;

- Se não for utilizada a palavra chave _extends_ automaticamente a classe definida herda de _Object_;

- _Object_ é a superclasse de último nível de todas as classes em Java. Todas as classes herdam de _Object_, direta ou indiretamente.

#### 1.3 O modificador _protected_

- Atributos e métodos declarados com o modificador protected podem ser acessados pelas suas subclasses, conforme abaixo;

```java

class Telefone {
	protected String numero;
	...
}
```

```java

class Celular extends Telefone {

	public void adicionarDDD(String ddd) {
		String n = ddd + this.numero;
	}

}
```

---

#### 1.4 Sobrescrita de métodos

- Técnica também conhecida como overriding;

- Quando uma classe herda de outra, ela pode redefinir métodos da superclasse, isto é, sobrescrever métodos: 
	1. **Os métodos sobrescritos substituem os métodos da superclasse**;
	2. A assinatura do método sobrescrito deve ser a 
mesma do método original;#### Exemplo:


#### Exemplo 01:

```java

class Telefone {
	public void telefonar(){
		//código para telefonar
	}

}
```

```java

class Orelhao extends Telefone {
	public void telefonar(){
		//código para telefonar do orelhão
	}

}
```

---

- As duas classe tem o método _telefonar()_. Está acontecendo a sobrescrita do método _telefonar()_ em Orelhao.

- No exemplo abaixo, como o método foi sobrescrito, é chamado o método _telefonar()_ da subclasse:

```java
Orelhao o = new Orelhao();
o.telefonar();
```


#### Exemplo 02:

- A classe Orelhao agora tem um método _telefonar()_ que recebe um _int_ como parâmetro:

```java

class Telefone {
	public void telefonar(){
		//código para telefonar
	}

}
```

```java

class Orelhao extends Telefone {
	public void telefonar(int numero){
		//código para telefonar do orelhão
	}

}
```

```java
Orelhao o = new Orelhao();
o.telefonar();
```

- Acima não há sobrescrita de método. Métodos sobrescritos devem ter a mesma assinatura (tipo de retorno, nome do método e parâmetros). O método evocado é o _telefonar()_ da superclasse, ou seja, Telefone. Aqui não houve sobrescrita de métodos.

#### 1.4.1 Sobrescrita de métodos da classe _Object_

- Método **toString()**

	1. As classes podem sobrescrever este método 
para mostrarem uma mensagem que as 
representem;
	2. O método System.out.println(), por exemplo, 
utiliza este método;

- Método **equals(Object)**
	1. É a forma que o Java tem de comparar objetos pelo seu conteúdo ao invés de comparar as referências (como acontece ao usarmos "==").

#### 1.4.2 Usando o _super_

- O método que foi sobrescrito pode ser acessado pelo método que o sobrescreveu através da palavra-chave super;

#### Exemplo:

```java

class Orelhao extends Telefone {
	public void telefonar(){
		super.telefonar();
	}

}
```

### 2. Polimorfismo

- É a capacidade que um método tem de agir de diferentes formas, dependendo do objeto sobre o qual está sendo chamado;

- Quando ocorre a chamada de um método, a JVM decide qual método invocar dependendo do objeto instanciado na memória;

#### Exemplo:

