package CheckpointII;

import java.time.LocalTime;

public class Musica extends Cadastro{

    private String descricao;

    public Musica(Integer id, String nome, String cantor, String genero, LocalTime tempo, Double nota) {
        super(id, nome, cantor, genero, tempo, nota);
    }

    public Musica(Integer id, String nome, String cantor, String genero, LocalTime tempo, Double nota, String descricao) {
        super(id, nome, cantor, genero, tempo, nota);
        this.descricao = descricao;
    }

    public void modificarNota(Double nota){
        System.out.println(
                "____________________________\n" +
                    "Música " + this.getNome() +
                        "\nNota anterior: " + this.getNota());
        this.setNota(nota);
        System.out.println("Nova nota atribuída: "
                + this.getNota());
    };

    @Override
    public void info(){
        System.out.println("____________________________");
        System.out.println("--Info. sobre música--");
        System.out.printf("Id..............:%s%n",this.getId());
        System.out.printf("Nome............:%s%n",this.getNome());
        System.out.printf("Genero..........:%s%n",this.getGenero());
        System.out.printf("Cantor..........:%s%n",this.getCantor());
        System.out.printf("Duração.........:%s%n",this.getTempo());
        System.out.printf("Nota............:%s%n",this.getNota());
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
