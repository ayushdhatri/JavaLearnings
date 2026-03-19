package Java.JavaLearnings.PART2;
public class Constructor{
    int x;
    Constructor(int x){
        this.x = x;
    }
    public static void main(String[] args){
        // constructor does not have return type
        // new keyword tell compiler to call constructor
        // we keep the same name so that we can easily point
        // one ciritical point : Method name can also be same as class name so in that case how it can diffrentiate with constructor name
        // so to solve that issue we are using no return type for constrcutor so that we can diffrentiate between constructor and methods

    }
}