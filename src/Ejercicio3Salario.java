import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3Salario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float porcentajeSalud = 0.04f;
        float porcentajePension = 0.04f;
        float porcentajeRteFte = 0.012f;

        float salarioBruto = 0;
        float salarioNeto = 0;
        float deduccionSalud = 0;
        float deduccionPension = 0;
        float deducionRteFte = 0;
        float deducciones = 0;

        try {
            System.out.println("Ingrese el salario bruto");
            salarioBruto = sc.nextFloat();
            deduccionSalud = salarioBruto * porcentajeSalud;
            deduccionPension = salarioBruto * porcentajePension;
            deducionRteFte = salarioBruto * porcentajeRteFte;
            deducciones = deduccionSalud + deduccionPension + deducionRteFte;
            salarioNeto = salarioBruto - deducciones;
            System.out.println("SALARIO BRUTO: " + salarioBruto);
            System.out.println("DEDUCCION SALUD (4%): " + deduccionSalud);
            System.out.println("DEDUCCION PENSION (4%): " + deduccionPension);
            System.out.println("DEDUCCION RTE FTE (1,2%): " + deducionRteFte);
            System.out.println("TOTAL DEDUCCIONES: " + deducciones);
            System.out.println("SALARIO NETO: " + salarioNeto);
        } catch (InputMismatchException e) {
            System.out.println("El valor ingresado esta errado, debe ser numerico");
        }
    }
}
