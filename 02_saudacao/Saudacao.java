interface Etiqueta {
  public String formalidade;
}

public class Formal implements Etiqueta {
  @Override
  public String formalidade() {
    return "Bom dia, sr.";
  }
}

public class Casual implements Etiqueta {
  @Override
  public String formalidade() {
    return "E aí, blz?";
  }
}

public class Intimo implements Etiqueta {
  @Override
  public String formalidade() {
    return "Oi querida!";
  }
}

public class Default implements Etiqueta {
  @Override
  public String formalidade() {
    return "Oi.";
  }
}

public class Saudacao {
    public void setFormalidade(Etiqueta etiqueta) {
        etiqueta.formalidade();
    }
}
