package cl.duoc.cmartinez.arrays;

public class ArrayMain {
    public static void main(String[] args){
        /*int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }

        for(int el: array){
            System.out.println("el = " + el);
        }*/

        Auto[] autos = new Auto[5];

        autos[0] = new Auto();
        autos[1] = autos[0];
        autos[2] = new Auto();
        autos[3] = new Auto();
        autos[4] = new Auto("Fiat", "Punto", 2020, 4, 2222222);

        autos[0].setMarca("Ford");
        //autos[4].getMarca();

        Auto[] autos2 = new Auto[5];
        autos2[0] = autos[0];

    //System.out.println(autos);

    for(Auto auto: autos){
        System.out.println("Auto => " + auto);
    }
  }
}
