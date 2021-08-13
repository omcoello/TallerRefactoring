package modelos;

public class Materia {
    //Se privatizaron los atributos
    private String codigo;
    private String nombre;
    private String facultad;
    private double notaInicial;
    private double notaFinal;
    private double notaTotal;

    //Getters y setters necesarios    
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFacultad() {
        return facultad;
    }

    public double getNotaInicial() {
        return notaInicial;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public double getNotaTotal() {
        return notaTotal;
    }

    public void setNotaInicial(double notaInicial) {
        this.notaInicial = notaInicial;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public void setNotaTotal(double notaTotal) {
        this.notaTotal = notaTotal;
    }
    
    
    
}
