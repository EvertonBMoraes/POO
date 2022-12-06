package CheckpointII;

import java.time.LocalDate;
import java.time.LocalTime;

public class Album extends Cadastro{
    private LocalDate dataLancamento;
    private Integer qtdFaixas;

    public Album(Integer id, String nome, String cantor, String genero, LocalTime tempo, Double nota, LocalDate dataLancamento, Integer qtdFaixas) {
        super(id, nome, cantor, genero, tempo, nota);
        this.dataLancamento = dataLancamento;
        this.qtdFaixas = qtdFaixas;
    }

    @Override
    public void info(){
        System.out.println("____________________________");
        System.out.println("--Info. sobre o álbum id:"+ this.getId() + "--");
        System.out.printf("Nome............:%s%n",this.getNome());
        System.out.printf("Qtd de faixas...:%s%n",this.qtdFaixas);
        System.out.printf("Cantor..........:%s%n",this.getCantor());
        System.out.println("Esse album foi lançado em " + this.dataLancamento);
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Integer getQtdFaixas() {
        return qtdFaixas;
    }

    public void setQtdFaixas(Integer qtdFaixas) {
        this.qtdFaixas = qtdFaixas;
    }
}
