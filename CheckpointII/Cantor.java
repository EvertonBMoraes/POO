package CheckpointII;

import java.time.LocalDate;

public class Cantor {

    private String nomeReal;
    private String nomeArtistico;
    private LocalDate dataNascimeto;
    private String descricao;
    private Integer numeroRegistro;

    public Cantor(String nomeReal, String nomeArtistico, LocalDate dataNascimeto, String descricao, Integer numeroRegistro) {
        this.nomeReal = nomeReal;
        this.nomeArtistico = nomeArtistico;
        this.dataNascimeto = dataNascimeto;
        this.descricao = descricao;
        this.numeroRegistro = numeroRegistro;
    }

    public void mudarNomeArtistico(String nomeArtistico) {
        System.out.println(
                "____________________________\n" +
                        "Nome artístico anterior: " + this.getNomeArtistico());
        this.nomeArtistico = nomeArtistico;
        System.out.println("Nome artístico após alteração: "
                + this.getNomeArtistico());
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

    public LocalDate getDataNascimeto() {
        return dataNascimeto;
    }

    public void setDataNascimeto(LocalDate dataNascimeto) {
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
