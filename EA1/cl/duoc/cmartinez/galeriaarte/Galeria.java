package cl.duoc.cmartinez.galeriaarte;

public class Galeria {
    private String codigoUnico;
    private String nombre;
    private String ciudad;

    public boolean setNombre(String nombre){
        if(nombre == null || nombre.isBlank()){ // "", "        "
            return false;
        }
        this.nombre = nombre;
        return true;
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
