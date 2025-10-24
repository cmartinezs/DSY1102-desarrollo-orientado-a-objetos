package cl.duoc.cmartinez.heritage.abstractclass;

public class ConcretDog extends AbstractAnimal{

    private String name;
    private String sound = "Woof woof";
    public ConcretDog(String name){
        this.name = name;
    }
    @Override
    String getName() {
        return name;
    }

    @Override
    String emitirSonido() {
        return sound;
    }
}
