package CheckpointII;

import java.time.LocalTime;
import java.util.Objects;


public class Musica extends Cadastro implements Comparable<Musica> {

    private String descricao;

    public Musica(Integer id, String nome, String cantor, String genero, LocalTime tempo, Double nota) {
        super(id, nome, cantor, genero, tempo, nota);
    }

    public Musica(Integer id, String nome, String cantor, String genero, LocalTime tempo, Double nota, String descricao) {
        super(id, nome, cantor, genero, tempo, nota);
        this.descricao = descricao;
    }


    public void modificarNota(Double nota)throws Erros {
        System.out.println("____________________________\n");
        if( nota < 0 ||nota > 10 ){
            throw new Erros("O valor '"+ nota + "' não é valido!! Insira uma nota com uma casa decimal entre os valores de 0.0 e 10.0");
        }
        System.out.println(
                    "Música " + this.getNome() +
                        "\nNota anterior: " + this.getNota());
        this.setNota(nota);
        System.out.println("Nova nota atribuída: "
                + this.getNota());
    }

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

    @Override
    public String toString() {
        return  String.format("\nID...............:%s\n",this.getId()) +
                String.format("Nome da musica...:%s\n",this.getNome()) +
                String.format("Genero...........:%s\n",this.getGenero())+
                String.format("Cantor...........:%s\n",this.getCantor())+
                String.format("Duração..........:%s\n",getTempo())+
                String.format("Nota.............:%s\n",this.getNota());
    }
    @Override
    public int compareTo(Musica o){
        System.out.println("\n____________Comparador de Notas________________");
        if(Objects.equals(o.getNota(), this.getNota())){
            System.out.println("As notas das duas músicas são iguais!");
            return 0;
        } else if (o.getNota() < this.getNota()){
            System.out.println("A nota da música " + o.getNome() + " é menor!");
            return -1;
        } else {
            System.out.println("A nota da música " + o.getNome() + " é maior!");
            return  1;
        }
    }



    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


}
