public class D51Q24 {
    public class Main {
        public static void main(String[] args) {
            System.out.println("100未満の3と5の公倍数:");

            for (int i = 1; i < 100; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i);
                }
            }
        }
    }

}
