package cl.duoc.cmartinez.galeriaarte;

public class Cuadro {
    private String codigoUnico;
    private String titulo;
    private String autor;
    private int anioCreacion;
    private Galeria galeria;

    public boolean setTitulo(String titulo){
        if(titulo == null || titulo.trim().isEmpty()){ // "", "        "
            return false;
        }
        this.titulo = titulo;
        return true;
    }

    public boolean setAnioCreacion(int anio){
        boolean esMenor1500 = anio < 1500;
        boolean esMayor2025 = anio > 2025;
        if(esMenor1500 || esMayor2025){
            return false;
        }
        this.anioCreacion = anio;
        return true;
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public Galeria getGaleria() {
        return galeria;
    }

    public void setGaleria(Galeria galeria) {
        this.galeria = galeria;
    }
}
