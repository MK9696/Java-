package 練習問題１;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Function<String, String> func1 = String::toUpperCase;
        Function<String, String> func2 = x -> "***" + x;

        String str = func1.apply("Masayoshi");
        System.out.println(func2.apply(str));
    }
}
