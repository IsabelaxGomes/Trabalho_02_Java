import java.io.File;

public class apagar {
    public static void main(String[] args) {
        File arq = new File("apagar.txt");
        arq.delete();

        File pasta = new File("../Arquivos");
        System.out.println(
                "A pasta existe: "
                        + pasta.exists());

        if (pasta.exists()) {
            String[] arquivos = pasta.list();

            for (int i = 0; i < arquivos.length; ++i) {
                System.out.println(arquivos[i]);
            }
            



            
        }
    }
}
