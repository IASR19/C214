package trabalho1;

public class atendimento {
    private String nome;
    private String horario;
    private double periodo;

    public atendimento (String nome, String horario, int periodo){
        this.nome = nome;
        this.horario = horario;
        this.periodo = periodo;
    }

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}


    public String getHorario() {return horario;}

    public void setHorario(String horario) {this.horario = horario;}

    public double getPeriodo() {return periodo;}

    public void setPeriodo(double periodo) {this.periodo = periodo;}
}
