package cl.duoc.cmartinez.galeriaarte;

import java.util.Scanner;

public class App {
  private Galeria galeria;
  private Critico critico;
  private Cuadro cuadro;
  private Evaluacion evaluacion;

  private Scanner scanner = new Scanner(System.in);

  public void iniciar() {
    System.out.println("App iniciada");
    do {
      String op = menuPrincipal();
      if (op.equals("1")) {
        ingresarGaleria();
      }

      if (op.equals("3")) {
        if (galeria == null) {
          System.out.println("Primero ingrese una galeria");
        } else {
          ingresarCuadro();
        }
      }
      if (op.equals("6")) {
        break;
      }

      System.out.println("Opcion no valida.");
    } while (true);
  }

  private String menuPrincipal() {
    System.out.println("1. Ingresar Galería");
    System.out.println("2. Ingresar Crítico");
    System.out.println("3. Ingresar Cuadro");
    System.out.println("4. Ingresar Evaluación");
    System.out.println("5. Calcular Resultados");
    System.out.println("6. Salir");
    System.out.println("Seleccione una opción: ");
    return scanner.nextLine();
  }

  private void ingresarGaleria() {
    // pedir los datos
    String nombreGaleria = scanner.nextLine();
    galeria = new Galeria();
    galeria.setNombre(nombreGaleria);
  }

  private void ingresarCuadro() {
    cuadro = new Cuadro();
    cuadro.setGaleria(galeria);
  }
}
