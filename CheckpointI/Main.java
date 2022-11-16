package CheckpointI;

public class Main {
    public static void main(String[] args) {
        Musica track01 = new Musica(10001,"Wanna Be Starlin'Somethin'","Pop","Michael Jackson",360L,7.9);
        Musica track02 = new Musica(10002,"Baby Be Mine","Pop","Michael Jackson",260L,8.8);
        Musica track03 = new Musica(10003,"The Girl Is Mine","Pop","Michael Jackson",220L,8.5);
        Musica track04 = new Musica(10004,"Thriller'","Pop","Michael Jackson",357L,9.8);
        Musica track05 = new Musica(10005,"Beat It","Pop","Michael Jackson",258L,9.9);
        Musica track06 = new Musica(10006,"Billie Jean","Pop","Michael Jackson",293L,9.5);
        Musica track07 = new Musica(10007,"Human Nature","Pop","Michael Jackson",245L,7.0);
        Musica track08 = new Musica(10008,"P.Y.T","Pop","Michael Jackson",238L,6.7);
        Musica track09 = new Musica(10009,"The Lady in My Life","Pop","Michael Jackson",298L,7.9);

        Cantor artista01 = new Cantor("Michael Joseph Jackson", "Michael Jackson","29/08/1958","Michael Joseph Jackson foi um cantor, compositor e dançarino estadunidense. Apelidado de \"Rei do Pop\", foi um dos ícones culturais mais importantes e influentes de todos os tempos e um dos maiores artistas da história da música.",10001);

        Album disco01 = new Album(10001,"Thriller","30/11/1982",9,"Michael Jackson");

        Filme pelicula01 = new Filme("MoonWalker",1988,"Musical","Bad");

        track01.info();
        track02.info();
        track03.info();
        track04.info();
        track05.info();

        System.out.println(artista01.getDataNascimeto()+" "+artista01.getNomeArtistico());

        disco01.exibirAlbum(10001);

        pelicula01.exibirMusicaFilme("MoonWalker");
    }
}
