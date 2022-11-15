package implementacao;

import interfaces.iObservavel;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Observavel implements iObservavel {
    private String frase;
    private String quebraFrase[];
    private List<Observador> clientes;

    public Observavel() {
        clientes = new ArrayList<Observador>();
    }

    @Override
    public void registraObservador(Observador obs) {
        clientes.add(obs); //adiciona um observador
    }

    @Override
    public void removeObservador(Observador obs) {
        if(clientes.contains(obs))
            clientes.remove(obs); //remove observador se ele ja tiver sido adicionado
    }

    @Override
    public void notificaObservadores() {
        for (Observador observador : clientes) {
            observador.update(this);
        }
    }

    //Método chamado sempre que os valore se modificacam
    private void novasMedidas() {
        notificaObservadores();
    }

    public void setNovoFraseAplicativo(String frase) {

        this.frase = frase;
        novasMedidas();
    }

    public int quantidadePalavras() {
        String myString = this.frase;
        StringTokenizer stringTokenizer1 = new StringTokenizer(myString);
        int tokensCount1  = stringTokenizer1.countTokens();
        return Integer.valueOf(tokensCount1);
    }

    public String[] quebraPalavras() {
        String myStr = this.frase;
        String[] palavras = myStr.split(" ");
        return palavras;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String titulo) {
        this.frase = frase;
    }

    public void setClientes(List<Observador> clientes) {
        this.clientes  = clientes;
    }

    public List<Observador> getClientes() {
        return clientes;
    }
}
