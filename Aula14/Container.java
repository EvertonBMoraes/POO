package Aula14;

public class Container implements Comparable<Container> {

    private int numero;
    private String descricao;
    private String paisOrigem;
    private Boolean materialPerigoso;

    public Container(int numero, String descricao, String paisOrigem, Boolean materialPerigoso) {
        this.numero = numero;
        this.descricao = descricao;
        this.paisOrigem = paisOrigem;
        this.materialPerigoso = materialPerigoso;
    }

    @Override
    public int compareTo(Container containerEscolhido) {
        if (containerEscolhido.numero == this.numero){
            // System.out.println("Os jogadores são iguais");
            return 0; //se iguais retorna 0
        }else if (containerEscolhido.numero < this.numero){
            //System.out.println("Um jogador é menor que o outro");
            return -1; // retorna um numero menor que 0
        }else{
            // System.out.println("Um é jogador maior que o outro");
            return 1; // retorna um numero maior que 0
        }
    }






}
