package Java.JavaLearnings.PART4.ExceptionalHandling.Exceptions.RunTime;

public class NumberFormatException {
    public static void main(String[] args){

        int val = Integer.parseInt("abc");
        System.out.println(val);
        /*
            Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
            at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            at java.base/java.lang.Integer.parseInt(Integer.java:564)
            at java.base/java.lang.Integer.parseInt(Integer.java:661)
            at Java.JavaLearnings.PART4.ExceptionalHandling.Exceptions.RunTime.NumberFormatException.main(NumberFormatException.java:6)
         */

    }
    
}
