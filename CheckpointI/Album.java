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
    private SimpleDateFormat tempoDuracao;

    public Album(Integer idAlbum, String nomeAlbum, Data dataLancamento, Integer qtdFaixas, String[] musicas, String cantor, SimpleDateFormat tempoDuracao) {
        this.idAlbum = idAlbum;
        this.nomeAlbum = nomeAlbum;
        this.dataLancamento = dataLancamento;
        this.qtdFaixas = qtdFaixas;
        this.musicas = musicas;
        this.cantor = cantor;
        this.tempoDuracao = tempoDuracao;
    }

    public String listaMusuca(int id){
        return null;
    }
}
