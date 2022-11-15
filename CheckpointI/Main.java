package CheckpointI;

import CheckPoint_teste.Musica;

public class Main {
    public static void main(String[] args) {

        Musica[] musicas = new Musica[2];
        //Musica musica1 = new Musica(1001,"Love Never Felt So Good","POP","Michael Jackson","",4.90);
        musicas[0]=new Musica(1,"Mundo Bita2","Infantil2","Bita2",80L,4.00);
        musicas[1] = new Musica(2,"Roda-Roda","Punk","zaza",299L,2.00);
       // System.out.println("Id: " + musica1.getIdMusica() +  " nome: " + musica1.getNomeMusica()+ " " + musica1.getGeneroMusica()+ " " + musica1.getCantor()+ " " + musica1.getTempoDuracao()+ " " + musica1.getNota());

        for (Musica m:musicas){
            m.info();
        }
    }


}

