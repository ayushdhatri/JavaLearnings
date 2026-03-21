/*
- This class is pojo class because:
- Contains Variable and its getter and setter methods.
- Class should be public
- Public default constructor.
- No annotations should be used like @Table @Entity @Id etc
- It should not extend any class or implement any interface.
 */
public class POJO {
    String name;
    private int rollNumber;
    protected String address;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

