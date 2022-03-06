import java.io.Serializable;

public class JBean implements Serializable{
    private String name;
    private int id;
    private boolean full;
    private String[] names;

    public JBean(){

    }

    public void setNames(int index, String name){
        this.names[index] = name;
    }

    public void setNames(String[] names){
        this.names = names;
    }

    public String getNames(int index){
        return this.names[index];
    }

    public String[] getNames(){
        return this.names;
    }

    public void setFull(Boolean full){
        this.full = full;
    }

    public boolean isFull(){
        return this.full;
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

