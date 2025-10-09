package cl.duoc.cmartinez.arrays;

public class Auto {
    private String marca;
    private String modelo;
    private int anio;
    private int numPuertas;
    private double precio;

    public Auto clone() {
        return new Auto(this.marca, this.modelo, this.anio, this.numPuertas, this.precio);
    }

    public Auto() {
    }

    public Auto(String marca, String modelo, int anio, int numPuertas, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numPuertas = numPuertas;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", numPuertas=" + numPuertas + ", precio=" + precio + '}';
    }

    public String getInfo() {
        return "Marca: " + this.marca + "\nModelo: " + this.modelo + "\nAnio: " + this.anio + "\nNum puertas: " + this.numPuertas + "\nPrecio: " + this.precio;
    }
}
