package ordenacao;

public abstract class Ordenacoes {

    //Composicao com instancia de Ordenacao
    protected Ordenacao ordenacao;

    //Comportamento delegado
    public int[] ordenaNumeros(int[] vetor) {
        return ordenacao.ordenaNumeros(vetor);
    }

    //Getter e Setter
    public void setOrdenacao(Ordenacao ordenacao) {
        this.ordenacao = ordenacao;
    }

    public Ordenacao getOrdenacao() {
        return ordenacao;
    }
}
