import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5Numeros {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int numero1 = 0;
        int numero2 = 0;

        try {
            System.out.println("Ingresa el valor del primer numero entero");
            numero1 = sc.nextInt();
            System.out.println("Ingresa el valor del segundo numero entero");
            numero2 = sc.nextInt();
            if (numero1 > numero2) {
                System.out.println("El primer numero es mayor y el segundo numero menor");
            } else if (numero1 < numero2) {
                System.out.println("El primer numero es menor y el segundo numero mayor");
            } else {
                System.out.println("Ambos numeros son iguales");
            }

        } catch (InputMismatchException e) {
            System.out.println("Has ingresado un valor incorrecto, por favor ejecuta nuevamente el programa");
        }
    }
}
