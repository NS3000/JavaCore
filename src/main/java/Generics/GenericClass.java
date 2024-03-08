package Generics;

public class GenericClass<T> {
    T obj;
    void setObj(T obj){
        this.obj=obj;
    }
    T getObj(){
        return obj;
    }
}
