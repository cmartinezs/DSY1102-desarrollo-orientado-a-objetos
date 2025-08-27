public class SentenciaCiclo {
    public static void main(String[] args){
        System.out.println("Sentencia de ciclo");
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }

        int j = 10;
        while (j < 20) {
            System.out.println("j = " + j);
            j++;
        }

        for (int x = 0; x < 10; x++) {
            System.out.println("x = " + x);
            if (x == 5) {
                break;
            }
        }

        for (int z = 0; z < 10; z++) {
            if (z % 2 == 0) {
                continue;
            }
            System.out.println("z = " + z);
        }
    }
}
