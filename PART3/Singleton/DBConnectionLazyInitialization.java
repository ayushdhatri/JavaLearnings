package Singleton;

public class DBConnectionLazyInitialization {
    private static DBConnectionLazyInitialization conObj;
    private DBConnectionLazyInitialization(){

    }
    public static DBConnectionLazyInitialization getInstance(){
        if(conObj == null){
            conObj = new DBConnectionLazyInitialization();
        }
        return conObj;
    }
    
}
/*
  The disadvantage of the lazy initialization is lets say two thread come at same time
  then it will fail and create two different instance and return them individually 
*/
