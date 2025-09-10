package cl.duoc.cmartinez.atm;

import java.util.Scanner;

public class EntryPoint {
    public static void main(String[] args){
        Account ac1 = new Account(1000);
        Account ac2 = new Account(1000);
        User u1 = new User("juan", "1234", ac1);
        User u2 = new User("maria", "5678", ac2);
        Scanner sc = new Scanner(System.in);
        int op = 0;

        User seleccionado = null;
        do {
            System.out.println("Ingrese el username");
            String username = sc.nextLine();

            boolean esU1 = u1.getUsername().equals(username);
            boolean esU2 = u2.getUsername().equals(username);

            if (!esU1 && !esU2) {
                System.out.println("Usuario no encontrado");
                continue;
            }

            if (esU1) {
                seleccionado = u1;
            }

            if (esU2) {
                seleccionado = u2;
            }

            System.out.println("Ingrese la contraseña");
            String password = sc.nextLine();

            boolean validPwd = seleccionado.getPassword().equals(password);

            if (!validPwd) {
                System.out.println("Acceso no valido");
                continue;
            }

            break;
        } while(true);

        Account acSeleccionada =  seleccionado.getAccount();
        do {
            System.out.println("1. Depositar");
            System.out.println("2. Girar");
            System.out.println("3. Consultar");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opcion: ");
            op = sc.nextInt();

            if (op != 1 && op != 2 && op != 3 && op != 4) {
                System.out.println("Opción invalida");
                continue;
            }

            if (op == 1) {
                System.out.println("Indique el monto a depositar:");
                double monto = sc.nextDouble();
                acSeleccionada.depositar(monto);
            } else if (op == 2) {
                System.out.println("Indique el monto a girar:");
                double monto = sc.nextDouble();
                boolean girado = acSeleccionada.girar(monto);
                if(!girado) {
                    System.out.println("No hay dinero suficiente para girar");
                }
            } else if (op == 3) {
                System.out.println("El saldo es: $" + acSeleccionada.getAmount());
            }
        } while (op != 4);
    }
}
