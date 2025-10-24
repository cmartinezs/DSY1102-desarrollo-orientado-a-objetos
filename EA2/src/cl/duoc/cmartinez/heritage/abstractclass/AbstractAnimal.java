package cl.duoc.cmartinez.heritage.abstractclass;

public abstract class AbstractAnimal {
  abstract String getName();

  abstract String emitirSonido();

  // template method
  public void presentation() {
    System.out.println("Estamos presentando a: " + getName() + "");
    System.out.println("Sonido: " + emitirSonido());
  }
}
