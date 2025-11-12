public class CurrencyConverter {
    public String showMenu(){
        return """
                ======================================================
                          Bienvenido al conversor de monedas.
                
                1) Dolar [USD] => Peso argentino [ARS]
                2) Peso argentino [ARS] => Dolar [USD]
                3) Dolar [USD] => Peso mexicano [MXN]
                4) Peso mexicano [MXN] => Dolar [USD]
                5) Dolar [USD] => Quetzal [GTQ]
                6) Quetzal [GTQ] => Dolar [USD]
                7) Salir
                =======================================================
                Elija una opcion válida: """;
    }

    public Double converter(String currencyInput, String currencyOutput, Double value) {
        ExchangeRateClient client = new ExchangeRateClient();
        CurrencyRate respuesta = client.CheckCurrency(currencyInput);

        return (respuesta.conversion_rates().get(currencyOutput))*value;
    }
}
