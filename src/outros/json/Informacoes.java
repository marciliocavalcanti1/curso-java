package outros.json;
 
import java.util.ArrayList;
import java.util.List;
 
public class Informacoes {
     
    private int informacao1 = 102;
    private String informacao2 = "Json";
     
    @SuppressWarnings("serial")
    private List<String> listaInformacoes = new ArrayList<String>() {
      {
        add("Teste");
        add("Json");
        add("String");
      }
    };
  
    @Override
    public String toString() {
       String dadosParaImpressao = "[Informação 1 = " + informacao1;
    		  dadosParaImpressao+= ", Informação 2 = " + informacao2;
    		  dadosParaImpressao+= ", List = " + listaInformacoes +"]";
       return dadosParaImpressao;
    }
}