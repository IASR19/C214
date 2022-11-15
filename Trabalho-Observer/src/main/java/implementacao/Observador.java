package implementacao;

import interfaces.iObservador;

public class Observador implements iObservador {
    int id;

    public Observador(int id) {
        this.id = id;
    }


    @Override
    public void update(Observavel aplicativo) {

    }

}
