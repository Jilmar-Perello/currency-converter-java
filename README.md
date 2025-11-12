
# 💱 Java Currency Converter con API ExchangeRate
Este proyecto es una aplicación de consola en Java que permite convertir valores entre distintas monedas en tiempo real utilizando la API de ExchangeRate API. Es ideal para practicar integración de APIs, diseño modular y manejo de excepciones.

## 📂 Estructura del proyecto
```CurrencyConverter/
├── Main.java                 # Interfaz de usuario por consola y menú interactivo
├── CurrencyConverter.java   # Lógica de conversión entre monedas
├── ExchangeRateClient.java  # Cliente HTTP que consulta la API de ExchangeRate
└── CurrencyRate.java        # Record que representa la respuesta de la API
```

## 📦 Caracteristicas
### Conversión entre las siguientes monedas:
- USD ↔ ARS (Dólar estadounidense ↔ Peso argentino)
- USD ↔ MXN (Dólar estadounidense ↔ Peso mexicano)
- USD ↔ GTQ (Dólar estadounidense ↔ Quetzal guatemalteco)
- Menú interactivo en consola
- Validación básica de opciones
- Consulta tasas de cambio en tiempo real desde la API de ExchangeRate.

## 🧰 Requisitos
- Java JDK 17 o superior
- IDE como IntelliJ IDEA, Eclipse, o simplemente terminal con `javac` y `java`
- Una [API Key gratuita de ExchangeRate](https://www.exchangerate-api.com/)

## 🚀 Cómo ejecutar
1. Obtén tu API Key en [ExchangeRate API](https://www.exchangerate-api.com/).
3. Clona el repositorio en tu entorno local.
4. Agrega tu clave en la clase ``ExchangeRateClient.java``, por ejemplo:
  
```
private static final String API_KEY = "TU_API_KEY_AQUÍ";
```
5. Compila el proyecto:
```
javac Main.java CurrencyConverter.java ExchangeRateClient.java
```
6. Ejecuta la aplicación:
```
java Main
```

## 🧠 Ejemplo de uso
```
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
Elija una opcion válida:1
Ingrese el valor que desea convertir: 100
100.0 [USD] es igual a [141650.0] ARS
```

## 📌 Notas técnicas
- ``CurrencyConverter`` se encarga de abstraer la lógica de conversión y delega la consulta de tasas a ``ExchangeRateClient``.
- ``ExchangeRateClient`` realiza una solicitud HTTP GET a la API y devuelve un ``CurrencyRate`` con las tasas.
- ``CurrencyRate`` es un ``record`` que modela la respuesta JSON de la API.

## 👨‍💻 Autor
- Jilmar Perelló
- 📍Mexico
- 🛠️ Ingeniero en Desarrollo y Tecnologias de Software.







