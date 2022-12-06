package CheckpointII;

import java.time.Duration;
import java.util.ArrayList;

public class Playlist {
    private String nome;
    ArrayList<Musica> playlist;

    public Playlist(String nome) {
        this.nome = nome;
        this.playlist = new ArrayList<>() ;
    }

    public void addMusica(Musica musica){
        playlist.add(musica);
    }
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "...........Informações da Playlist........... \n" +
                String.format("Nome...................: %s\n",getNome())+
                String.format("Quantidade de faixas...: %s\n",playlist.size())+
                String.format("Duração da playlist....: %s\n",duracaoPlaylist())+
                String.format("Musicas %s\n",playlist);
    }

    public String duracaoPlaylist(){
        long tempoPlaylist = 0L;

        for (Musica tempo: playlist
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
}
