# Principios SOLID - MPS


## 01 Jogo da velha

Princípio SOLID S - Single Responsibility Principle
Onde na classe `Tabuleiro` havia inúmeros métodos com várias responsabilidades diferentes, algo que pôde ser separado em várias classes com métodos mais específicos

## 02 Saudacao

Princípio SOLID O - Open-Closed Principle
Onde foi possível implementar uma interface 
```java
interface Etiqueta {
  public String formalidade;
}
```
para que todas as classes que a implementarem herdem e possam ter este método e o subscrever para suas próprias particularidades, como:
```java
public class Formal implements Etiqueta {
  @Override
  public String formalidade() {
    return "Bom dia, sr.";
  }
}
```

## 03 Apartamento

Princípio SOLID L - Liskov Substitution Principle
Onde as classes derivadas de `Apartamento` possam ser substituidas por sua clase base, como `Cobertura` e `Studio` que devem poder ter a capacidade de realizar o "extends" da classe `Apartamento`.

## 04 Ave

Princípio SOLID I - Interface Segregation Principle
A classe `Penguin` não deve implementar a interface `Ave` para herdar métodos as quais nunca irá utilizar, pois nesse caso os penguins não apresentam o método `voa()`
```java
public class Pinguin implements Ave {
    String localizacaoAtual;
    int numeroDePenas;

    public Pinguin(int contagemNumeroDePenas) {
        this.numeroDePenas = contagemNumeroDePenas;
    }

    public void trocaPlumagem() {
        this.numeroDePenas -= 1;
    }

    public void nada() {
        this.localizacaoAtual = "na agua";
    }
}
```

## 05 Clima Tracker

Princípio SOLID D - Dependency Inversion Principle
Módulos de alto nível não devem depender de módulos de baixo nível, então foi gerada uma classe 
```java
public class Alerta {
    public String geraClimaAlerta(String condicaoClimatica) {
        String alerta = "Estar " + condicaoClimatica;
        return alerta;
    }
}
```
para lidar com os alertas gerais, em vez de cada classe ter sua própria abstração.


