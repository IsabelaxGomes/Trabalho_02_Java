import java.io.File;
import java.io.FileWriter;
public class Ex02 {

    public static void main(String[] args) {

        try{

            File arquivo = new File("meus_dados.dat");
            arquivo.createNewFile();

            FileWriter fw = new FileWriter("meus_dados.dat", true);
            
            fw.write("---------------------------------------");
            String x = " \n\"Cabo\" - 15 - \"Resistencia\"\n";
            fw.write(x);

            fw.write("\n\"Soldado\" , 35, \"Agilidade\"\n");

            fw.write("\n\"Major\" , 49, \"Forca\"\n");

            fw.write("\n\"General\" , 180 , \"Astucia\"\n");

            fw.write("---------------------------------------");

            fw.close();
                    
                
                            
        

        }catch (Exception e ){
            e.printStackTrace();
        }
         

    }
    
}
