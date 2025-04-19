package com.conversor.ui;

import com.conversor.service.CurrencyConverter;
import com.conversor.service.CurrencyConverterImpl;

import java.util.Scanner;

public class Menu {

    private final CurrencyConverter converter = new CurrencyConverterImpl();
    private final Scanner scanner = new Scanner(System.in);

    public void mostrar() {
        int opcion;

        do {
            exibirMenu();
            opcion = leerOpcion();

            String from = "";
            String to = "";

            switch (opcion) {
                case 1 -> {
                    from = "USD";
                    to = "ARS";
                }
                case 2 -> {
                    from = "ARS";
                    to = "USD";
                }
                case 3 -> {
                    from = "USD";
                    to = "BRL";
                }
                case 4 -> {
                    from = "BRL";
                    to = "USD";
                }
                case 5 -> {
                    from = "USD";
                    to = "COP";
                }
                case 6 -> {
                    from = "COP";
                    to = "USD";
                }
                case 7 -> {
                    System.out.println("¡Gracias por usar el conversor! Hasta luego.");
                    break;
                }
                default -> {
                    System.out.println("Opción inválida. Intente nuevamente.");
                    continue;
                }
            }

            if (opcion >= 1 && opcion <= 6) {
                System.out.print("Ingrese el monto a convertir: ");
                double monto = scanner.nextDouble();

                try {
                    double resultado = converter.convert(from, to, monto);
                    System.out.printf("Resultado: %.2f %s = %.2f %s%n", monto, from, resultado, to);
                } catch (Exception e) {
                    System.out.println("Error durante la conversión: " + e.getMessage());
                }
            }

        } while (opcion != 7);
    }

    private void exibirMenu() {
        System.out.println("""
                ***************************************************
                Sea bienvenido/a al Conversor de Moneda =]

                1) Dólar =>> Peso argentino
                2) Peso argentino =>> Dólar
                3) Dólar =>> Real brasileño
                4) Real brasileño =>> Dólar
                5) Dólar =>> Peso colombiano
                6) Peso colombiano =>> Dólar
                7) Salir

                Elija una opción válida:
                ***************************************************
                """);
    }

    private int leerOpcion() {
        System.out.print("Opción: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Por favor ingrese un número válido: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

}
