public class ObjectTest{
    public static void main(String[] args){
        // // this is the way we create inner class object when nested class is non-static
        // StaticNestedClass outerClass = new StaticNestedClass();
        // StaticNestedClass.NestedClass nestedClass = outerClass.new NestedClass();
        // This is the way we create inner class Object when nested class is static
        StaticNestedClass.NestedClass nestedClass1 = new StaticNestedClass.NestedClass();
        nestedClass1.print();

    }
}