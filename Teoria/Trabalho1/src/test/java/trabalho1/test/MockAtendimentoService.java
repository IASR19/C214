package trabalho1.test;

import  trabalho1.atendimentoService;

import java.util.ArrayList;

public class MockAtendimentoService implements atendimentoService
{
    @Override
    public String busca(int id){
        if(id == 10)  return atendimentoConst.CRIS;
        else if (id == 20) return atendimentoConst.RENZO;
        else if (id == 30) return atendimentoConst.MARCELO;
        else return atendimentoConst.INEXISTENTE;
    }

    @Override
    public boolean atendimentoExistente(int id) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        for (int i=0; i < list.size(); i++){
            if (list.get(i).equals(id) || list.get(i).equals(id)){
                return true;
            }else{
                return false;
            }
        }

        return false;

    }
}