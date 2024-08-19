public class Binario {
    public static void main(String[] args) {
        int number = 0;
        int [] binario = new int[8];
        for (int i = 7; i >= 0; i--){
            int couciente = number/2;
            int modulo = number%2;
            binario[i] = modulo;
            number = couciente;
        }
        for (int item : binario) {
            System.out.print(item);
        }
        System.out.println("");
    }
}
