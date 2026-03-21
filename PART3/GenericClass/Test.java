package GenericClass;

public class Test {
    public static void main(String[] args){
        Print print = new Print();
        print.setPrintValue(1);
        Object printValue = print.getPrintedValue();
        // in case of Object you must typecasting the object else you cannot use it 
        if((int)printValue == 1){
            //
        }

        // Lets see how to use this generic class
        // this solves the problem of type casting manually it is done automatically
        GenericPrint<Integer> printObj1 = new GenericPrint<>();
        printObj1.setPrintValue(2);
        Integer printedValue = printObj1.getPrintValue();
        System.out.println(printedValue);
        // 

    }
}