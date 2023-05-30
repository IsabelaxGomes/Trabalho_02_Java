import java.util.ArrayList;

public class Controller {

    private static ArrayList<Animal> animais;

    public static void Imprimir() {
        for (int i = 0; i < animais.size(); i++) {
            animais.get(i).som();
        }
    }

    public static void main(String[] args) {
        animais = new ArrayList<>();

        Cachorro c_1 = new Cachorro();
        Cachorro c_2 = new Cachorro();
        Cachorro c_3 = new Cachorro();

        Gato g_1 = new Gato();
        Gato g_2 = new Gato();

        animais.add(c_1);
        animais.add(c_2);
        animais.add(c_3);
        animais.add(g_1);
        animais.add(g_2);

        Imprimir();

    }
}
