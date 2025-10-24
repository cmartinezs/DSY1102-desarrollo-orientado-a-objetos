package cl.duoc.cmartinez.heritage.interfaceimpl;

public class PerroCompetencia implements Entrenable, Comparable<PerroCompetencia> {

  private int age;

  @Override
  public void entrenar() {
    System.out.println("Perro entrenando");
  }

  @Override
  public int compareTo(PerroCompetencia o) {
    if (this.age == o.age) {
      return 0;
    }

    if (this.age > o.age) {
      return 1;
    }
    return -1;
  }
}
