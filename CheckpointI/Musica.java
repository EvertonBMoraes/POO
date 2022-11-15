package CheckpointI;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Musica {

    private Integer idMusica;
    private String nomeMusica;
    private String generoMusica;
    private String cantor;

    private Long tempo;
    private Duration tempoDuracao;
    private Double nota;

    public Musica(Integer idMusica, String nomeMusica, String generoMusica, String cantor,Long tempo ,Duration tempoDuracao, Double nota) {
        this.idMusica = idMusica;
        this.nomeMusica = nomeMusica;
        this.generoMusica = generoMusica;
        this.cantor = cantor;
        this.tempo = tempo;
        this.tempoDuracao = tempoDuracao;
        this.nota = nota;
    }



    public void modificarNota(){

    };

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

    public Long getTempo() {
        return tempo;
    }

    public void setTempo(Long tempo) {
        this.tempo = tempo;
    }

    public String getTempoDuracao() {

        tempoDuracao = Duration.ofSeconds(getTempo());
        long dias = tempoDuracao.toDays();
        Duration d2 = tempoDuracao.minus(dias, ChronoUnit.DAYS);
        long horas = d2.toHours();
        Duration d3 = d2.minus(horas, ChronoUnit.HOURS);
        long minutos = d3.toMinutes();
        Duration d4 = d3.minus(minutos, ChronoUnit.MINUTES);
        long segundos = d4.getSeconds();
        Duration d5 = d4.minus(segundos, ChronoUnit.SECONDS);
        long nanos = d5.toNanos();
        Duration d6 = d5.minus(nanos, ChronoUnit.NANOS);
        if (!d6.isZero()) throw new AssertionError(d6.toString());
        //        System.out.printf("Duração............:%s%n",horas + " horas, " + minutos + " minutos, " + segundos + " segundos.");
//        System.out.println("Resultado: " + tempoDuracao);

        return String.format("%dH:%02dm:%02ds",horas,minutos,segundos);
    }

    public void setTempoDuracao(Duration tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public void info(){
        System.out.println("____________________________");
        System.out.printf("Id............:%s%n",this.idMusica);
        System.out.printf("Nome............:%s%n",this.nomeMusica);
        System.out.printf("Genero............:%s%n",this.generoMusica);
        System.out.printf("Cantor............:%s%n",this.cantor);
        System.out.printf("Duração............:%s%n",getTempoDuracao());
        System.out.printf("Nota............:%s%n",this.nota);
    }
}
