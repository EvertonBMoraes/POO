package Aula11;

public class Cavalo extends Animal {


    public Cavalo(String nome, Integer idade) {
        super(nome, idade);
    }

    @Override
    public void somEmitido() {
        System.out.print("inrri");
    }

    @Override
    public void formaCorrer(){
        System.out.println("dá trote");
    }


}
