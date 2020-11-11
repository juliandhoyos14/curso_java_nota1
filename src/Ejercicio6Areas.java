import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6Areas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        float longitudLadoCuadrado;
        float areaCuadrado;

        float longitudBaseRectangulo;
        float longitudAlturaRectangulo;
        float areaRectangulo;

        float longitudBaseTriangulo;
        float longitudAlturaTriangulo;
        float areaTriangulo;

        double longitudRadioCirculo;
        double areaCirculo;

        double longitudPrimerRadioElipse;
        double longitudSegundoRadioElipse;
        double areaElipse;

        double longitudPrimeraBaseTrapecio;
        double longitudSegundaBaseTrapecio;
        double longitudAlturaTrapecio;
        double areaTrapecio;

        while (!salir) {

            System.out.println("1. Area del cuadrado");
            System.out.println("2. Area del rectangulo");
            System.out.println("3. Area del triangulo");
            System.out.println("4. Area del circulo");
            System.out.println("5. Area de la elipse");
            System.out.println("6. Area del trapecio");
            System.out.println("7. Salir");

            try {

                System.out.println("Digita una de las opciones");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Ingresa la longitud del lado del cuadrado (medido en cm)");
                        longitudLadoCuadrado = sc.nextFloat();
                        areaCuadrado = longitudLadoCuadrado * longitudLadoCuadrado;
                        System.out.println("El area del cuadrado es " + areaCuadrado + " cm2");
                        System.out.println("Ingrese cualquier valor y presione enter para continuar");
                        sc.next();
                        break;
                    case 2:
                        System.out.println("Ingresa la longitud de la base del rectangulo (medido en cm)");
                        longitudBaseRectangulo = sc.nextFloat();
                        System.out.println("Ingresa la longitud de la altura del rectangulo (medido en cm)");
                        longitudAlturaRectangulo = sc.nextFloat();
                        areaRectangulo = longitudBaseRectangulo * longitudAlturaRectangulo;
                        System.out.println("El area del rectangulo es " + areaRectangulo + " cm2");
                        System.out.println("Ingrese cualquier valor y presione enter para continuar");
                        sc.next();
                        break;
                    case 3:
                        System.out.println("Ingresa la longitud de la base del triangulo (medido en cm)");
                        longitudBaseTriangulo = sc.nextFloat();
                        System.out.println("Ingresa la longitud de la altura del triangulo (medido en cm)");
                        longitudAlturaTriangulo = sc.nextFloat();
                        areaTriangulo = (longitudBaseTriangulo * longitudAlturaTriangulo) / 2;
                        System.out.println("El area del triangulo es " + areaTriangulo + " cm2");
                        System.out.println("Ingrese cualquier valor y presione enter para continuar");
                        sc.next();
                        break;
                    case 4:
                        System.out.println("Ingresa la longitud del radio del circulo (medido en cm)");
                        longitudRadioCirculo = sc.nextDouble();
                        areaCirculo = Math.PI * Math.pow(longitudRadioCirculo, 2);
                        System.out.println("El area del circulo es " + areaCirculo + " cm2");
                        System.out.println("Ingrese cualquier valor y presione enter para continuar");
                        sc.next();
                        break;
                    case 5:
                        System.out.println("Ingresa la longitud del primer radio de la elipse (medido en cm)");
                        longitudPrimerRadioElipse = sc.nextDouble();
                        System.out.println("Ingresa la longitud del segundo radio de la elipse (medido en cm)");
                        longitudSegundoRadioElipse = sc.nextDouble();
                        areaElipse = Math.PI * longitudPrimerRadioElipse * longitudSegundoRadioElipse;
                        System.out.println("El area de la elipse es " + areaElipse + " cm2");
                        System.out.println("Ingrese cualquier valor y presione enter para continuar");
                        sc.next();
                        break;
                    case 6:
                        System.out.println("Ingresa la longitud de la primera base del trapecio (medido en cm)");
                        longitudPrimeraBaseTrapecio = sc.nextDouble();
                        System.out.println("Ingresa la longitud de la segunda base del trapecio (medido en cm)");
                        longitudSegundaBaseTrapecio = sc.nextDouble();
                        System.out.println("Ingresa la longitud de la altura del trapecio (medido en cm)");
                        longitudAlturaTrapecio = sc.nextDouble();
                        areaTrapecio = ((longitudPrimeraBaseTrapecio + longitudSegundaBaseTrapecio) / 2) * longitudAlturaTrapecio;
                        System.out.println("El area del trapecio es " + areaTrapecio + " cm2");
                        System.out.println("Ingrese cualquier valor y presione enter para continuar");
                        sc.next();
                        break;
                    case 7:
                        salir = true;
                        break;
                    default:
                        System.out.println("La opcion es solo numeros entre 1 y 7");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingresaste un valor errado, selecciona una opcion valida");
                sc.next();
            }
        }

    }
}
