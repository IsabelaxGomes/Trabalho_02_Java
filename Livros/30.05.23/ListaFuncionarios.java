import java.io.File;
import java.util.ArrayList;
import java.io.FileWriter;


public class ListaFuncionarios{

    ArrayList<Funcionario> funcionario;


    void salvar ( ){//pega todos os funcionarios e escreve na lista 

        try{
            //Criar arquivo
            File arquivo = new File("Funcionarios.txt"); // Criando um objeto criando um espaço para ele 
            arquivo.createNewFile();


            //Escrevendo os funcionarios 
            FileWriter fw = new FileWriter(arquivo); // a varivel criada lá em cima ou posos passar o Funcionario.txt. as com a variavel se vc mudar em um local e não em outro 



            //Percorrer a lista
            for (int i=0; i <funcionario.size(); ++i){
                String func =   funcionario.get(i). nome + ","+ 
                                funcionario.get(i).idade + "," + 
                                funcionario.get(i).altura + "," +
                                funcionario.get(i).ativo + "\n";

                fw.write(func);

           //fechar

            } fw.close();
                


        }catch (Exception e){

            e.printStackTrace();
        }

    }





    void carregar ( ){
        //Abrir o arquivo

        //Ler linha por linha

        //Split para separar nas virgulas 

        //Cria funcionario com os dados 


    }



    public ListaFuncionarios(){//iniciando a lista de funionarios 

        this.funcionario = new ArrayList<>(); 
    }
}