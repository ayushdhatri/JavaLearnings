public interface DefaultAbstract {
    void fly();
    default int getMinimumFlyHeight(){
        return 102;
    }
}
