package outros.json;
 
//import java.io.FileWriter;
//import java.io.IOException;
import com.google.gson.Gson;
 
public class Java2Json {
	
	static String json;
	
	public static String convertToJson() {
		Informacoes obj = new Informacoes();
		Gson gson = new Gson();
		json = gson.toJson(obj);
		return json;
	}
    public static void main(String[] args) {
      
    	System.out.println(convertToJson());
    	
//    try {
//        //Escreve Json convertido em arquivo chamado "file.json"
//        FileWriter writer = new FileWriter("C:\\Users\\m.matos.cavalcanti\\OneDrive - Avanade\\Projetos\\udemy\\java\\workspace\\cursoJava\\src\\outros\\json\\file.json");
//        writer.write(json);
//        writer.close();
//  
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
  
    }
}