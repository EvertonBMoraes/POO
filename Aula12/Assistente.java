package Aula12;

public class Assistente extends Funcionario{

    private Integer matricula;

    public Assistente(String nome, Double salario, Integer matricula) {
        super(nome, salario);
        this.matricula = matricula;
    }

    @Override
    public void exibeDados(
    ){
        System.out.println("O funcionário " + this.getNome() + ", matrícula nª"+ this.getMatricula() +" possui um salário de R$ "+ this.getSalario()+ ".");
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
}
