package Java.JavaLearnings.PART6;

public class MonitorExample {

    public synchronized void task1(){
        try{
            System.out.println("inside task1 before Sleep");
            Thread.sleep(10000);
            System.out.println("inside task1 after Sleep");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void task2(){
        System.out.println("task2, but before synchronized");
        synchronized(this){
            System.out.println("task2, inside synchronized");
        }
    }

    public void task3(){
        System.out.println("task3");
    }
}
