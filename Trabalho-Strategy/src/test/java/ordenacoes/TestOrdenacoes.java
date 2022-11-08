package ordenacoes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import ordenacao.ordemBubble;
import ordenacao.ordemIsertion;
import ordenacao.ordemSelection;

import implementacao.BubbleSort;
import implementacao.InsertionSort;
import implementacao.SelectionSort;
import org.junit.Test;
import ordenacao.Ordenacoes;


public class TestOrdenacoes {
    Ordenacoes ordenacoes;

    @Test
    public void testeOrdemInsertion() {
        ordenacoes = new ordemIsertion();
        assertTrue(ordenacoes.getOrdenacao() instanceof InsertionSort);
    }

    @Test
    public void testeOrdemInsertionValores() {
        ordenacoes = new ordemIsertion();
        int[] aux = {6, 8, 9, 3, 1};


        int[] numeros = ordenacoes.ordenaNumeros(aux);
        assertEquals(numeros[0], 1);
    }

    @Test
    public void testeOrdemBubbleValores() {
        ordenacoes = new ordemBubble();
        int[] aux = {6, 8, 9, 3, 1};


        int[] numeros = ordenacoes.ordenaNumeros(aux);
        assertEquals(numeros[1], 3);
    }
}
