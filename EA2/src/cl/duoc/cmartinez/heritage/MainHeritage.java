package cl.duoc.cmartinez.heritage;

import java.util.ArrayList;

public class MainHeritage {
  public static void main(String[] args) {
    ArrayList<Animal> animals = new ArrayList<>();
    animals.add(new Animal("Pinguin", "Ave"));
    animals.add(new Felino("Puma", "Mamifero"));
    animals.add(new Cat("Garfield", (short) 10));

    for (Animal animal : animals) {
      System.out.println("Nombre: " + animal.getName() + " | Tipo: " + animal.getType());
      if (animal instanceof Felino) {
        System.out.println("Soy felino");
        Felino felino = (Felino) animal;
        felino.getSpecie();
      } else if (animal instanceof Cat cat) {
        System.out.println("Soy Gato");
        cat.getSpecie();
        cat.getAge();
      }
    }
  }
}
