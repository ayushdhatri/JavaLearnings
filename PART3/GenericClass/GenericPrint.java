package GenericClass;

public class GenericPrint<T> {
    T value;
    public T getPrintValue(){
        return this.value;
    }
    public void setPrintValue(T value){
        this.value = value;
    }
}
