public class StaticNestedClass {
    private int instanceVariable = 10;
    private static int staticVariable = 20;
    static class NestedClass{
        public void print(){
           System.out.println(staticVariable);
            // This inner nested class can only access the static varialbles of outer class
            // Hence throws a compile time error 
        }
    }

    
}