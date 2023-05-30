import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;






public class Manipulacao {


    public static void main(String[] args) {

        //CRIANDO ARQUIVO
       try{
            File arq = new File ("meus_livros.dat");
    
            boolean nao_exisitia = arq.createNewFile();
    
            if(nao_exisitia){
                System.out.println("Criei o Arquivo");
    
            }else{
                System.out.println("Já existia");
            }
            


            ////// ESCREVENDO 
            FileWriter fw = new FileWriter("meus_livros.dat", true);
            //fw.write("---------------------------------------");
                String x = " Davi - Mario - Acao\n" ;
                fw.write(x);
    
               String y = "Maria -  Como era antes de vc - Romance";
                fw.write(y);
                
              
    
                fw.close();
                        

        
        ////// Leitura
                File meu_arquivo = new File ("meus_livros.dat");

       
                       Scanner sc = new Scanner(meu_arquivo);
  
                         String linha = sc.nextLine();
        
                     String [] partes = linha.split(" , ");


                     
                    for(int i= 0; i <partes.length; ++i){
                       System.out.println("[" + i +"]:" + partes[i]);
          
  
                      String cliente1 = partes[0];
                      String cliente2 = partes[1];
                     // String cliente3 = partes[2];


                
                        System.out.println(cliente1);
                        System.out.println(cliente2);
                       // System.out.println(cliente3);

                       System.out.println(linha);

                    }
                
               

        } catch(Exception e){
       
           
                e.printStackTrace(); 
    
              
            }


        }
    }

    





    
    

