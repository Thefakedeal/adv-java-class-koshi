import java.io.Serializable;

public class JBean implements Serializable{
    private String name;
    private int id;
    public JBean(){

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
}

