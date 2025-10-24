package cl.duoc.cmartinez.heritage.abstractclass;

public class AbstractMain {
    public static void main(String[] args){
        ConcretCat cat = new ConcretCat("Pelusa");
        System.out.println(cat.emitirSonido());
        cat.presentation();

        ConcretDog dog = new ConcretDog("Pitbull");
        System.out.println(dog.emitirSonido());
        dog.presentation();

        AbstractAnimal a = new AbstractAnimal() {

            @Override
            String getName() {
                return "";
            }

            @Override
            String emitirSonido() {
                return "";
            }
        };
    }
}
