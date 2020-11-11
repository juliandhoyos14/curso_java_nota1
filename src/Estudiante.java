public class Estudiante {

    private String nombres;
    private String apellidos;
    private int edad;
    private String nombreMateria;
    private float nota1;
    private float nota2;
    private float nota3;
    private float nota4;
    private boolean datosCompletos = false;

    public Estudiante() {}

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getNota4() {
        return nota4;
    }

    public void setNota4(float nota4) {
        this.nota4 = nota4;
    }

    public boolean isDatosCompletos() {
        return datosCompletos;
    }

    public void setDatosCompletos(boolean datosCompletos) {
        this.datosCompletos = datosCompletos;
    }

    private float getNotaFinal() {
        return (float)((this.getNota1() * 0.3) + (this.getNota2() * 0.3) + (this.getNota3() * 0.3) + (this.getNota4() * 0.1));
    }

    public void imprimirDatos() {
        System.out.println("---------------------------------------------");
        System.out.println("--------------DATOS ESTUDIANTE---------------");
        System.out.println("---------------------------------------------");
        System.out.println("NOMBRES: " + this.getNombres());
        System.out.println("APELLIDOS: " + this.getApellidos());
        System.out.println("EDAD: " + this.getEdad());
        System.out.println("MATERIA: " + this.getNombreMateria());
        System.out.println("NOTA 1 (30%): " + this.getNota1());
        System.out.println("NOTA 2 (30%): " + this.getNota2());
        System.out.println("NOTA 3 (30%): " + this.getNota3());
        System.out.println("NOTA 4 (10%): " + this.getNota4());
        System.out.println("NOTA FINAL: " + this.getNotaFinal());
        System.out.println("---------------------------------------------");
    }
}
