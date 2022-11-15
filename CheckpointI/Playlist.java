package CheckpointI;

import javax.xml.crypto.Data;

public class Playlist {

    private String nome;
    private String autor;
    private String[] listaDeMusicas;
    private Data dataCriacao;

    public Playlist(String nome, String autor, Data dataCriacao) {
        this.nome = nome;
        this.autor = autor;
        this.dataCriacao = dataCriacao;
    }

    public String[] listaMusica(Integer idMusica){
        return null;
    }


    public void adicionarMusica(){

    }

    public void removerMusica(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String[] getListaDeMusicas() {
        return listaDeMusicas;
    }

    public void setListaDeMusicas(String[] listaDeMusicas) {
        this.listaDeMusicas = listaDeMusicas;
    }

    public Data getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Data dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}

