package cl.duoc.cmartinez.strings;

public class MainString2 {
  public static void main(String[] args) {
    /*
    charAt(int index) → devuelve el carácter en la posición indicada.
    indexOf(String s) → devuelve la posición de la primera ocurrencia.
    toUpperCase() → convierte a mayúsculas.
    toLowerCase() → convierte a minúsculas.
    startsWith(String s) → verifica si empieza con un texto.
    endsWith(String s) → verifica si termina con un texto.
    */

    char a = 'a';
    /// /
    String mensaje = "Hola, bienvenido a la clase de POO!";
    char primeraLetra = mensaje.charAt(0);
    System.out.println("charAt(0): " + primeraLetra);
    System.out.println("indexOf('Hola'): " + mensaje.indexOf("Hola"));
    System.out.println("indexOf('la'): " + mensaje.indexOf("la"));
    System.out.println("indexOf('chao'): " + mensaje.indexOf("chao"));
    System.out.println("toUpperCase: " + mensaje.toUpperCase());
    System.out.println("toLowerCase: " + mensaje.toLowerCase());
    System.out.println("startsWith('Hola'): " + mensaje.startsWith("Hola"));
    System.out.println("startsWith('hola'): " + mensaje.startsWith("hola"));
    System.out.println("endsWith('OO!'): " + mensaje.endsWith("OO!"));
    System.out.println("endsWith('OO'): " + mensaje.endsWith("OO"));

    String mnsjACapitalizar = "hoLA, biEnvENido A la ClaSe dE Poo!";
    char pLetra = mnsjACapitalizar.charAt(0);
    String pLetraS = ("" + pLetra).toUpperCase();
    String resto = mnsjACapitalizar.substring(1).toLowerCase();
    System.out.println(pLetraS + resto);
  }
}
