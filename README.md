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
