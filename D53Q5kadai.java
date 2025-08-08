public class D53Q5kadai {
        public static void main(String[] args) {
            if (args.length % 4 != 0 || args.length == 0) {
                System.out.println("エラー: 引数は [数量 商品名 単価 タイプ] の4つを1セットで入力してください。");
                return;
            }

            int totalTaxExcluded = 0; // 税抜合計
            int totalTaxIncluded = 0; // 税込合計

            System.out.printf("%-8s %8s %8s %8s%n", "商品名", "税抜", "税込", "タイプ");

            for (int i = 0; i < args.length; i += 4) {
                try {
                    int quantity = Integer.parseInt(args[i]);
                    String name = args[i + 1];
                    int price = Integer.parseInt(args[i + 2]);
                    char type = args[i + 3].charAt(0);

                    int taxExcluded = quantity * price;
                    int taxIncluded;

                    String typeName;
                    if (type == 'f') {
                        taxIncluded = (int) Math.round(taxExcluded * 1.08); // 食品等
                        typeName = "食品等";
                    } else {
                        taxIncluded = (int) Math.round(taxExcluded * 1.10); // その他
                        typeName = "その他";
                    }

                    totalTaxExcluded += taxExcluded;
                    totalTaxIncluded += taxIncluded;

                    System.out.printf("%-8s %6d円 %6d円 %6s%n", name, taxExcluded, taxIncluded, typeName);

                } catch (NumberFormatException e) {
                    System.out.println("エラー: 数値変換できない引数があります。");
                    return;
                }
            }

            System.out.printf("%-8s %6d円 %6d円%n", "合計", totalTaxExcluded, totalTaxIncluded);
        }
    }


