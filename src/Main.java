import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter currencyConverter = new CurrencyConverter();
        Double value, result;
        int option;

        String[][] conversions = {
                {"USD", "ARS"},
                {"ARS", "USD"},
                {"USD", "MXN"},
                {"MXN", "USD"},
                {"USD", "GTQ"},
                {"GTQ", "USD"}
        };

        while (true){
            try{
                System.out.print(currencyConverter.showMenu());
                option = scanner.nextInt();
                if (option >= 1 && option <= conversions.length) {
                    System.out.print("Ingrese el valor que desea convertir: ");
                    value = scanner.nextDouble();
                    String currencyInput = conversions[option - 1][0];
                    String currencyOutput = conversions[option - 1][1];
                    result = currencyConverter.converter(currencyInput, currencyOutput, value);
                    System.out.println(value+" ["+currencyInput+"] es igual a ["+result+"] "+currencyOutput);
                } else if (option == 7) {
                    System.out.println("¡Gracias!");
                    break;
                } else {
                    System.out.println("Opción no válida");
                }
            }catch (InputMismatchException e){
                System.out.println("Lo siento, lo que ingresaste no es válido. Intenta nuevamente.");
                scanner.nextLine();
            }
        }

    }
}
