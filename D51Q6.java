public class D51Q6 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("商品コードを1つ指定してください。");
            return;
        }

        String code = args[0];
        System.out.println("商品コード：" + code);

        String category = getCategory(code.substring(0, 3));
        String subCategory = getSubCategory(code.substring(3, 6));
        String detail = code.substring(6);

        System.out.println("大分類：" + category);
        System.out.println("小分類：" + subCategory);
        System.out.println("詳細コード：" + detail);
    }

    private static String getCategory(String codePart) {
        switch (codePart) {
            case "BBB":
                return "肉類";
            default:
                return "不明";
        }
    }

    private static String getSubCategory(String codePart) {
        switch (codePart) {
            case "401":
                return "加工肉";
            default:
                return "不明";
        }
    }
}

