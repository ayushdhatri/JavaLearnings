package Java.JavaLearnings.PART2;

public class VariableArgument {
    public int sum(int ...variable){
        int output = 0;
        for(int var : variable){
            output+=var;
        }
        return output;
    }
    public static void main(String[] args){
       VariableArgument variableArgument = new VariableArgument();
       variableArgument.sum(6,7);
       // what is you want to pass 2 more paramter then modification is required.
       // and in future more values might come as parameter then in that case our program will not be able to handle
       // so when we don't know about the parameter list then in that case we use the variable argument
        variableArgument.sum(5,6,7);

    }
    
} 