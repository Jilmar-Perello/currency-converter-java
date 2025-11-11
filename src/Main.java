import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ExchangeRateClient client = new ExchangeRateClient();
        System.out.println("Ingresa una divisa: ");
        var currency = scanner.nextLine();
        CurrencyRate respuesta = client.CheckCurrency(currency);
        System.out.println("Ingrese la cantidad: ");
        int value=scanner.nextInt();

       // System.out.println(respuesta);
        System.out.println("Base Code: "+respuesta.base_code());
        System.out.println("Currency Rate: "+(respuesta.conversion_rates().get("MXN"))*value);

    }
}
