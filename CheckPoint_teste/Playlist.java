package CheckPoint_teste;

import javax.xml.crypto.Data;

public class Playlist {

    private String nome;
    private String autor;
    private String[] listaDeMusicas;
    private Data dataCriacao;

    public Playlist(String nome, String autor, String[] listaDeMusicas, Data dataCriacao) {
        this.nome = nome;
        this.autor = autor;
        this.listaDeMusicas = listaDeMusicas;
        this.dataCriacao = dataCriacao;
    }

    public String[] listaMusica(Integer idMusica){
        return null;
    }
}
