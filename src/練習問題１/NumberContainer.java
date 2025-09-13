package 練習問題１;

public class NumberContainer<T extends Number> {
    private T value;

    public NumberContainer(T value) {
        this.value = value;
    }

    public double getDoubleValue() {
        return value.doubleValue();
    }

    public boolean isPositive() {
        return value.intValue() > 0;
    }
}
