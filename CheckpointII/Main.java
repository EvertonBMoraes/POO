package CheckpointII;
public class Main {
    public static void main(String[] args) {

        //Devs Everton Moraes e Henrique Schneider
        /*
        - Criar array(playlists e/ou albuns) e inserir as músicas
        - LocalDate em datas
        - LocalTime no tempo de duração musicas/albuns
        - Qtd faixas no album
        - Comparar tempo de duas musicas (comparable)
        - Comparar qtd de faixas em dois albuns (comparable)
        - Implementar Scanner para escolher album e mostrar info musicas
        - Classe super/pai (herança), classe abstrada e/ou  interface
        - Sobrecarga e sobrescrita  (de métodos e construtores)
        - Collections (List ou Set);
        - Exceptions (RuntimeException e personalizadas).
         */


        System.out.println("____________________________\n" +
                "Programação Orientada a Objetos - Checkpoint I\n" +
                "Por Everton Moraes e Henrique Schneider");

        Musica track01 = new Musica(10001,"Wanna Be Starlin'Somethin'","Pop","Michael Jackson",360L,7.9);
        Musica track02 = new Musica(10002,"Baby Be Mine","Pop","Michael Jackson",260L,8.8);
        Musica track03 = new Musica(10003,"The Girl Is Mine","Pop","Michael Jackson",220L,8.5);
        Musica track04 = new Musica(10004,"Thriller'","Pop","Michael Jackson",357L,9.8);
        Musica track05 = new Musica(10005,"Beat It","Pop","Michael Jackson",258L,9.9);
        Musica track06 = new Musica(10006,"Billie Jean","Pop","Michael Jackson",293L,9.5);
        Musica track07 = new Musica(10007,"Human Nature","Pop","Michael Jackson",245L,7.0);
        Musica track08 = new Musica(10008,"P.Y.T","Pop","Michael Jackson",238L,6.7);
        Musica track09 = new Musica(10009,"The Lady in My Life","Pop","Michael Jackson",298L,7.9);
        Musica track10 = new Musica(10010,"After Hours","R&B","The Weeknd",241L,7.9);
        Musica track11 = new Musica(10011,"Save Your Tears","R&B","The Weeknd",275L,7.5);
        Musica track12 = new Musica(10012,"Blinding Lights","R&B","The Weeknd",260L,8.5);
        Musica track13 = new Musica(10013,"Chunky","Pop","Bruno Mars",246L,7.0);
        Musica track14 = new Musica(10014,"Perm","Pop","Bruno Mars",270L,6.5);

        Cantor artista01 = new Cantor("Michael Joseph Jackson", "Michael Jackson","29/08/1958","Michael Joseph Jackson foi um cantor, compositor e dançarino estadunidense. Apelidado de 'Rei do Pop', foi um dos ícones culturais mais importantes e influentes de todos os tempos e um dos maiores artistas da história da música.",10001);
        Cantor artista02 = new Cantor("Abel Makkonen Tesfaye", "The Weeknd","16/02/1990","Abel Makkonen Tesfaye, mais conhecido por seu nome artístico the Weeknd, é um cantor, compositor, ator e produtor musical canadense. Ele ajudou a expandir a paleta musical do R&B, ao incorporar influências indie e de música eletrônica; seu trabalho é classificado como R&B alternativo.",10002);
        Cantor artista03 = new Cantor("Peter Gene Hernandez", "Bruno Mars","08/10/1985","Peter Gene Hernandez, mais conhecido pelo nome artístico Bruno Mars é um cantor, compositor, produtor musical, dançarino e multi-instrumentista americano, nascido e criado no Havaí. ",10003);

        Album disco01 = new Album(10001,"Thriller","30/11/1982",9,"Michael Jackson");
        Album disco02 = new Album(10002,"After Hours","20/03/2020",14,"The Weeknd");
        Album disco03 = new Album(10003,"24K Magic","17/11/2016",9,"Bruno Mars");

        Filme pelicula01 = new Filme("MoonWalker",1988,"Musical","Bad");
        Filme pelicula02 = new Filme("O Guarda Costas",1992,"Drama Romântico","I Will Always love You");
        Filme pelicula03 = new Filme("Baby Drive",2017,"Ação","Let's Go Away for Awhile");

        track01.info();
        track03.info();
        track10.info();
        track12.info();
        track14.info();

        track07.modificarNota(8.5);

        artista01.mudarNomeArtistico("MJ");

        disco02.exibirAlbum();

        pelicula02.exibirMusicaFilme();

        System.out.println("____________________________");
    }
}
