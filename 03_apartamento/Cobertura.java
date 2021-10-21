public class Cobertura extends Apartamento {
    public Cobertura() {
        this.numeroQuartos = 4;
    }

    public void setAreaApartamento(int area) {
        this.areaApartamento = area;
    }

    public void expandir(Apartamento apt) {
      apt.numeroQuartos += 1;
      apt.areaApartamento += 99;
    }
}
