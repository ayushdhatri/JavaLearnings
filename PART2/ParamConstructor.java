package Java.JavaLearnings.PART2;

public class ParamConstructor {
    int x, y;

    ParamConstructor(int x, int y){
        // this is parameterized constructor
        this.x = x;
        this.y = y;
    }
    ParamConstructor(){
        // it is default constructor
    }
    // ParamConstructor(){
    // It is NoArg Constructor
    // similar to default constuctor with inside this we initialize the variables
    // }

    public static void main(String[] args){
        ParamConstructor c1 = new ParamConstructor();
        ParamConstructor c2 = new ParamConstructor(6,7);
        // Here we don't created any default parameter so it will throw compile error 
        // so we have to create manually default 
        // 
    }
    
}