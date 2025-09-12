package cl.duoc.cmartinez.galeriaarte;

public class Critico {
    private String rut;
    private String nombre;
    private String especialidad;
    private int aniosExperiencia;

    public boolean setNombre(String nombre){
        if(nombre == null || nombre.trim().isEmpty()){ // "", "        "
            return false;
        }
        this.nombre = nombre;
        return true;
    }

    public boolean setAniosExperiencia(int anios){
        boolean esMenor0 = anios < 0;
        boolean esMayor80 = anios > 80;
        if(esMenor0 || esMayor80){
            return false;
        }
        this.aniosExperiencia = anios;
        return true;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }
}
