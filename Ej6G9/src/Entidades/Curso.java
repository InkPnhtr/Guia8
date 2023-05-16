package Entidades;


import java.util.Scanner;


/**
 *
 * @author U
 */
public class Curso {
    private String nombreCurso;
    private int CantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private char turno;
    private double precioPorHora;
    private String alumnos[] = new String[4];
    
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    
    public Curso() {
    }

    public Curso(String nombreCurso, int CantidadHorasPorDia, int cantidadDiasPorSemana, char turno, double precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.CantidadHorasPorDia = CantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return CantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int CantidadHorasPorDia) {
        this.CantidadHorasPorDia = CantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public char getTurno() {
        return turno;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
    private void cargarAlumnos(){
        for (int j = 0; j<alumnos.length; j++ ) {
            System.out.print("Ing. Nombre Alumno: "+ j + " ");
            alumnos[j] = scanner.next();
        }
    }
    public void crearCurso(){
        System.out.println("Ing Nombre Curso: ");
        setNombreCurso(scanner.nextLine());
        System.out.println("Ing. Cant. Horas / Dia: ");
        setCantidadHorasPorDia(scanner.nextInt());
        System.out.println("Dias / Semana: ");
        setCantidadDiasPorSemana(scanner.nextInt());
        System.out.println("Turno M/T: ");
        setTurno(scanner.next().charAt(0));
        System.out.print("Precio / hora: ");
        setPrecioPorHora(scanner.nextDouble());
        cargarAlumnos();
    }
    public void calcularGananciaSemanal(){
        double gananciaSemanal = ((getPrecioPorHora()*getCantidadHorasPorDia())*getCantidadDiasPorSemana())*alumnos.length;
        System.out.println("Ganancia Semanal = "+ gananciaSemanal);
    }
        
    
}
