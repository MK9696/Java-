package 練習問題2;

import java.util.List;

public class ListUtil {
    public static void asList(List<? super Number> list, List<? extends Number> list2) {
        for (Number val : list2) {
            list.add(val);
        }
    }
}
