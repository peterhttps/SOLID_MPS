public class Studio extends Apartamento {
    public Studio() {
        this.numeroQuartos = 0;
    }

    public void setAreaApartamento(int area) {
        this.areaApartamento = area;
    }

    public void expandir(Apartamento apt) {
      apt.areaApartamento += 99;
    }
}
