package cl.duoc.cmartinez.collections;

import cl.duoc.cmartinez.arrays.Auto;

import java.util.ArrayList;

public class MainList {
  public static void main(String[] args) {
    ArrayList<Auto> cars = new ArrayList<>();
    Auto aut0 = new Auto();
    cars.add(aut0);
    cars.add(null);

     boolean seElimino = cars.remove("Volvo");
      Auto eliminado=  cars.remove(1_111_111_111);

      cars.addAll(new ArrayList<>());
    boolean existe =  cars.contains(aut0);
      Auto auto1 = cars.get(1);
      int size = cars.size();
      cars.clear(); //deja la lista vacia
      boolean esVacia = cars.isEmpty(); //indica si la lista está o no vacia
      Auto autoViejo = cars.set(0, auto1);
  }
}
