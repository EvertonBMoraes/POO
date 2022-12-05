package CheckpointII;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Musica {

    private Integer idMusica;
    private String nomeMusica;
    private String generoMusica;
    private String cantor;
    private LocalTime tempo;

    private Double nota;


    public Musica(Integer idMusica, String nomeMusica, String generoMusica, String cantor, LocalTime tempo, Double nota) {
        this.idMusica = idMusica;
        this.nomeMusica = nomeMusica;
        this.generoMusica = generoMusica;
        this.cantor = cantor;
        this.tempo = tempo;
        this.nota = nota;
    }

    public Musica(Musica listaMusica) {
        listaMusica = new Musica(this.idMusica,this.nomeMusica,this.generoMusica,this.cantor,this.tempo,this.nota);
        System.out.println(listaMusica);
    }

    public void modificarNota(Double nota){
        System.out.println(
                "____________________________\n" +
                    "Música " + this.nomeMusica +
                        "\nNota anterior: " + this.getNota());
        this.nota = nota;
        System.out.println("Nova nota atribuída: "
                + this.getNota());
    };

    public void info(){
        System.out.println("____________________________");
        System.out.println("--Info. sobre música--");
        System.out.printf("Id..............:%s%n",this.idMusica);
        System.out.printf("Nome............:%s%n",this.nomeMusica);
        System.out.printf("Genero..........:%s%n",this.generoMusica);
        System.out.printf("Cantor..........:%s%n",this.cantor);
        System.out.printf("Duração.........:%s%n",this.tempo);
        System.out.printf("Nota............:%s%n",this.nota);
    }

    public Integer getIdMusica() {
        return idMusica;
    }

    public void setIdMusica(Integer idMusica) {
        this.idMusica = idMusica;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public String getGeneroMusica() {
        return generoMusica;
    }

    public void setGeneroMusica(String generoMusica) {
        this.generoMusica = generoMusica;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public LocalTime getTempo() {
        return tempo;
    }

    public void setTempo(LocalTime tempo) {
        this.tempo = tempo;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
}
