package tema1;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Paciente {

    private LocalDate dataNascimento;
    private String nome;
    private String sobrenome;
    private boolean primeiraConsulta;
    private ArrayList<Consulta> listaConsultas = new ArrayList<>();


    public Paciente(LocalDate dataNascimento, String nome, String sobrenome, boolean primeiraConsulta) {
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.primeiraConsulta = primeiraConsulta;
    }

    public void adicionarConsulta(Consulta consulta){
        listaConsultas.add(consulta);
    }

    public void gerarRelatorioConsulta(){
        for(Consulta itemConsulta: listaConsultas){
            System.out.println("O paciente " + nome + " realizou a consulta referente a especialidade "+
                   itemConsulta.getEspecialidade()  + " no dia " +
                    itemConsulta.getData() + " na hora:  " +
                    itemConsulta.getHora() + ":" + itemConsulta.getMinutos());
        }
    }


    public boolean temQueAvaliar(){
        if(primeiraConsulta == true){
            System.out.println("Fazer avaliação inicial do paciente " + this.nome);
            return true;
        }
        System.out.println("Paciente " + this.nome + " já foi avaliado");
        return false;

    }




    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public boolean isPrimeiraConsulta() {
        return primeiraConsulta;
    }

    public void setPrimeiraConsulta(boolean primeiraConsulta) {
        this.primeiraConsulta = primeiraConsulta;
    }
}
