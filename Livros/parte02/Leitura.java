import java.io.File;
import java.util.Scanner;

public class Leitura {
    

    public static void main(String[] args) {
        File meu_arquivo = new File ("meus_dados.dat");


        try{
        Scanner sc = new Scanner(meu_arquivo);

        String linha = sc.nextLine();
        
        String [] partes = linha.split(",");
        for(int i= 0; i <partes.length; ++i){
            System.out.println("[" + i +"]:" + partes[i]);
        }

        String cargo = partes[0];
        int idade = Integer.parseInt(partes[1]);
        String habilidades  = partes [2];

        System.out.println(cargo);
        System.out.println(idade + 3);
        System.out.println(habilidades);
        



        System.out.println(linha);
        
        }catch(Exception e){

            e.printStackTrace();
        }


    }
}
