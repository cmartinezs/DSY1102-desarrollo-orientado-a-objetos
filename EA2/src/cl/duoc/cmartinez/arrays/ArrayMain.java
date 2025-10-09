package cl.duoc.cmartinez.arrays;

public class ArrayMain {
  public static void main(String[] args) {
    Auto[] autos = new Auto[5];
    autos[0] = new Auto("Chevrolet", "Camaro", 2019, 1, 1111111);
    autos[1] = new Auto("BMW", "X5", 2018, 2, 2222222);
    autos[2] = new Auto("Toyota", "Prius", 2017, 3, 3333333);
    autos[3] = new Auto("Volkswagen", "Golf", 2016, 4, 4444444);
    autos[4] = new Auto("Fiat", "Punto", 2020, 4, 2222222);

    System.out.println("Auto indice: 0 => " + autos[0].getInfo());
    System.out.println("Auto indice: 1 => " + autos[1].getInfo());

    for (Auto auto : autos) {
      System.out.println("Auto => " + auto);
    }
  }
}
