import java.io.FileWriter;

public class  Escrita {

    public static void main(String[] args) {
        
    
    
     try { 

         FileWriter fw = new FileWriter("Teste.txt", true); 

         String x =  "Tudo bem?";///02
         fw.write(x);

         fw.write("\nOii,\n");///01
         fw.write("Como vai?");

        
         
         fw.close();


        } catch (Exception e){

            e.printStackTrace();


        }

        
}
}
    

