import java.util.Scanner;

public class Main {
    public static double DESCUENTO = 0.10;
    public static double UMBRAL_DESCUENTO = 1000;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double subtotal = pedirDouble(scanner, "Subtotal: ");
        double total = subtotal;

        if(subtotal > UMBRAL_DESCUENTO){
            total = total - (total * DESCUENTO);

        }

        System.out.printf("Total a pagar: %.2f%n", total);
    }

    public static double pedirDouble(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }
}