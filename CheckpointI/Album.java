package CheckpointI;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;

public class Album {
    private Integer idAlbum;
    private String nomeAlbum;
    private Data dataLancamento;
    private Integer qtdFaixas;
    private String[] musicas;
    private String  cantor;

    public Album(Integer idAlbum, String nomeAlbum, Data dataLancamento, Integer qtdFaixas, String[] musicas, String cantor) {
        this.idAlbum = idAlbum;
        this.nomeAlbum = nomeAlbum;
        this.dataLancamento = dataLancamento;
        this.qtdFaixas = qtdFaixas;
        this.musicas = musicas;
        this.cantor = cantor;
    }

    public String listaMusicas(int id){
        return null;
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

    public Data getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Data dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Integer getQtdFaixas() {
        return qtdFaixas;
    }

    public void setQtdFaixas(Integer qtdFaixas) {
        this.qtdFaixas = qtdFaixas;
    }

    public String[] getMusicas() {
        return musicas;
    }

    public void setMusicas(String[] musicas) {
        this.musicas = musicas;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }
}
