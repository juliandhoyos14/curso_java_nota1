import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio7Fechas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        int dia;
        int mes;
        int annio;
        boolean fechaCorrecta;

        while (!salir) {

            System.out.println("1. Validar Fecha");
            System.out.println("2. Salir");

            try {

                System.out.println("Digita una de las opciones");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        fechaCorrecta = true;
                        System.out.println("Ingresa el dia");
                        dia = sc.nextInt();
                        System.out.println("Ingresa el mes");
                        mes = sc.nextInt();
                        System.out.println("Ingresa el año");
                        annio = sc.nextInt();

                        if (annio <= 0) {
                            System.out.println("La fecha es incorrecta, el año debe ser mayor a cero");
                            fechaCorrecta = false;
                        }
                        if ((mes < 1) || (mes > 12)) {
                            System.out.println("La fecha es incorrecta, el mes esta incorrecto");
                            fechaCorrecta = false;
                        }
                        if ((dia >= 1) && (dia <= 31)) {
                            if ((dia > 28) && (mes == 2)) {
                                System.out.println("La fecha es incorrecta, el mes 2 no tiene mas de 28 dias");
                                fechaCorrecta = false;
                            } else if ((dia > 30) && ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11))) {
                                System.out.println("La fecha es incorrecta, el mes " + mes + " no tiene mas de 30 dias");
                                fechaCorrecta = false;
                            }
                        } else {
                            System.out.println("La fecha es incorrecta, el dia no corresponde");
                            fechaCorrecta = false;
                        }
                        if (fechaCorrecta) {
                            System.out.println("La fecha es correcta");
                        }
                        System.out.println("Ingrese cualquier valor y presione enter para continuar");
                        sc.next();
                        break;
                    case 2:
                        salir = true;
                        break;
                    default:
                        System.out.println("La opcion es solo numeros entre 1 y 2");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingresaste un valor errado, selecciona una opcion valida");
                sc.next();
            }
        }
    }
}
