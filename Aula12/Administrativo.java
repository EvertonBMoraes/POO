package Aula12;

public class Administrativo extends Assistente{

    private boolean turno;

    private Double adicionalNoturno;

    public Administrativo(String nome, Double salario, Integer matricula, boolean turno, Double adicionalNoturno) {
        super(nome, salario, matricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    @Override
    public void ganhoAnual(){
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public Double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(Double adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }
}
