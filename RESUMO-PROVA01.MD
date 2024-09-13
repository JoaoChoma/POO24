
# Conceitos Principais de Orientação a Objetos em Java

## 1. Classe e Objeto
- **Classe**: Representa um "molde" ou modelo para criar objetos. Define atributos (variáveis) e métodos (comportamentos) que os objetos instanciados a partir dela possuirão.
- **Objeto**: Instância de uma classe, representando uma entidade concreta que pode interagir com outros objetos.

```java
class Car {
    String model;
    int year;
    
    void drive() {
        System.out.println("The car is driving.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();  // Criação de objeto
        myCar.model = "Toyota";
        myCar.year = 2021;
        myCar.drive();
    }
}
```

## 2. Encapsulamento
- **Definição**: O processo de esconder os detalhes internos de implementação de uma classe, permitindo acesso apenas por meio de métodos públicos.
- **Como fazer**: Uso de modificadores de acesso (`private`, `public`, `protected`) e métodos `getter` e `setter` para acessar ou modificar os atributos privados.

```java
class Person {
    private String name;
    
    // Método getter
    public String getName() {
        return name;
    }
    
    // Método setter
    public void setName(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("João");  // Acesso controlado ao atributo privado
        System.out.println(p.getName());
    }
}
```

## 3. Herança
- **Definição**: Permite que uma classe (subclasse) herde atributos e métodos de outra classe (superclasse), promovendo reuso de código.
- **Como fazer**: Uso da palavra-chave `extends` em Java.

```java
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();  // Herança de Animal, mas comportamento sobrescrito
    }
}
```

## 4. Polimorfismo
- **Definição**: Permite que métodos com o mesmo nome tenham comportamentos diferentes, dependendo de qual classe ou objeto invoca o método. Existem dois tipos de polimorfismo:
  - **Polimorfismo de Sobrecarga** (Overloading): Várias versões do mesmo método com diferentes parâmetros.
  - **Polimorfismo de Sobrescrita** (Overriding): A subclasse fornece sua própria implementação de um método da superclasse.

- **Como fazer**:
  - **Sobrecarga de método**:

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```

  - **Sobrescrita de método**:

```java
class Animal {
    void makeSound() {
        System.out.println("Animal makes sound.");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows.");
    }
}
```

## 5. Abstração
- **Definição**: Simplificação de conceitos complexos, ocultando detalhes irrelevantes e expondo apenas as funcionalidades essenciais.
- **Como fazer**: Uso de classes abstratas e interfaces.

- **Exemplo de Classe Abstrata**:

```java
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}
```

- **Exemplo de Interface**:

```java
interface Animal {
    void eat();
}

class Bird implements Animal {
    public void eat() {
        System.out.println("Bird eats seeds.");
    }
}
```

## 6. Modificadores de Acesso
- **Private**: Visível apenas dentro da classe.
- **Protected**: Visível dentro do pacote e por subclasses.
- **Public**: Visível por todas as classes.

## 7. Interfaces e Classes Abstratas
- **Interfaces**: Definem um contrato (métodos) que outras classes devem implementar. Não podem conter implementações de métodos (a menos que sejam métodos `default`).
- **Classes Abstratas**: Podem ter métodos abstratos (sem implementação) e métodos concretos (com implementação), sendo utilizadas como base para outras classes.