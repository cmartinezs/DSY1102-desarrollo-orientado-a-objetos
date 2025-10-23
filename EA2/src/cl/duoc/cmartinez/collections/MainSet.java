package cl.duoc.cmartinez.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class MainSet {
  public static void main(String[] args) {
    HashSet<String> saludos = new HashSet<>();
    saludos.add("Hola");
    saludos.add("Mundo");
    saludos.add("Adios");
    for (String saludo : saludos) {
      System.out.println(saludo);
    }

    saludos.add("Mundo"); // no se agrega
    saludos.add("Ciao");
    for (String saludo : saludos) {
      System.out.println(saludo);
    }

    ArrayList<String> lista = new ArrayList<>(saludos);
  }
}
