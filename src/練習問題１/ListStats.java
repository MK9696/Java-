package 練習問題１;

import java.util.List;

public class ListStats {
    public static double getSum(List<? extends Number> list) {
        if (list.isEmpty()) return 0;

        double sum = 0;
        for (Number val : list) {
            sum += val.doubleValue();
        }

        return sum;
    }

    public static double getMax(List<? extends Number> list) {
        double max = 0;

        for (Number val : list) {
            if (max < val.doubleValue()) max = val.doubleValue();
        }
        
        return max;
    }

}
