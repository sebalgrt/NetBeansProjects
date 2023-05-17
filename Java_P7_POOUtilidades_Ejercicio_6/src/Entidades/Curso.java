/*
Los atributos serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana,
turno (mañana o tarde), precioPorHora y alumnos. Donde alumnos es un
arreglo de tipo String de dimensión 5 (cinco)
 */
package Entidades;

/**
 *
 * @author Seba
 */
public class Curso {
    private String nombreCurso;
    private int horasXdia;
    private int diasXsemana;
    private String turno;
    private double precioXhora;
    private String [] alumnos = new String [5];

    public Curso() {
    }

    public Curso(String nombreCurso, int horasXdia, int diasXsemana, String turno, double precioXhora) {
        this.nombreCurso = nombreCurso;
        this.horasXdia = horasXdia;
        this.diasXsemana = diasXsemana;
        this.turno = turno;
        this.precioXhora = precioXhora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getHorasXdia() {
        return horasXdia;
    }

    public void setHorasXdia(int horasXdia) {
        this.horasXdia = horasXdia;
    }

    public int getDiasXsemana() {
        return diasXsemana;
    }

    public void setDiasXsemana(int diasXsemana) {
        this.diasXsemana = diasXsemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioXhora() {
        return precioXhora;
    }

    public void setPrecioXhora(double precioXhora) {
        this.precioXhora = precioXhora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
}
