import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4Numeros {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int numero = 0;

        try {
            System.out.println("Por favor ingresa un número entero: ");
            numero = sc.nextInt();
            if (numero >= 0) {
                System.out.println("El numero es positivo");
            } else {
                System.out.println("El numero es negativo");
            }

            if ((numero % 2) == 0) {
                System.out.println("El numero es par");
            } else {
                System.out.println("El numero es impar");
            }

        } catch (InputMismatchException e) {
            System.out.println("Has ingresado un valor incorrecto, por favor ejecuta nuevamente el programa");
        }
    }
}
