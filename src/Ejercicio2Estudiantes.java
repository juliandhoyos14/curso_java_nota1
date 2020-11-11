import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2Estudiantes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean salir = false;
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();
        Estudiante estudiante3 = new Estudiante();
        Estudiante estudiante4 = new Estudiante();
        Estudiante estudiante5 = new Estudiante();

        while (!salir) {

            System.out.println("1. Ingresar datos estudiante 1");
            System.out.println("2. Ingresar datos estudiante 2");
            System.out.println("3. Ingresar datos estudiante 3");
            System.out.println("4. Ingresar datos estudiante 4");
            System.out.println("5. Ingresar datos estudiante 5");
            System.out.println("6. Calcular notas");
            System.out.println("7. Salir");

            try {

                System.out.println("Digita una de las opciones");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        if (!estudiante1.isDatosCompletos()) {
                            System.out.println("Nombres Estudiante 1");
                            estudiante1.setNombres(sc.next());
                            System.out.println("Apellidos Estudiante 1");
                            estudiante1.setApellidos(sc.next());
                            System.out.println("Edad Estudiante 1");
                            estudiante1.setEdad(sc.nextInt());
                            System.out.println("Materia Estudiante 1");
                            estudiante1.setNombreMateria(sc.next());
                            System.out.println("Nota 1");
                            estudiante1.setNota1(sc.nextFloat());
                            System.out.println("Nota 2");
                            estudiante1.setNota2(sc.nextFloat());
                            System.out.println("Nota 3");
                            estudiante1.setNota3(sc.nextFloat());
                            System.out.println("Nota 4");
                            estudiante1.setNota4(sc.nextFloat());
                            estudiante1.setDatosCompletos(true);
                        } else {
                            System.out.println("Los datos del estudiante 1 ya fueron ingresados");
                        }
                        break;
                    case 2:
                        if (!estudiante2.isDatosCompletos()) {
                            System.out.println("Nombres Estudiante 2");
                            estudiante2.setNombres(sc.next());
                            System.out.println("Apellidos Estudiante 2");
                            estudiante2.setApellidos(sc.next());
                            System.out.println("Edad Estudiante 2");
                            estudiante2.setEdad(sc.nextInt());
                            System.out.println("Materia Estudiante 2");
                            estudiante2.setNombreMateria(sc.next());
                            System.out.println("Nota 1");
                            estudiante2.setNota1(sc.nextFloat());
                            System.out.println("Nota 2");
                            estudiante2.setNota2(sc.nextFloat());
                            System.out.println("Nota 3");
                            estudiante2.setNota3(sc.nextFloat());
                            System.out.println("Nota 4");
                            estudiante2.setNota4(sc.nextFloat());
                            estudiante2.setDatosCompletos(true);
                        } else {
                            System.out.println("Los datos del estudiante 2 ya fueron ingresados");
                        }
                        break;
                    case 3:
                        if (!estudiante3.isDatosCompletos()) {
                            System.out.println("Nombres Estudiante 3");
                            estudiante3.setNombres(sc.next());
                            System.out.println("Apellidos Estudiante 3");
                            estudiante3.setApellidos(sc.next());
                            System.out.println("Edad Estudiante 3");
                            estudiante3.setEdad(sc.nextInt());
                            System.out.println("Materia Estudiante 3");
                            estudiante3.setNombreMateria(sc.next());
                            System.out.println("Nota 1");
                            estudiante3.setNota1(sc.nextFloat());
                            System.out.println("Nota 2");
                            estudiante3.setNota2(sc.nextFloat());
                            System.out.println("Nota 3");
                            estudiante3.setNota3(sc.nextFloat());
                            System.out.println("Nota 4");
                            estudiante3.setNota4(sc.nextFloat());
                            estudiante3.setDatosCompletos(true);
                        } else {
                            System.out.println("Los datos del estudiante 3 ya fueron ingresados");
                        }
                        break;
                    case 4:
                        if (!estudiante4.isDatosCompletos()) {
                            System.out.println("Nombres Estudiante 4");
                            estudiante4.setNombres(sc.next());
                            System.out.println("Apellidos Estudiante 4");
                            estudiante4.setApellidos(sc.next());
                            System.out.println("Edad Estudiante 4");
                            estudiante4.setEdad(sc.nextInt());
                            System.out.println("Materia Estudiante 4");
                            estudiante4.setNombreMateria(sc.next());
                            System.out.println("Nota 1");
                            estudiante4.setNota1(sc.nextFloat());
                            System.out.println("Nota 2");
                            estudiante4.setNota2(sc.nextFloat());
                            System.out.println("Nota 3");
                            estudiante4.setNota3(sc.nextFloat());
                            System.out.println("Nota 4");
                            estudiante4.setNota4(sc.nextFloat());
                            estudiante4.setDatosCompletos(true);
                        } else {
                            System.out.println("Los datos del estudiante 4 ya fueron ingresados");
                        }
                        break;
                    case 5:
                        if (!estudiante5.isDatosCompletos()) {
                            System.out.println("Nombres Estudiante 5");
                            estudiante5.setNombres(sc.next());
                            System.out.println("Apellidos Estudiante 5");
                            estudiante5.setApellidos(sc.next());
                            System.out.println("Edad Estudiante 5");
                            estudiante5.setEdad(sc.nextInt());
                            System.out.println("Materia Estudiante 5");
                            estudiante5.setNombreMateria(sc.next());
                            System.out.println("Nota 1");
                            estudiante5.setNota1(sc.nextFloat());
                            System.out.println("Nota 2");
                            estudiante5.setNota2(sc.nextFloat());
                            System.out.println("Nota 3");
                            estudiante5.setNota3(sc.nextFloat());
                            System.out.println("Nota 4");
                            estudiante5.setNota4(sc.nextFloat());
                            estudiante5.setDatosCompletos(true);
                        } else {
                            System.out.println("Los datos del estudiante 4 ya fueron ingresados");
                        }
                        break;
                    case 6:
                        if (estudiante1.isDatosCompletos() && estudiante2.isDatosCompletos() &&
                        estudiante3.isDatosCompletos() && estudiante4.isDatosCompletos() &&
                        estudiante5.isDatosCompletos()) {
                            estudiante1.imprimirDatos();
                            estudiante2.imprimirDatos();
                            estudiante3.imprimirDatos();
                            estudiante4.imprimirDatos();
                            estudiante5.imprimirDatos();
                        } else {
                            System.out.println("Los datos estan incompletos para calcular");
                            if(!estudiante1.isDatosCompletos())
                                System.out.println("Debe ingresar los datos del estudiante 1");
                            if(!estudiante2.isDatosCompletos())
                                System.out.println("Debe ingresar los datos del estudiante 2");
                            if(!estudiante3.isDatosCompletos())
                                System.out.println("Debe ingresar los datos del estudiante 3");
                            if(!estudiante4.isDatosCompletos())
                                System.out.println("Debe ingresar los datos del estudiante 4");
                            if(!estudiante5.isDatosCompletos())
                                System.out.println("Debe ingresar los datos del estudiante 5");
                        }
                        break;
                    case 7:
                        salir = true;
                        break;
                    default:
                        System.out.println("La opcion es solo numeros entre 1 y 7");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingresaste un valor errado, vuelve a intentar");
                sc.next();
            }
        }
    }
}
