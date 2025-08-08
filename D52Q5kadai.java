public class D52Q5kadai {
        public static void main(String[] args) {
            int[] numbers = {3, 194, 13, 39, 45}; // テスト用の数値
            printGraph(numbers, 10); // 目盛りを10単位で設定
        }

        public static void printGraph(int[] numbers, int scale) {
            int maxNumber = getMaxNumber(numbers);
            int maxScale = (maxNumber + scale - 1) / scale; // 切り上げ

            // グラフの各行を描画
            for (int number : numbers) {
                int stars = number / scale; // 目盛り単位での数を計算
                System.out.printf("%-4d : %s%n", number, "*".repeat(stars));
            }

            // 水平線の描画
            System.out.print("     ");
            for (int i = 0; i < maxScale; i++) {
                System.out.print("+----");
            }
            System.out.println("+");

            // 目盛りの数字を描画
            System.out.print("     ");
            for (int i = 0; i <= maxScale * scale; i += scale) {
                System.out.printf("%-5d", i);
            }
            System.out.println();
        }

        public static int getMaxNumber(int[] numbers) {
            int max = numbers[0];
            for (int num : numbers) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        }
    }



