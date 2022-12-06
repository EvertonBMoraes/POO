package CheckpointII;

import java.time.LocalTime;

public abstract class Cadastro {

    private Integer id;
    private String nome;
    private String cantor;
    private String genero;
    private LocalTime tempo;
    private Double nota;

    public Cadastro(Integer id, String nome, String cantor, String genero, LocalTime tempo, Double nota) {
        this.id = id;
        this.nome = nome;
        this.cantor = cantor;
        this.genero = genero;
        this.tempo = tempo;
        this.nota = nota;
    }

    public abstract void info();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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
