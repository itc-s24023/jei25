public class D51kadai {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("引数が不足しています。実行例: java D51kadai 1.1 2.2 3.3");
            return;
        }

        try {
            // コマンドライン引数の2番目を取得し、実数に変換
            double number = Double.parseDouble(args[1]);
            // 切り上げ
            double result = Math.ceil(number);
            // 結果を表示
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("引数を実数に変換できません。正しい値を入力してください。");
        }
    }
}
