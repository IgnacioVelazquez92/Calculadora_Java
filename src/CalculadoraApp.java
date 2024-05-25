import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while (true) {
            System.out.println("***...:: Aplicación de Calculadora::...***");
            mostrarMenu();
            try {
                var operacion = Integer.parseInt(consola.nextLine());

                if (operacion >= 1 && operacion <= 4) {
                    ejecutarOperacion(operacion , consola);
                }
                else if(operacion ==5) {
                    System.out.println("Hasta pronto...");
                    break;
                }
                else System.out.println("La opcion no es valida!!!");
            }
            catch (Exception e) {
                System.out.println("Opción ingresada no valida \n" + e.getMessage());
            }


        }
    }

    private static void mostrarMenu(){
        //mostramos el menu:
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Division
                5. Salir
                """);

        System.out.print("Digite la operacion que desea realizar: ");
    }

    private static void ejecutarOperacion(int operacion, Scanner consola){
        System.out.print("Ingrese el valor del primer operando: ");
        var operando1 = Double.parseDouble(consola.nextLine());

        System.out.print("Ingrese el valor del segundo operando: ");
        var operando2 = Double.parseDouble(consola.nextLine());

        double resultado;

        switch (operacion) {
            case 1 -> {
                resultado = operando1 + operando2;
                System.out.println("resultado = " + resultado);
            }
            case 2 -> {
                resultado = operando1 - operando2;
                System.out.println("resultado = " + resultado);
            }
            case 3 -> {
                resultado = operando1 * operando2;
                System.out.println("resultado = " + resultado);

            }
            case 4->{
                resultado = operando1/operando2;
                System.out.println("resultado = " + resultado);
            }
        }
    }
}











































