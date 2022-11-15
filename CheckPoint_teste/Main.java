package CheckPoint_teste;

public class Main {
    public static void main(String[] args) {

        Musica[] musicas = new Musica[3];



        musicas[0]=new Musica(1,"Mundo Bita","Infantil","Bita",60L,2.00);
        musicas[1]=new Musica(2,"Mundo Bita2","Infantil2","Bita2",80L,4.00);
        musicas[2] = new Musica(3,"Roda-Roda","Punk","zaza",299L,2.00);
//        Imprimir Musica


        for (Musica m:musicas){
            m.info();
        }

    }
}
