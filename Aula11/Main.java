package Aula11;

public class Main {
    public static void main(String[] args) {
        Cachorro Dog = new Cachorro("Dog",10);
        System.out.print("O cachorro "+ Dog.getNome()+ " faz ");
        Dog.somEmitido();
        System.out.print(" e corre ");
        Dog.formaCorrer();
        System.out.println("-------------------------");
        Cavalo PeDePano = new Cavalo("PeDePano", 2);
        System.out.print("O cavalo "+ PeDePano.getNome()+ " faz ");
        PeDePano.somEmitido();
        System.out.print(" e ");
        PeDePano.formaCorrer();
        System.out.println("-------------------------");
        Preguica Cissa = new Preguica("Cissa", 30);
        System.out.print("A preguiça "+ Cissa.getNome()+ " faz ");
        Cissa.somEmitido();
        System.out.print(" e sobe como uma ");
        Cissa.formaSubirArvores();
        System.out.println("-------------------------");
    }


}
