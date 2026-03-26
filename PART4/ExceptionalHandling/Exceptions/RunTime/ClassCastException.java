package Java.JavaLearnings.PART4.ExceptionalHandling.Exceptions.RunTime;

public class ClassCastException {
    public static void main(String[] args){
        Object val = 0;
        System.out.println((String)val);
        /*
            Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String
            (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
            at Java.JavaLearnings.PART4.ExceptionalHandling.Exceptions.RunTime.ClassCastException.main(ClassCastException.java:6)
         */
    }
    
}
