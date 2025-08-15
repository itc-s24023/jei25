public class D53Q5{
    private static int[] taxes = {8, 10};
    private static int FOODS = 0; // 食品等
    private static int OTHER = 1; // その他
    public static void main(String[] args) {
        int dataSize = Integer.parseInt(args[0]); // データ数
        String[] names = new String[dataSize]; // 商品名
        int[] prices = new int[dataSize]; // 単価
        int[] nums = new int[dataSize]; // 数量
        char[] types = new char[dataSize]; // タイプ（食品等又はその他）

        int argsIdx = 1;
        for (int i = 0; i < dataSize; i++) {
            names[i] = args[argsIdx++];
            prices[i] = Integer.parseInt(args[argsIdx++]);
            nums[i] = Integer.parseInt(args[argsIdx++]);
            types[i] = args[argsIdx++].charAt(0);
        }

        System.out.println("商品名\t 税抜き\t 税込み\t タイプ");
        for (int i = 0; i < dataSize; i++) {
            int taxExcluded = prices[i] * nums[i]; // 税抜価格
            int taxIncluded, taxType; // 税込価格、タイプによる税率の違い
            taxType = types[i] == 'f' ? FOODS : OTHER;
            taxIncluded = taxExcluded * (100 + taxes[taxType]) / 100;
            System.out.print(names[i] + "\t" + taxExcluded + "円\t");
            System.out.println(taxIncluded + "円\t" + viewType(types[i]));
        }
    }

    private static String viewType(char c) {
        return c == 'f' ? "食品等" : "その他";
    }
}
