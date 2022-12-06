package CheckpointII;

public class Erros extends  Exception{

    public Erros()
    {
        super();
    }
    public Erros(String mensagem)
    {
        super(mensagem);
    }
    public String toString()
    {
        return "A seguinte exceção ocorreu" + this.getClass().getName() +"\n" +
                " Mensagem: " + this.getMessage() + "\n" ;
    }
}
