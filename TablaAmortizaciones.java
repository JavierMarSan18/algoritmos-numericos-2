import java.text.DecimalFormat;
import java.util.Scanner;

public class TablaAmortizaciones {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Tabla de amortizaciones");
        System.out.println("Ingrese el monto del préstamo: ");
        Double monto = scanner.nextDouble();
        System.out.println("Ingrese la tasa de interés mensual: ");
        double tasaInteres = scanner.nextDouble();
        System.out.println("Ingrese el plazo: ");
        int plazo = scanner.nextInt();

        // Formatear los números a dos decimales
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        double saldo = monto;
        System.out.println("Periodo\t\tSaldo\t\tInteres\t\tAbono\t\tPago");
        for (int i = 1; i <= plazo; i++) {
            double interes = saldo * tasaInteres;
            double abono = (monto / plazo);
            double pago = interes + abono;
            System.out.println(i + "\t\t" +decimalFormat.format(saldo) + "\t\t" + decimalFormat.format(interes) + "\t\t" + decimalFormat.format(abono) + "\t\t" + decimalFormat.format(pago));
            saldo -= abono;
        }
    }
}