// TESTE MANUAL

package trabalho1.test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import trabalho1.BuscaAtendimento;
import trabalho1.atendimento;
import trabalho1.atendimentoService;



public class TesteBuscaAtendimento {

    atendimentoService service;
    BuscaAtendimento buscaAtendimento;

    @Before
    public void setup(){
        service = new MockAtendimentoService();
        buscaAtendimento = new BuscaAtendimento(service);

    }

    @Test
    public void testeBuscaRenzo(){
        atendimento renzo =buscaAtendimento.buscaAtendimento(20);
        assertEquals("Renzo", renzo.getNome());
        assertEquals("Quarta - 13h30", renzo.getHorario());
        assertEquals(7.0, renzo.getPeriodo(), 0.1);
    }

    @Test
    public void testeBuscaCris(){
        atendimento cris =buscaAtendimento.buscaAtendimento(10);
        assertEquals("Cris", cris.getNome());
        assertEquals("Segunda - 15h30", cris.getHorario());
        assertEquals(8.0, cris.getPeriodo(), 0.1);
    }

    @Test
    public void testeBuscaMarcelo(){
        atendimento marcelo =buscaAtendimento.buscaAtendimento(30);

        assertEquals("Marcelo", marcelo.getNome());
        assertEquals("Sexta - 17h30", marcelo.getHorario());
        assertEquals(6.0, marcelo.getPeriodo(), 0.1);
    }

    @Test
    public void testeBuscaMarcelo_2(){
        atendimento marcelo =buscaAtendimento.buscaAtendimento(10);

        assertEquals("Marcelo", marcelo.getNome());
        assertEquals("Sexta - 17h30", marcelo.getHorario());
        assertEquals(6.0, marcelo.getPeriodo(), 0.1);
    }

    @Test
    public void testeBuscaPhyll(){
        atendimento cris =buscaAtendimento.buscaAtendimento(10);
        assertEquals("Phyll", cris.getNome());
        assertEquals("Segunda - 15h30", cris.getHorario());
        assertEquals(8.0, cris.getPeriodo(), 0.1);
    }

    @Test
    public void testeBuscaRenzo_2(){
        atendimento renzo =buscaAtendimento.buscaAtendimento(20);
        assertEquals("Renzo", renzo.getNome());
        assertEquals("Quarta - 13h30", renzo.getHorario());
        assertEquals(4.0, renzo.getPeriodo(), 0.1);
    }





}
