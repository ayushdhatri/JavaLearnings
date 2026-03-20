public class LocalInnerClass {
    int instanceVariable = 10;
    static int classVariable = 20;


    public void display(){
        int methodLocalVariable = 3;

        class LocalInnerClassExample{
            int localVariable = 4;
            public void print(){
                System.out.println(instanceVariable + " " + classVariable + " " + instanceVariable + " " + methodLocalVariable);
            }
        }

        LocalInnerClassExample localObj = new LocalInnerClassExample();
        localObj.print();
    }
    
}
