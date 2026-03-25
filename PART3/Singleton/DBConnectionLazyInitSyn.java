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
/*
using synchonized keyword it will put lock which ever thread put locks first
Disadvantage : putting syncrhonize on methods makes it slow
 */
