package 練習問題１;

public class Utility {
    public static <T> void swap(T[] array, int i, int j) {
        T swap = array[i];
        array[i] = array[j];
        array[j] = swap;
    }
}
