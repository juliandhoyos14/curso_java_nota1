import java.util.Scanner;

public class Ejercicio1FuncionCuadratica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int valorA;
        int valorB;
        int valorC;
        double terminoRaiz;
        double valorX1;
        double valorX2;

        System.out.println("Ingrese el valor del termino a");
        valorA = scanner.nextInt();
        System.out.println("Ingrese el valor del termino b");
        valorB = scanner.nextInt();
        System.out.println("Ingrese el valor del termino c");
        valorC = scanner.nextInt();

        terminoRaiz = Math.abs(Math.pow(valorB, 2) - (4 * valorA * valorC));

        valorX1 = (-1 * valorB + Math.sqrt(terminoRaiz)) / (2 * valorA);
        valorX2 = (-1 * valorB - Math.sqrt(terminoRaiz)) / (2 * valorA);

        System.out.println("Valor de X1 = " + valorX1);
        System.out.println("Valor de X2 = " + valorX2);
    }
}
