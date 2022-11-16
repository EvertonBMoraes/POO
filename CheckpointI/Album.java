package CheckpointI;

import javax.xml.crypto.Data;

public class Album {
    private Integer idAlbum;
    private String nomeAlbum;
    private String dataLancamento;
    private Integer qtdFaixas;
    private String cantor;

    public Album(Integer idAlbum, String nomeAlbum, String dataLancamento, Integer qtdFaixas, String cantor) {
        this.idAlbum = idAlbum;
        this.nomeAlbum = nomeAlbum;
        this.dataLancamento = dataLancamento;
        this.qtdFaixas = qtdFaixas;
        this.cantor = cantor;
    }

    public void exibirAlbum(Integer idAlbum){
        if (idAlbum.equals(getIdAlbum())) {
            System.out.println(info());
        }
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

    public String getDataLancamento() {
//       Date date = new Date();
//        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//        String today = formatter.format(date);
//        System.out.println("Today : " + today);
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
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

    public String info(){
        System.out.println("__________________________");
        System.out.println("--Info. sobre o álbum id:"+ this.idAlbum + "--");
        System.out.printf("Nome..................:%s%n",this.nomeAlbum);
        System.out.printf("Quantidade de faixas..:%s%n",this.qtdFaixas);
        System.out.printf("Cantor................:%s%n",this.cantor);

        return "Esse album foi lançado em: " + getDataLancamento();
    }
}
