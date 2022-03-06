import java.io.Serializable;

public class UserModel implements Serializable{
    private String firstName;
    private String lastName;

    UserModel(){
        this.firstName= "First";
        this.lastName= "Last";
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String firstName){
      this.firstName = firstName;  
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
      this.lastName = lastName;  
    }
}
