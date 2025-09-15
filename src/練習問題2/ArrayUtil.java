package 練習問題2;

public class ArrayUtil {
    public static <T> void swap(T[] array, int i, int j) {
        T swap = array[i];
        array[i] = array[j];
        array[j] = swap;
    }
}
