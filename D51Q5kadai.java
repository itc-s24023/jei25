public class D51Q5kadai {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("引数が不足しています。例: java D51Q5kadai 61.8");
            return;
        }

        try {
            // コマンドライン引数で使用量を取得
            double usage = Double.parseDouble(args[0]);

            // 値上げ後の基本料金と重量単価
            int baseRate = 1000 + 100; // 100円値上げ
            double unitRate = 11.0;    // 元々10円だったのを1円値上げ

            // ガス代金の計算
            int total = (int) Math.ceil(baseRate + (usage * unitRate));

            // 結果を表示
            System.out.println("今月のガス代金は" + total + "円");
        } catch (NumberFormatException e) {
            System.out.println("使用量を実数で入力してください。例: 61.8");
        }
    }
}
