package trabalho1;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaAtendimento {
    atendimentoService AtendimentoService;

    public BuscaAtendimento(atendimentoService service) {this.AtendimentoService = service;}

    public atendimento buscaAtendimento(int id){
        String atendimentoJson = AtendimentoService.busca(id);
        JsonObject jsonObject = JsonParser.parseString(atendimentoJson).getAsJsonObject();

        return new atendimento(jsonObject.get("nome").getAsString(),
                jsonObject.get("horario").getAsString(),
                jsonObject.get("periodo").getAsInt());
    }

    public boolean verificaArrayListExistente (int id){
        boolean atendimentoExistente = AtendimentoService.atendimentoExistente(id);
        if (atendimentoExistente){
            return true;
        }

        else{
            return false;
        }
    }
}
