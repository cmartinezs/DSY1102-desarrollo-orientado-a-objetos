package cl.duoc.cmartinez.atm;

public class User {
    private String username;
    private String password;
    private Account account;

    public User(String username, String password, Account account){
        this.username = username;
        this.password = password;
        this.account = account;
    }

    public String getUsername(){
        return username;
    }

    public Account getAccount(){
        return account;
    }

    public String getPassword(){
        return password;
    }

    public void changePassword(String newPwd) {
        this.password = newPwd;
    }
}
