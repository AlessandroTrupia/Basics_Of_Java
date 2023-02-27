package GenericClass;

public class GenericClass <T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T valueToSet) {
        this.t = valueToSet;
    }

    public static <T> boolean isEqual(GenericClass<T> gc1, GenericClass<T> gc2){
        return gc1.getT().equals(gc2.getT());
    }

}
