import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ingresoUsuario = new Scanner(System.in);
        ConnectingWithAPI consulta = new ConnectingWithAPI();

        EXTERNA:
        while(true){
            System.out.println("---------------------------------------------\n");
            System.out.println("******CURRENCY EXCHANGE - CONVERSOR DE MONEDAS*****\n");
            System.out.println("1) USD (Dolar) =>> ARS (Peso Argentino)\n"
                    +"2) ARS (Peso Argentino) =>> USD (Dolar)\n"
                    +"3) USD (Dolar) =>> BRL (Real Brazilero)\n"
                    +"4) BRL (Real Brazilero) =>> USD (Dolar)\n"
                    +"5) USD (Dolar) =>> COP (Peso Colombiano)\n"
                    + "6) COP (Peso Colombiano) =>> USD (Dolar)\n"
                    +"7) other options.../ otras opciones...\n"
                    +"8) Exit/Salida\n");
            System.out.println("SELECT OPTION: / SELECCIONE LA OPCION: ");

            int opcion = ingresoUsuario.nextInt();
            ingresoUsuario.nextLine();

            switch(opcion){
                case 1 :
                    ConversionMethods.convertirDeLista("USD", "ARS", consulta, ingresoUsuario);
                    break;
                case 2 :
                    ConversionMethods.convertirDeLista("ARS", "USD", consulta, ingresoUsuario);
                    break;
                case 3 :
                    ConversionMethods.convertirDeLista("USD", "BRL", consulta, ingresoUsuario);
                    break;
                case 4 :
                    ConversionMethods.convertirDeLista("BRL", "USD", consulta, ingresoUsuario);
                    break;
                case 5 :
                    ConversionMethods.convertirDeLista("USD", "COP", consulta, ingresoUsuario);
                    break;
                case 6 :
                    ConversionMethods.convertirDeLista("COP", "USD", consulta, ingresoUsuario);
                    break;

                case 7 :
                    ConversionMethods.convertirOtraMoneda(consulta, ingresoUsuario);
                    break;
                case 8 :
                    System.out.println("EXITING FROM CURRENCY CONVERTER/ SALIENDO DE CONVERSOR DE MONEDAS");
                    break EXTERNA;
                default:
                    System.out.println("Please insert the correct option / Por favor ingrese opcion valida");
                    break;
            }

        }

    }
}
