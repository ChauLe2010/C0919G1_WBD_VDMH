

    public class Displau {
        public static void main(String[] args) {
            int cout =0;
            int number = 20;
            for (int i = 0; cout < number; i++) {
                if (SoNguyenTo(i)) {
                    cout++;
                    System.out.print(i + " ");
                }
            }
        }

        public static boolean SoNguyenTo(int n) {

            if (n < 2) {
                return false;
            }
            for (int i = 2; i < (n-1); i++) {
                if (n % i == 0) return false;

            }


            return true;
        }
    }
