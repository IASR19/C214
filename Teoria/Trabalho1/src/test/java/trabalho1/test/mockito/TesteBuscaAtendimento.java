package trabalho1.test.mockito;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import trabalho1.BuscaAtendimento;
import trabalho1.atendimento;
import trabalho1.atendimentoService;
import trabalho1.test.atendimentoConst;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class TesteBuscaAtendimento{

    @Mock
    private atendimentoService service;
    private BuscaAtendimento buscaAtendimento;

    @Before
    public void setup() { buscaAtendimento = new BuscaAtendimento(service);}

    @Test
    public void testeBuscaRenzo(){
        Mockito.when(service.busca(20)).thenReturn(atendimentoConst.RENZO);
        atendimento renzo = buscaAtendimento.buscaAtendimento(20);
        assertEquals("Renzo", renzo.getNome());
        assertEquals("Quarta - 13h30", renzo.getHorario());
        assertEquals(7.0, renzo.getPeriodo(), 0.1);
    }

    @Test
    public void testeBuscaCris(){
        Mockito.when(service.busca(10)).thenReturn(atendimentoConst.CRIS);
        atendimento cris = buscaAtendimento.buscaAtendimento(10);
        assertEquals("Cris", cris.getNome());
        assertEquals("Segunda - 15h30", cris.getHorario());
        assertEquals(8.0, cris.getPeriodo(), 0.1);
    }

    @Test
    public void testeBuscaMarcelo(){
        Mockito.when(service.busca(30)).thenReturn(atendimentoConst.MARCELO);
        atendimento marcelo = buscaAtendimento.buscaAtendimento(30);
        assertEquals("Marcelo", marcelo.getNome());
        assertEquals("Sexta - 17h30", marcelo.getHorario());
        assertEquals(6.0, marcelo.getPeriodo(), 0.1);
    }


    @Test
    public void testeBuscaPhyll(){
        Mockito.when(service.busca(10)).thenReturn(atendimentoConst.CRIS);
        atendimento cris = buscaAtendimento.buscaAtendimento(10);
        assertEquals("Phyll", cris.getNome());
        assertEquals("Segunda - 15h30", cris.getHorario());
        assertEquals(8.0, cris.getPeriodo(), 0.1);
    }


    @Test
    public void testeBuscaPhyll_Existe(){
        Mockito.when(service.busca(10)).thenReturn(atendimentoConst.INEXISTENTE);
        atendimento inexistente = buscaAtendimento.buscaAtendimento(10);
        assertEquals("Phyll", inexistente.getNome());
        assertEquals("Sexta - 15h30", inexistente.getHorario());
        assertEquals(0.0, inexistente.getPeriodo(), 0.1);
    }

    @Test
    public void testeBuscaCris_horario(){
        Mockito.when(service.busca(10)).thenReturn(atendimentoConst.CRIS);
        atendimento cris = buscaAtendimento.buscaAtendimento(10);
        assertEquals("Cris", cris.getNome());
        assertEquals("Sábado - 07h00", cris.getHorario());
        assertEquals(8.0, cris.getPeriodo(), 0.1);
    }


}