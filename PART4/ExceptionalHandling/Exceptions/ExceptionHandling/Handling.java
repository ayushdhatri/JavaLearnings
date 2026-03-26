package Java.JavaLearnings.PART4.ExceptionalHandling.Exceptions.ExceptionHandling;

import java.io.FileNotFoundException;

import Java.JavaLearnings.PART4.ExceptionalHandling.Exceptions.RunTime.ClassCastException;

public class Handling {
    public static void main(String[] args) {
        try{
            method1("dummy");

        }
        catch(ClassNotFoundException exception){
            exception.printStackTrace();

        }
        catch(InterruptedException exception){
            exception.printStackTrace();
        }
        catch(Exception ex){

        }
        
    }

    public static void method1(String name) throws ClassNotFoundException, InterruptedException{
        if(name.equals("dummy")){
            throw new ClassNotFoundException();
        }
        else if(name.equals("interrupted")){
            throw new InterruptedException();
        }
    }
    
}
