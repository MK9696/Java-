package 練習問題2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Integer sum: " + MathUtil.sum(intList));

        List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5);
        System.out.println("Double sum: " + MathUtil.sum(doubleList));
    }
}
