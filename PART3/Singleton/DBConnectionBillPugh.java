package Singleton;

public class DBConnectionBillPugh {

    private DBConnectionBillPugh(){

    }

    private static class DBConnectionHelper{
        private static final DBConnectionBillPugh instance = new DBConnectionBillPugh();
    }

    public DBConnectionBillPugh getInstance(){
        return DBConnectionHelper.instance;
    }

    
}

/*
 It is based out of eager intialization
  Nested class does not load at the time of initialization of the object, it is only load at the time it is used
  The Magic: How does it actually work?
This is the part interviewers care about. You need to understand the Java ClassLoader.

When your application starts, the JVM loads the DatabaseConnection class into memory.

However, the JVM does not load the inner SingletonHelper class yet. Because it hasn't been loaded, the INSTANCE has not been created. (This gives us our Lazy Initialization—no wasted memory!).

Later in your app, a thread calls DatabaseConnection.getInstance().

This method references SingletonHelper.INSTANCE. Now, the JVM is forced to load the SingletonHelper class into memory.

When a class is loaded, the JVM inherently guarantees that the class loading process is strictly thread-safe.
 It initializes the INSTANCE variable safely, even if a hundred threads call getInstance() at the exact same millisecond. (This gives us our Thread Safety without bottlenecks).

*/



