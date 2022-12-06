package tema1;

import java.time.LocalDate;

public class Publico extends Paciente implements Comparable<Publico>{

    private int numero;

    public Publico(LocalDate dataNascimento, String nome, String sobrenome, boolean primeiraConsulta, int numero) {
        super(dataNascimento, nome, sobrenome, primeiraConsulta);
        this.numero = numero;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int compareTo(Publico o) {
        if(o.numero == this.numero){
            System.out.println("Igual");
            return 0; //se iguais retorna 0
        }else if(o.numero < this.numero){
            System.out.println("menor");
            return -1; // retorna um numero menor que 0
        }else{
            System.out.println("maior");
            return 1; // retorna um numero maior que 0
        }

    }
}
