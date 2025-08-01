public class D53Q25kadai {
    public static void main(String[] args) {
        // char配列を用いてStringを生成
        char[] ch = {'A', 'B', 'C'};
        String s1 = new String("ABC");

        // 同じ値で新たなStringオブジェクトを生成（ただしJavaの内部的にリテラルプール経由で最適化される）
        String s2 = "ABC"; // 修正: s2をリテラル参照に変換

        // 基本的に「==」はメモリ位置の比較。
        boolean b1 = s1 == s2; // <=結果: JAVAでリテラルプール使用でOP意図TEST中等へ'

    }
}

