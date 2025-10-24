package cl.duoc.cmartinez.heritage;

public class MainSuperClass {
  public static void main(String[] args) {
    SuperClass sc = new SuperClass("a", "b");
    System.out.println(sc.getSuperPrivateAtribute());
    System.out.println(sc.getSuperProtectedAtribute());
    System.out.println("SuperClass Message: " + sc.getSuperMessage());

    SubClass1 sc1 = new SubClass1("a", "b", "c");
    System.out.println(sc1.getSuperPrivateAtribute());
    System.out.println(sc1.getSuperProtectedAtribute());
    System.out.println(sc1.getSubPrivateAtribute());
    System.out.println("SubClass1 Message: " + sc1.getSuperMessage());

    SuperClass sc0 = new SubClass1("a", "b", "c");
    System.out.println("SuperClass message: " + sc0.getSuperMessage());
    System.out.println("SuperClass message: " + ((SubClass1)sc0).getSuperMessage("PARAMETRO"));


      SubClass1 sc2 = new SubClass1("a", "b", "c");
    System.out.println("SuperClass message: " + sc2.getSuperMessage("PARAMETRO"));
  }
}
