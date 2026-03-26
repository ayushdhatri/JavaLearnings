package Java.JavaLearnings.PART4.FunctionalInterface;

public class Eagle implements Bird {

    @Override
    public void canFly(String val) {
       System.out.println("Eagle can fly");
    }

  

    public static void main(String[] args){
        // Rather can creating a new class we can prevent that using simply anonymous class
        Bird eagleObject = new Bird(){
        @Override
        public void canFly(String val){
            System.out.println("Eagle can fly with anonnymous class");
        }
    
        };
        eagleObject.canFly("Ayush");

        // There is no problem with this kind of approach like implements or anonymous class but is so much of verbose
        // so to deal with this problem we can with lambda expression
        Bird eagleObject2 = (String value)->{
            System.out.println("Eagle bird Implementation using object");
        };
        eagleObject2.canFly("vertical");
    }

    

    
    
}
