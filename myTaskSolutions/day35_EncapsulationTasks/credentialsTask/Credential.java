package day35_EncapsulationTasks.credentialsTask;

public class Credential {
    private String username, password;
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void isStrongPassword(){
        if (password.length()<8||password.contains(" ")){
            System.err.println("Password MUST be at least have 8 characters long, and should not contain space");
            System.exit(1);
        }
        for (int i = 0; i < password.length(); i++) {

        }
    }
}
