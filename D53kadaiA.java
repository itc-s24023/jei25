public class D53kadaiA {
    public static void main(String[] args) {
        // 引数が空の場合のエラーチェック
        if (args.length == 0) {
            System.out.println("エラー: 引数がありません。整数を入力してください。");
            return;
        }

        int sum = 0;

        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg); // 文字列 → 整数変換
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("エラー: 数値ではない引数があります → " + arg);
                return;
            }
        }

        System.out.println("合計=" + sum);
    }
}
