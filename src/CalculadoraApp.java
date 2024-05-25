import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("***...:: Aplicación de Calculadora::...***");

        //mostramos el menu:
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Division
                5. Salir
                """);

        System.out.print("Digite la operacion que desea realizar: ");
        var operacion = Integer.parseInt(consola.nextLine());

        if (operacion >= 1 && operacion <= 4) {

            System.out.print("Ingrese el valor del primer operando: ");
            var operando1 = Integer.parseInt(consola.nextLine());

            System.out.print("Ingrese el valor del segundo operando: ");
            var operando2 = Integer.parseInt(consola.nextLine());

            int resultado;


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

                default -> {
                    System.out.println("Operacion incorrecta");
                }

            }


        }else{
            System.out.println("La opcion no es valida!!!");
        }


    }
}











































