package CheckpointI;

import CheckPoint_teste.Album;
import CheckPoint_teste.Filme;
import CheckPoint_teste.Musica;

public class Main {
    public static void main(String[] args) {


        CheckPoint_teste.Musica musica1 = new CheckPoint_teste.Musica(1,"Mundo Bita","Infantil","Bita",60L,2.00);
        CheckPoint_teste.Musica musica2 = new CheckPoint_teste.Musica(1,"Mundo Bita","Infantil","Bita",60L,2.00);
        CheckPoint_teste.Musica musica3 = new Musica(1,"Mundo Bita","Infantil","Bita",60L,2.00);

        CheckPoint_teste.Filme filme1 = new Filme("Corvo",1980,"Ação","roda");

        filme1.info();
        filme1.exibirMusicaFilme("Corvo");

        CheckPoint_teste.Album album = new CheckPoint_teste.Album(1,"muitoLouco","12/01/2021",12,"EUMESMO");
        CheckPoint_teste.Album album2 = new Album(2,"facil","01/01/2021",122,"ZEZIM");
        album.info();
        album2.exibirAlbum(2);

        musica1.info();
       musica2.info();
       musica3.info();
//
//        Musica[] musicas = new Musica[3];
//        musicas[0]=new Musica(1,"Mundo Bita","Infantil","Bita",60L,2.00);
//        musicas[1]=new Musica(2,"Mundo Bita2","Infantil2","Bita2",80L,4.00);
//        musicas[2] = new Musica(3,"Roda-Roda","Punk","zaza",299L,2.00);

//        Imprimir Musica


//        for (Musica m:musicas){
//            m.info();
//        }

    }
}
