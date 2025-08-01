public class D53Q21kadai {
        public static void main(String[] args) {
            // 10進数の63を2進数リテラル（0b）でbyte aに代入
            byte a = 0b111111;  // 63 = 0b111111

            // 10進数の64を8進数リテラル（0）でbyte bに代入
            byte b = 0100;      // 64 = 0100 (8進数)

            // 10進数の65を16進数リテラル（0x）でbyte cに代入
            byte c = 0x41;      // 65 = 0x41 (16進数)

            // 結果を確認
            System.out.println("変数aの値: " + a + " (2進数リテラル 0b111111)");
            System.out.println("変数bの値: " + b + " (8進数リテラル 0100)");
            System.out.println("変数cの値: " + c + " (16進数リテラル 0x41)");

            // 変換の確認
            System.out.println("\n=== 変換確認 ===");
            System.out.println("63の2進数表現: " + Integer.toBinaryString(63));
            System.out.println("64の8進数表現: " + Integer.toOctalString(64));
            System.out.println("65の16進数表現: " + Integer.toHexString(65).toUpperCase());
        }
    }

