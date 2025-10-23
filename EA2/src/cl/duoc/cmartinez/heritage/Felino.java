package cl.duoc.cmartinez.heritage;

public class Felino extends Animal {

    private String specie = "Felino";

    public Felino(String name, String type) {
        super(name, type);
    }

    public String getSpecie() {
        return specie;
    }
}
