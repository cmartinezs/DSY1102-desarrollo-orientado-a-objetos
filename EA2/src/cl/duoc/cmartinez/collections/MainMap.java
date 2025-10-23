package cl.duoc.cmartinez.collections;

import cl.duoc.cmartinez.arrays.Auto;
import java.util.ArrayList;
import java.util.HashMap;

public class MainMap {
  public static void main(String[] args) {

    HashMap<Integer, String> mapaDeSaludos = new HashMap<>();
    mapaDeSaludos.put(1, "hola");
    mapaDeSaludos.put(2, "mundo");
    mapaDeSaludos.put(3, "adios");
    mapaDeSaludos.put(4, "que tal");

    for (Integer clave : mapaDeSaludos.keySet()) {
      System.out.println(clave + " : " + mapaDeSaludos.get(clave));
    }

    mapaDeSaludos.put(3, "chao");
    mapaDeSaludos.put(2, "bye");

    String eliminado = mapaDeSaludos.remove(1);
    String obtenido = mapaDeSaludos.get(4);
    System.out.println("Obtenido 4: " + obtenido);
    System.out.println("Eliminado 1: " + eliminado);

    for (Integer clave : mapaDeSaludos.keySet()) {
      System.out.println(clave + " : " + mapaDeSaludos.get(clave));
    }

    String obtenido6 = mapaDeSaludos.getOrDefault(6, "no hay");
    System.out.println("Obtenido 6: " + obtenido6);

    boolean existe7 = mapaDeSaludos.containsKey(7);
    boolean existe3 = mapaDeSaludos.containsKey(3);
    System.out.println("Existe 7: " + existe7);
    System.out.println("Existe 3: " + existe3);

    HashMap<Auto, String> mapa = new HashMap<>();
    Auto aut0 = new Auto();
    Auto aut1 = new Auto();
    mapa.put(aut0, "Volvo");
    mapa.put(aut1, "Ford");

    ArrayList<Auto> autos = new ArrayList<>();
    autos.add(new Auto("Volvo", "V40", 2016, 4, 1111111));
    autos.add(new Auto("Ford", "Fusion", 2018, 2, 2222222));
    autos.add(new Auto("Toyota", "Prius", 2017, 3, 3333333));
    autos.add(new Auto("Chevrolet", "Camaro", 2019, 1, 4444444));
    autos.add(new Auto("BMW", "X5", 2018, 2, 2222222));
    autos.add(new Auto("Fiat", "Punto", 2020, 4, 2222222));
    String filtroMarca = "Fiat";
    Auto encontrado = null;
    for (Auto auto : autos) {
      if (auto.getMarca().equals(filtroMarca)) {
        encontrado = auto;
        break;
      }
    }
      System.out.println("Encontrado: " + encontrado);

    HashMap<String, Auto> mapaAutos = new HashMap<>();

    for (Auto auto : autos) {
        mapaAutos.put(auto.getMarca(), auto);
    }

    Auto auto = mapaAutos.get(filtroMarca);
  }
}
