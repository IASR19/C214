import implementacao.Observador;
import implementacao.Observavel;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;

public class TesteObserver {

    @Test
    public void testeInscritos() {
        Observavel aplicativo = new Observavel();
        Observador obs1 = new Observador(1);
        aplicativo.registraObservador(obs1);
        assertFalse(aplicativo.getClientes().isEmpty());
    }

    @Test
    public void testeInscritos_2() { // Com 3
        Observavel aplicativo = new Observavel();
        Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);
        Observador obs3 = new Observador(3);
        aplicativo.registraObservador(obs1);
        aplicativo.registraObservador(obs2);
        aplicativo.registraObservador(obs3);
        assertEquals(aplicativo.getClientes().size(), 3);
    }

    @Test
    public void testeQuebraFrase() {
        Observavel aplicativo = new Observavel();
        Observador obs1 = new Observador(1);
        aplicativo.registraObservador(obs1);
        aplicativo.setNovoFraseAplicativo("To com sono");

        assertEquals(aplicativo.quebraPalavras()[0], "To");
        assertEquals(aplicativo.quebraPalavras()[1], "com");
        assertEquals(aplicativo.quebraPalavras()[2], "sono");
    }


    @Test
    public void testeNumPalavras() {
        Observavel aplicativo = new Observavel();
        Observador obs1 = new Observador(1);
        aplicativo.registraObservador(obs1);
        aplicativo.setNovoFraseAplicativo("O tambor faz muito barulho mas eh vazio por dentro");
        assertEquals(aplicativo.quantidadePalavras(), 10);
    }
}

