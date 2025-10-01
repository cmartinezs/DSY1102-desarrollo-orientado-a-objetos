package cl.duoc.cmartinez.strings;

public class MainString {
  public static void main(String[] args) {
    String a = "Hola Mundo!";
    String b = new String("Hola Mundo!");
    String c = "Hola Mundo!";
    String rut = "12.345.678-9";
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println("== : " + (a == b));
    System.out.println("equals : " + a.equals(b));
    System.out.println("== : " + (a == c));
    System.out.println("equals : " + a.equals(c));
    System.out.println("length: " + a.length());
    System.out.println("trim: " + a.trim());
    System.out.println("trim-length: " + a.trim().length());
    String z = a.replace("Hola", "Adios");
    System.out.println("replace: " + z);
    System.out.println("a: " + a);
    String rutSinP = rut.replace(".", "");
    System.out.println("rutSinP: " + rutSinP);
    System.out.println("rut N " +  rutSinP.split("-")[0]);
      System.out.println("rut DV " +  rutSinP.split("-")[1]);
    System.out.println("rut: " + rut);
  }
}
