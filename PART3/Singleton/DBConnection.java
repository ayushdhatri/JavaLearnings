package Singleton;
// This is singleton class and we have initialize the object using eager intialization
// It is called eager becuase static variables are created first when program starts and it keeps the 
// object of DBConnection ,even though it is not used

public class DBConnection {
    private static DBConnection conObject = new DBConnection();
    private DBConnection(){

    }
    public static DBConnection getInstance(){
        return conObject;
    }
    
}
