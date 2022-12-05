package CheckpointII;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        //Devs Everton Moraes e Henrique Schneider
        /*
        - Criar array(playlists e/ou albuns) e inserir as músicas
        - LocalDate em datas --- ok
        - LocalTime no tempo de duração musicas/albuns --- músicas ok
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

        Musica track01 = new Musica(10001,"Wanna Be Starlin'Somethin'","Pop","Michael Jackson", LocalTime.of(0,6,0),7.9);
        Musica track02 = new Musica(10002,"Baby Be Mine","Pop","Michael Jackson",LocalTime.of(0,4,20),8.8);
        Musica track03 = new Musica(10003,"The Girl Is Mine","Pop","Michael Jackson",LocalTime.of(0,3,40),8.5);
        Musica track04 = new Musica(10004,"Thriller'","Pop","Michael Jackson",LocalTime.of(0,5,57),9.8);
        Musica track05 = new Musica(10005,"Beat It","Pop","Michael Jackson",LocalTime.of(0,4,18),9.9);
        Musica track06 = new Musica(10006,"Billie Jean","Pop","Michael Jackson",LocalTime.of(0,4,53),9.5);
        Musica track07 = new Musica(10007,"Human Nature","Pop","Michael Jackson",LocalTime.of(0,4,5),7.0);
        Musica track08 = new Musica(10008,"P.Y.T","Pop","Michael Jackson",LocalTime.of(0,3,58),6.7);
        Musica track09 = new Musica(10009,"The Lady in My Life","Pop","Michael Jackson",LocalTime.of(0,4,58),7.9);
        Musica track10 = new Musica(10010,"After Hours","R&B","The Weeknd",LocalTime.of(0,4,1),7.9);
        Musica track11 = new Musica(10011,"Save Your Tears","R&B","The Weeknd",LocalTime.of(0,4,35),7.5);
        Musica track12 = new Musica(10012,"Blinding Lights","R&B","The Weeknd",LocalTime.of(0,4,20),8.5);
        Musica track13 = new Musica(10013,"Chunky","Pop","Bruno Mars",LocalTime.of(0,4,6),7.0);
        Musica track14 = new Musica(10014,"Perm","Pop","Bruno Mars",LocalTime.of(0,4,30),6.5);

        Cantor artista01 = new Cantor("Michael Joseph Jackson", "Michael Jackson", LocalDate.of(1958,8,29),"Michael Joseph Jackson foi um cantor, compositor e dançarino estadunidense. Apelidado de 'Rei do Pop', foi um dos ícones culturais mais importantes e influentes de todos os tempos e um dos maiores artistas da história da música.",10001);
        Cantor artista02 = new Cantor("Abel Makkonen Tesfaye", "The Weeknd",LocalDate.of(1990,2,16),"Abel Makkonen Tesfaye, mais conhecido por seu nome artístico the Weeknd, é um cantor, compositor, ator e produtor musical canadense. Ele ajudou a expandir a paleta musical do R&B, ao incorporar influências indie e de música eletrônica; seu trabalho é classificado como R&B alternativo.",10002);
        Cantor artista03 = new Cantor("Peter Gene Hernandez", "Bruno Mars",LocalDate.of(1985,10,8),"Peter Gene Hernandez, mais conhecido pelo nome artístico Bruno Mars é um cantor, compositor, produtor musical, dançarino e multi-instrumentista americano, nascido e criado no Havaí. ",10003);

        Album disco01 = new Album(10001,"Thriller",LocalDate.of(1982,11,30),9,"Michael Jackson");
        Album disco02 = new Album(10002,"After Hours",LocalDate.of(2020,03,20),14,"The Weeknd");
        Album disco03 = new Album(10003,"24K Magic",LocalDate.of(2016,11,17),9,"Bruno Mars");

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
