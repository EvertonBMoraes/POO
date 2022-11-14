package CheckpointI;

import java.text.SimpleDateFormat;

public class Musica {

    private Integer idMusica;
    private String nomeMusica;
    private String generoMusica;
    private String cantor;
    private String tempoDuracao;
    private Double nota;

    public Musica(Integer idMusica, String nomeMusica, String generoMusica, String cantor, String tempoDuracao, Double nota) {
        this.idMusica = idMusica;
        this.nomeMusica = nomeMusica;
        this.generoMusica = generoMusica;
        this.cantor = cantor;
        this.tempoDuracao = tempoDuracao;
        this.nota = nota;
    }

    public void modificarNota(){

    };

    public Integer getIdMusica() {
        return idMusica;
    }

    public void setIdMusica(Integer idMusica) {
        this.idMusica = idMusica;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public String getGeneroMusica() {
        return generoMusica;
    }

    public void setGeneroMusica(String generoMusica) {
        this.generoMusica = generoMusica;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getTempoDuracao() {
        return tempoDuracao;
    }

    public void setTempoDuracao(String tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
}
