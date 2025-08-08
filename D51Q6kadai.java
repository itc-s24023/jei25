public class D51Q6kadai {
        public static void main(String[] args) {
            // コマンドを事前に配列にまとめる
            String[] scenario = {
                    "i 100", // お金を投入
                    "b 1",   // 飲み物を購入
                    "i 50",  // お金を追加投入
                    "b 2",   // 別の飲み物を購入
                    "r"      // 返金
            };

            // VendingMachine2 のインスタンス生成
            VendingMachine2 vm = new VendingMachine2();

            // 配列のコマンドを順に実行
            for (String command : scenario) {
                vm.execCom(command);
            }
        }
    }

    // VendingMachine クラスの改良版
    class VendingMachine2 {
        // コンストラクタ
        public VendingMachine2() {
            System.out.println("VendingMachine2 が初期化されました！");
        }

        // コマンド実行メソッド
        public void execCom(String command) {
            // コマンドごとに処理を分岐
            System.out.println("コマンド実行: " + command);
            // 実際の処理ロジックはここに記述
        }
    }

    // Drink クラスの改良版
    class Drink2 {
        private String name;
        private int price;

        public Drink2(String name, int price) {
            this.name = name;
            this.price = price;
        }

        // ゲッター
        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }
    }


