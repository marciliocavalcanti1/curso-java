package outros.json;

import com.google.gson.Gson;
 
public class Json2Java {
	
    public static void main(String[] args) {
 
        Gson gson = new Gson();
        
        Informacoes obj = gson.fromJson(Java2Json.convertToJson(), Informacoes.class);
        
        System.out.println(obj);
        
//        try {
// 
//            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\m.matos.cavalcanti\\OneDrive - Avanade\\Projetos\\udemy\\java\\workspace\\cursoJava\\src\\outros\\json\\file.json"));
// 
//            //Converte String JSON para objeto Java
//            Informacoes obj = gson.fromJson(br, Informacoes.class);
// 
//            System.out.println(obj);
// 
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}