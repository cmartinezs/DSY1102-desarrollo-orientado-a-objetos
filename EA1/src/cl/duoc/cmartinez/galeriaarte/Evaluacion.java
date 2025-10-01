package cl.duoc.cmartinez.galeriaarte;

public class Evaluacion {
    private String codigoCuadro;
    private int rutCritico;
    private int calificacion;

    public Evaluacion() {
    }

    public Evaluacion(String codigoCuadro, int rutCritico, int calificacion){
        this.codigoCuadro = codigoCuadro;
        this.rutCritico = rutCritico;
        this.calificacion = calificacion;
    }

    public boolean setCalificacion(int calificacion){
        boolean esMenor0 = calificacion < 0;
        boolean esMayor70 = calificacion > 70;
        if(esMenor0 || esMayor70){
            return false;
        }
        this.calificacion = calificacion;
        return true;
    }
    public boolean puedeSerExhibido(){
        return this.calificacion > 40;
    }

    public String getCodigoCuadro() {
        return codigoCuadro;
    }

    public void setCodigoCuadro(String codigoCuadro) {
        this.codigoCuadro = codigoCuadro;
    }

    public int getRutCritico() {
        return rutCritico;
    }

    public void setRutCritico(int rutCritico) {
        this.rutCritico = rutCritico;
    }

    public int getCalificacion() {
        return calificacion;
    }
}
