package CheckpointII;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Playlist {
    private String nome;
    ArrayList<Musica> playlist;

    public Playlist(String nome) {

        this.nome = nome;
        this.playlist = new ArrayList<>();
    }


    public void addMusica(Musica musica) {
        playlist.add(musica);
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "...........Informações da Playlist........... \n" +
                String.format("Nome...................: %s\n", getNome()) +
                String.format("Quantidade de faixas...: %s\n", playlist.size()) +
                String.format("Duração da playlist....: %s\n", duracaoPlaylist()) +
                String.format("Musicas %s\n", playlist);
    }

    public String duracaoPlaylist() {
        long tempoPlaylist = 0L;

        for (Musica tempo : playlist
        ) {
            tempoPlaylist += tempo.getTempo().toSecondOfDay();
        }
        Duration total = Duration.ofSeconds(tempoPlaylist);
        return String.format("%dh:%dm:%ds\n", total.toHoursPart(), total.toMinutesPart(), total.toSecondsPart());
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Musica> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<Musica> playlist) {
        this.playlist = playlist;
    }

    public static void main(String[] args) {
        dadosPlaylist();
    }

    public static void dadosPlaylist() {
        Scanner sc = new Scanner(System.in);
        Playlist playlist;

        List<Playlist> novaPlaylist = new ArrayList<>();

        int opcao = 0;


        do {
            System.out.println("## Escolha uma das opções abaixo ##");
            System.out.println("Opção 1 - Cadastra Playlist");
            System.out.println("Opção 2 - Imprime playlists cadastradas");
            System.out.println("Opção 0 - Sair do programa");
            System.out.println("_______________________");

            System.out.print("Digite aqui sua opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            if (opcao == 1) {
                //Cria um novo objeto
                System.out.print("Digite o Nome: ");
                playlist = new Playlist(sc.nextLine());

                System.out.println();

                //Guarda o objeto playlist1 em uma lista.
                novaPlaylist.add(playlist);

            } else if (opcao == 2) {
                if (novaPlaylist.isEmpty()) {
                    System.out.println("Não existem Playlist cadastradas, pressione uma tecla para continuar!");
                    sc.nextLine();
                } else {
                    System.out.println(novaPlaylist.toString());

                    System.out.println("Pressione um tecla para continuar.");
                    sc.nextLine();
                }
            }
        } while (opcao != 0);

        sc.close();
    }
}


