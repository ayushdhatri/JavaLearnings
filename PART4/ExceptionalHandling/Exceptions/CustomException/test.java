package Java.JavaLearnings.PART4.ExceptionalHandling.Exceptions.CustomException;

public class test {
    public static void main(String[] args) {
        try{
            method1();
        }
        catch(MyCustomException exception){
            exception.setStackTrace(null);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    public static void method1(){
        throw new MyCustomException("We are throwing customExceptionError");
    }
    
}
