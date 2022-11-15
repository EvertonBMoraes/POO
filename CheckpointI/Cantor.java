package CheckpointI;

import java.util.Date;

public class Cantor {

    private String nomeReal;
    private String nomeArtistico;
    private Date dataNascimeto;
    private String descricao;
    private Integer numeroRegistro;

    public Cantor(String nomeReal, String nomeArtistico, Date dataNascimeto, String descricao, Integer numeroRegistro) {
        this.nomeReal = nomeReal;
        this.nomeArtistico = nomeArtistico;
        this.dataNascimeto = dataNascimeto;
        this.descricao = descricao;
        this.numeroRegistro = numeroRegistro;
    }

    public void mudarNomeArtistico(){
    }

    public String getNomeReal() {
        return nomeReal;
    }

    public void setNomeReal(String nomeReal) {
        this.nomeReal = nomeReal;
    }

    public String getNomeArtistico() {
        return nomeArtistico;
    }

    public void setNomeArtistico(String nomeArtistico) {
        this.nomeArtistico = nomeArtistico;
    }

    public Date getDataNascimeto() {
        return dataNascimeto;
    }

    public void setDataNascimeto(Date dataNascimeto) {
        this.dataNascimeto = dataNascimeto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(Integer numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }
}
