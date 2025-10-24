package cl.duoc.cmartinez.heritage;

public class SuperClass {
    private String superPrivateAtribute;
    protected String superProtectedAtribute;

    public SuperClass(String a, String b){
        this.superPrivateAtribute = a;
        this.superProtectedAtribute = b;
        System.out.println("SuperClass creada!");
    }

    public String getSuperPrivateAtribute() {
        System.out.println("SuperClass getSuperPrivateAtribute!");
        return superPrivateAtribute;
    }

    public String getSuperProtectedAtribute() {
        System.out.println("SuperClass getSuperProtectedAtribute!");
        return superProtectedAtribute;
    }

    public String getSuperMessage() {
        return "Hola mundo desde superclase!";
    }
}
