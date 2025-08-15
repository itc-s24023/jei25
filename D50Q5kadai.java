public class D50Q5kadai {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 3, 2, 1};
        bubbleSortAndPrint(numbers);
        System.out.println("-------------------");
        System.out.print("ソート結果:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    private static void bubbleSortAndPrint(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // 値を交換する
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                // ソート途中経過を出力
                System.out.print("ソート途中:");
                for (int num : array) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }
}

