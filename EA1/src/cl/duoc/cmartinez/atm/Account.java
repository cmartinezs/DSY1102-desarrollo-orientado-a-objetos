package cl.duoc.cmartinez.atm;

public class Account {
    private double amount;

    public Account(double amount){
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }

    public boolean girar(double amount){
        if(amount > this.amount){
            return false;
        }
        this.amount -= amount;
        return true;
    }

    public void depositar(double amount){
        this.amount += amount;
    }
}
