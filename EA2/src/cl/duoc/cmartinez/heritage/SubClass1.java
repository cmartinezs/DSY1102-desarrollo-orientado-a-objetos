package cl.duoc.cmartinez.heritage;

public class SubClass1 extends SuperClass {
    private String subPrivateAtribute;

    public SubClass1(String a, String b, String c){
        super(a, b);
        this.subPrivateAtribute = c;
        System.out.println("SubClass1 creada!");
    }

    public String getSuperProtectedAtribute() {
        System.out.println("SubClass1 getSuperProtectedAtribute!");
        return super.superProtectedAtribute;
    }

    public String getSubPrivateAtribute() {
        System.out.println("SubClass1 getSubPrivateAtribute!");
        return subPrivateAtribute;
    }

    @Override
    public String getSuperMessage() {
        System.out.println("SuperClass getSuperMessage! " + super.getSuperMessage());
        return "Hola mundo desde subclase!";
    }

    public String getSuperMessage(String param1) {
        return "Hola mundo con " + param1;
    }

}
