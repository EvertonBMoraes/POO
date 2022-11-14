package CheckpointI;

public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica(0001,"TATA","Metal","Zezinho","00:01:30", 2.00);

        System.out.println("Id: " + musica1.getIdMusica() +  " nome: " + musica1.getNomeMusica()+ " " + musica1.getGeneroMusica()+ " " + musica1.getCantor()+ " " + musica1.getTempoDuracao()+ " " + musica1.getNota());
    }


}

