package Aula12;

public class Teste {
    public static void main(String[] args) {

        Administrativo Everton = new Administrativo("Everton Barros",1200.00, 465454545,true,125.50);
        Everton.exibeDados();
        System.out.println("---------------------");
        Tecnico Luan = new Tecnico("Luan Santos",2100.00, 65656565,345.00);
        Luan.exibeDados();
        System.out.println("---------------------");
    }
}

//pendente determinar o que os outros métodos irão calcular