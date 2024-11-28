<Title> Currency Exchange (Conversor de Monedas) </Title>

<p1>Descripcion</p1>

Conversor de monedas es una aplicación escrita en Java que permite convertir diferentes monedas
utilizando datos en tiempo real obtenidos de una API de tipo de cambio.Es una herramienta interactiva
para realizar conversiones precisas entre monedas internacionales con facilidad.

<p>Caracteristicas principales</p>
-Conversión de monedas con tasas actualizadas directamente desde una API.

-Opciones predefinidas para conversiones comunes (USD, ARS, BRL, COP).

-Posibilidad de ingresar manualmente los códigos de las monedas para conversiones personalizadas.

-Interfaz interactiva en la consola, disponible en inglés y español.

<p1>Estructura del projecto</p1>


<p2>Main.java</p2>

Contiene el menú principal y la lógica para interactuar con el usuario.
Opciones de conversión predefinidas y personalizadas.

<p2>ConnectingWithAPI.java</p2>

Se conecta a la API de Exchange Rate para obtener las tasas de conversión en tiempo real.
Maneja errores relacionados con la conexión o códigos de moneda inválidos.

<p2>ConversionMethods.java</p2>

Métodos que ejecutan la lógica de conversión de monedas, incluyendo validaciones de entrada y cálculos precisos.

<p2>CurrencyRecord.java</p2>

Define un registro para almacenar los datos obtenidos de la API, como la moneda base, la moneda objetivo y la tasa de conversión.


<p1>Uso</p1>

1. Ejecute el programa en su terminal.
2. Siga las instrucciones en pantalla para:
-Seleccionar una opción de conversión predefinida (USD, ARS, BRL, COP).
-Ingresar manualmente los códigos de monedas para conversiones personalizadas.
3. Ingrese el monto que desea convertir y vea los resultados en pantalla.

