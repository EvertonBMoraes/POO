package CheckpointII;

import java.time.LocalDate;

public class Album {
    private Integer idAlbum;
    private String nomeAlbum;
    private LocalDate dataLancamento;
    private Integer qtdFaixas;
    private String cantor;

    public Album(Integer idAlbum, String nomeAlbum, LocalDate dataLancamento, Integer qtdFaixas, String cantor) {
        this.idAlbum = idAlbum;
        this.nomeAlbum = nomeAlbum;
        this.dataLancamento = dataLancamento;
        this.qtdFaixas = qtdFaixas;
        this.cantor = cantor;
    }
    public void exibirAlbum(){
            System.out.println(info());
    }

    public String info(){
        System.out.println("____________________________");
        System.out.println("--Info. sobre o álbum id:"+ this.idAlbum + "--");
        System.out.printf("Nome............:%s%n",this.nomeAlbum);
        System.out.printf("Qtd de faixas...:%s%n",this.qtdFaixas);
        System.out.printf("Cantor..........:%s%n",this.cantor);

        return "Esse album foi lançado em " + this.dataLancamento;
    }

    public Integer getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(Integer idAlbum) {
        this.idAlbum = idAlbum;
    }

    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
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

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }
}
