package cl.duoc.cmartinez.heritage.interfaceimpl;

import java.util.ArrayList;
import java.util.List;

public class InterfaceMain {
  public static void main(String[] args) {
    List<Entrenable> entrenables = new ArrayList<>();
    entrenables.add(new Deportista());
    entrenables.add(new PerroCompetencia());

    for (Entrenable entrenable : entrenables) {
      entrenable.entrenar();
    }
  }
}
