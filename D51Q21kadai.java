public class D51Q21kadai {
    // 異なる基数の値を計算するプログラム
        public static void main(String[] args) {
            // 異なる基数の値
            String value1 = "1101"; // 2進数の値
            String value2 = "7F";   // 16進数の値

            // 基数を指定
            int base1 = 2;  // 最初の値の基数（2進数）
            int base2 = 16; // 次の値の基数（16進数）

            // 10進数に変換
            // Integer.parseInt() を使用して基数から10進数に変換
            int decimal1 = Integer.parseInt(value1, base1);
            int decimal2 = Integer.parseInt(value2, base2);

            // 変換結果を表示
            System.out.println(value1 + " (Base-" + base1 + ") -> " + decimal1 + " (Base-10)");
            System.out.println(value2 + " (Base-" + base2 + ") -> " + decimal2 + " (Base-10)");

            // 計算（例：加算）
            int result = decimal1 + decimal2;

            // 最終結果を表示
            System.out.println("合計: " + decimal1 + " + " + decimal2 + " = " + result + " (Base-10)");
        }
    }

