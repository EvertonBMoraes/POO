package tema1;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Particular paciente1 = new Particular(LocalDate.of(1990,05,23), "Fulano", "Potter", true, 586.50, 5200955L);
        Publico paciente2 = new Publico(LocalDate.of(1985,01,12), "Beltrano", "Weasley", false, 12);
        Publico paciente3 = new Publico(LocalDate.of(2001,11,20), "Lua", "Lestrange", false, 01);


        Consulta consulta1 = new Consulta(LocalDate.now(), "Nefrologista", 22, 30);
        Consulta consulta2 = new Consulta(LocalDate.of(2022,01,24), "Neurologista", 10, 00);
        Consulta consulta3 = new Consulta(LocalDate.of(2020, 10,10), "Clínico Geral", 05, 55);


        paciente1.adicionarConsulta(consulta1);
        paciente1.adicionarConsulta(consulta2);
        paciente1.adicionarConsulta(consulta3);

        paciente1.temQueAvaliar();

        paciente1.gerarRelatorioConsulta();

        paciente2.compareTo(paciente3);





    }
}
