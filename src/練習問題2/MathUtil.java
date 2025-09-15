package 練習問題2;

import java.util.List;

public class MathUtil {
    public static double sum(List<? extends Number> list) {
        double sum = 0;
        for (Number val : list) {
            sum += val.doubleValue();
        }

        return sum;
    }
}
