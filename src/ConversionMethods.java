import java.util.Scanner;


public class ConversionMethods {
    public static void convertirDeLista(String moneda_base, String moneda_target, ConnectingWithAPI consulta, Scanner ingresoUsuario) {
        double monto;
        double montoConvertido;

        CurrencyRecord moneda = consulta.buscarMoneda(moneda_base, moneda_target);

        if (moneda == null){
            System.out.println(" Please enter valid code / Por favor ingrese codigo correcto");
            return;
        }

        System.out.println("\n---------------------------------------------\n");
        System.out.println("Conversion rate: / Tipo de cambio: "
                + " 1 " + moneda_base + "  =  " + moneda.conversion_rate() + " " + moneda_target);
        System.out.print("INPUT THE AMOUNT (" + moneda_base + ") / INGRESE EL MONTO (" + moneda_base + "): ");

        try{
            monto = Double.parseDouble(ingresoUsuario.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Invalid amount entered, try again / Monto ingresado no valido, intente de nuevo");
            return;
        }

        double scale = Math.pow(10, 2);
        montoConvertido = Math.round((monto * moneda.conversion_rate()) *scale) / scale;

        System.out.println("\n---------------------------------------------\n");
        System.out.println("Result / Resultado:  " + monto + " " + moneda_base + "  =  " + montoConvertido + " " + moneda.target_code() + "\n");
    }

    public static void convertirOtraMoneda(ConnectingWithAPI consulta, Scanner ingresoUsuario) {
        System.out.println("INPUT THE CODE OF THE BASE CURRENCY: / INGRESE EL CODIGO DE MONEDA BASE: ");
        String moneda_base = ingresoUsuario.nextLine().toUpperCase();
        System.out.println("INPUT THE CODE OF THE OBJECTIVE CURRENCY: / INGRESE EL CODIGO DE MONEDA OBJETIVA: ");
        String moneda_objetiva = ingresoUsuario.nextLine().toUpperCase();
        convertirDeLista(moneda_base, moneda_objetiva, consulta, ingresoUsuario);
        }
    }


