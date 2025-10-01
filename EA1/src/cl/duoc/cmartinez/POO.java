package cl.duoc.cmartinez;

import cl.duoc.cmartinez.cartesian.Point;

public class POO {
    public static void main(String[] args) {
        //codigo y logica
        Point p = new Point(10, 15);
        double x = p.getX();
        double y = p.getY();
        String mensaje = String.format("x = %f, y = %f", x, y);
        System.out.println(mensaje);

        Point p2 = new Point(100, -25);

        double distancia = p.calculateDistance(p2);
        System.out.println("Distancia entre p y p2 = " + distancia);
    }
}
