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
