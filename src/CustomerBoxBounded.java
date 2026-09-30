public class CustomerBoxBounded <T extends Customer>{
    T value;

    public CustomerBoxBounded(T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
