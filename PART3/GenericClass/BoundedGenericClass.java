package GenericClass;

public class BoundedGenericClass<T extends Number> {
    T value;
    public T getPrintValue(){
        return this.value;
    }
    public void setPrintValue(T value){
        this.value = value;
    }

    
}
