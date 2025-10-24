package cl.duoc.cmartinez.heritage.interfaceimpl;

public class Deportista implements Entrenable {

  @Override
  public void entrenar() {
    System.out.println("Deportista entrenando");
  }
}
