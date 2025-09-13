package 練習問題１;

public class Main {
    public static void main(String[] args) {
        Checker<Integer> suji = x -> x % 2 == 0;
        Checker<String> moji = x -> x.isBlank();

        System.out.println(suji.check(4));
        System.out.println(moji.check("kkk"));

    }
}
