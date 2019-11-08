public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (SoNguyen(i)) {
                System.out.println(i + " ");
            }
        }
    }
    public static boolean SoNguyen(int n){
        if (n < 2 ) return false;
        for (int i =2; i < (n-1); i++){
            if (n % i ==0)
                return false;
        }
        return true;
    }
}
