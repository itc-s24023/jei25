public class D53Q27 {
    // 商品名と値段を表す列挙型
    enum Udon {
        KAKE("かけ", 290),
        KITSUNE("きつね", 380),
        CURRY("カレー", 490),
        // 新しい商品を追加
        TEMPURA("天ぷら", 450);

        private String japaneseName; // 商品名
        private int price;           // 値段

        // コンストラクタで商品名と値段を設定
        Udon(String japaneseName, int price) {
            this.japaneseName = japaneseName;
            this.price = price;
        }

        // オブジェクトを文字列で表現する方法を定義
        @Override
        public String toString() {
            return japaneseName + " : " + price + "円";
        }
    }

    public class Q27 {
        public static void main(String[] args) {
            // 新しく追加した定数を出力
            System.out.println(Udon.TEMPURA);
        }
    }

}
