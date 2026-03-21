package Singleton;

public class DBConnectionDoubleLocking {
    public static volatile DBConnectionDoubleLocking conObj;
    private DBConnectionDoubleLocking(){

    }
    public static DBConnectionDoubleLocking getInstance(){
        if(conObj == null){
            synchronized (DBConnectionDoubleLocking.class){
                if(conObj == null){
                    conObj = new DBConnectionDoubleLocking();
                }
            }
        }
        return conObj;
    }
    
}
/*

    Lets say we have multiple cores in our cpu, and these threads runs on one of these cores, each core is having their own cache which is called l1 cache
    so all these variables are first modified in cache and then periodically updated in the memory sectino which represents the actual variables
    so lets say a thread is running on a core and updates  cache and remove lock and meanwhile another thread came check the memory that it is still null becuase
    changes made by 1st thread is still in cache not updated in memory, so thread 2 also creates new conObj
    To avoid this problem we added volatile keyword to the variable which ensure that read-write operation happens on memory rather than cache
 */
