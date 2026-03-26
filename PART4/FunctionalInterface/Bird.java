package Java.JavaLearnings.PART4.FunctionalInterface;

@FunctionalInterface
// this annotation ensures that there is only 1 abstract method in the inteface body, there can be many default or static methods but only 1 abstract
public interface Bird {
    void canFly(String val);
}