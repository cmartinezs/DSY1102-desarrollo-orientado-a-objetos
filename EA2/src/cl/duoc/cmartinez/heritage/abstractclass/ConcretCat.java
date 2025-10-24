package cl.duoc.cmartinez.heritage.abstractclass;

public class ConcretCat extends AbstractAnimal {

    private String name;
    private String sound = "Miau miau";

    public ConcretCat(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String emitirSonido() {
        return sound;
    }
}
