import java.io.File;
import java.io.IOException; 

public class Base{

    public static void main(String[] args) {



        try{
        File arq = new File ("Teste.txt");

        boolean nao_exisitia = arq.createNewFile();

        if(nao_exisitia){
            System.out.println("Criei o Arquivo");

        }else{
            System.out.println("Já existia");
        }

       
        
        } catch(IOException e){

            System.out.println("Estou aqui ");
            e.printStackTrace(); 

          
        }
    }
}