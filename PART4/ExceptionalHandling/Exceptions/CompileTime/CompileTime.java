// package Java.JavaLearnings.PART4.ExceptionalHandling.Exceptions.CompileTime;

// public class CompileTime {
//     public static void main(String[] args) {
//         method1();
//     }
//     public static void method1() throws ClassNotFoundException{
//         throw new ClassNotFoundException();
//     }
//     /*
//         throws tell that, this method might throw this exception (or might not), so pls
//         caller you handle it properly
//         It tells the parent caller to handle the function call


//      */
    
// }

// package Java.JavaLearnings.PART4.ExceptionalHandling.Exceptions.CompileTime;

// public class CompileTime {
//     public static void main(String[] args) {
//         method1();
//     }
//     public static void method1(){
//         try{
//             throw new ClassNotFoundException();
//         }
//         catch(Exception exceptionObject){
//             // handle this exce
//             exceptionObject.printStackTrace();
//         }
//     }
//     /*
//         Here we are handling using try and catch inside the method itself where exception might occur
        
//      */
    
// }


package Java.JavaLearnings.PART4.ExceptionalHandling.Exceptions.CompileTime;

public class CompileTime {
    public static void main(String[] args) {
        try{
            method1();
        }
        catch(Exception exceptionObject){
            exceptionObject.printStackTrace();
        }
    }
    public static void method1() throws ClassNotFoundException{
        throw new ClassNotFoundException();

    }
    /*
        here method1 throws the handling duty to its parent call, where it handled using 
        try and catch Exception
        
     */
    
}
