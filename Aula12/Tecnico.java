package Aula12;

public class Tecnico extends Assistente{

    private Double bonusSalarial;

    @Override
    public void ganhoAnual(){
    }

    public Tecnico(String nome, Double salario, Integer matricula, Double bonusSalarial) {
        super(nome, salario, matricula);
        this.bonusSalarial = bonusSalarial;
    }

    public Double getBonusSalarial() {
        return bonusSalarial;
    }

    public void setBonusSalarial(Double bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }
}
