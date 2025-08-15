class D50Q25kadai {
    public static void main(String[] args) {
        for (int i = 0; i <= 8; i++) {
            if (i % 2 != 0) // i が奇数の場合はスキップ
                continue;
            System.out.print(i); // 偶数を表示
        }
    }
}
