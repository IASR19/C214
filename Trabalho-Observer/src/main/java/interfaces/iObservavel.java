package interfaces;
import implementacao.Observador;

public interface iObservavel {
    void registraObservador(Observador obs);
    void removeObservador(Observador obs);
    void notificaObservadores();
}
