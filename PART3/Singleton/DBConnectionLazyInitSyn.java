package Singleton;

public class DBConnectionLazyInitSyn {
    public static DBConnectionLazyInitSyn conObj;
    private DBConnectionLazyInitSyn(){

    }
    synchronized public static DBConnectionLazyInitSyn getInstance(){
        if(conObj == null){
            conObj = new DBConnectionLazyInitSyn();
        }
        return conObj;
    }
}
