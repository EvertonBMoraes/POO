package tema1;

import java.time.LocalDate;

public class Consulta {

    private LocalDate data;
    private String especialidade;
    private int hora;
    private int minutos;



    public Consulta(LocalDate data, String especialidade, int hora, int minutos) {
        this.data = data;
        this.especialidade = especialidade;
        this.hora = hora;
        this.minutos = minutos;
    }




    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
}
