import java.util.Scanner;
import java.io.File; 

public class Ex {
    

    
    public static void main(String[] args) {
        
        String nome; 
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        nome = sc.nextLine();



        try{
            File arq = new File (nome);
            
            arq.createNewFile();

            
            
        }catch(Exception erro){

            System.out.println("Aqui estou");
            erro.printStackTrace();
        }

        
        
    }
}

