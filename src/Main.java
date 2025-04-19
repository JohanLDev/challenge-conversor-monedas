import com.conversor.service.CurrencyConverter;
import com.conversor.service.CurrencyConverterImpl;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverterImpl();

        try {
            System.out.print("Moneda origen (ej: CLP): ");
            String from = scanner.nextLine().toUpperCase();

            System.out.print("Moneda destino (ej: USD): ");
            String to = scanner.nextLine().toUpperCase();

            System.out.print("Monto a convertir: ");
            double amount = Double.parseDouble(scanner.nextLine());

            double result = converter.convert(from, to, amount);
            System.out.println("Resultado: " + result + " " + to);

        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }

    }
}