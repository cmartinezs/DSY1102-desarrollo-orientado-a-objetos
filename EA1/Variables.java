public class Variables {
  public static void main(String[] args) {
    System.out.println("Definición de variables y tipos de datos básicos");

    // Definición de variables y tipos de datos básicos
    int numero; // short, int, long, double, float ----- definición de variable
    numero = 1; // asignación de valor a una variable
    int numero2 = 2; // <--- asignación literal --- también es definición a la vez
    int numero3 = numero; // <--- asignación x variable
    int numero4 = 2 + 20; // <--- asignación x operación con literales
    int numero5 = numero2 * numero3; // <--- asignación x operación con variables
    long numero6 = 1_000_000_000_000L;
    float numero8 = 1.23456789f;
    double numero7 = 1.23456789;

    // Concatenación de texto con variable, da como resultado otro texto
    String texto = "numero3=" + numero3;
    System.out.println(texto);
  }
}
