package cl.duoc.cmartinez.heritage;

public class Animal {
    private String name;
    private String type;

    public Animal(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
