package cl.duoc.cmartinez.scanner;

import java.util.Scanner;

public class ScannerText {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese un texto: ");
        String texto = scan.next();
        System.out.println("El texto ingresado: " + texto);
    }
}
