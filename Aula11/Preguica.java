package Aula11;

public class Preguica extends Animal{


    public Preguica(String nome, Integer idade) {
        super(nome, idade);
    }

    @Override
    public void somEmitido() {
        System.out.print("'insira o som da preguiça aqui!!'");
    }

    @Override
    public void formaSubirArvores() {
        System.out.println("preguiça...rs");
    }



}
