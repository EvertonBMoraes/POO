package Aula11;

public class Cachorro extends Animal{


    public Cachorro(String nome, Integer idade) {
        super(nome, idade);
    }

    @Override
    public void somEmitido() {
        System.out.print("au au");
    }

    @Override
    public void formaCorrer(){
        System.out.println("com as 4 patas");
    }
}
