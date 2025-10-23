package cl.duoc.cmartinez.heritage;

public class Cat extends Felino{
    private short age;

    public Cat(String name, short age) {
        super(name, "Cat");
        this.age = age;
    }

    public short getAge() {
        return age;
    }
}
