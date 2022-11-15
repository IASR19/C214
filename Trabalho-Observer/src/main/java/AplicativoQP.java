import implementacao.Observavel;
import implementacao.Observador;

public class AplicativoQP {
    public static void main(String[] args) {

        // Criando o observavel (subject) aplicativo.
        Observavel aplicativo = new Observavel();

        //Criando 3 observadores e fazendo a inscrição no Aplicativo.
        /* Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);
        Observador obs3 = new Observador(3);

        aplicativo.registraObservador(obs1);
        aplicativo.registraObservador(obs2);
        aplicativo.registraObservador(obs3);

        aplicativo.setNovoFraseAplicativo("O tambor faz muito barulho mas eh vazio por dentro");
        aplicativo.setNovoFraseAplicativo("To com sono");

        aplicativo.removeObservador(obs3);


        aplicativo.notificaObservadores(); */
    }
}
