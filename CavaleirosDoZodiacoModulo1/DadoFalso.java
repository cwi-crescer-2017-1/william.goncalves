public class DadoFalso implements Sorteador{

    private int valor;

    public DadoFalso(int valor) {
        this.valor = valor;
    }

    public int sortear(){
        return valor;
    }
}
