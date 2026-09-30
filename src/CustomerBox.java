public class CustomerBox <T>{
    T value;

    public CustomerBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

}