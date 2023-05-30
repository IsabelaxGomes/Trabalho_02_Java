public class Controller {
    public static void main(String[] args) {
        Robo meu_robo;
        meu_robo = new Robo();
        meu_robo.set_modelo("C");
        meu_robo.set_versao(1.4f);

        meu_robo.set_durabilidade(100);
        System.out.println(meu_robo.funcional());

        meu_robo.set_durabilidade(1);
        System.out.println(meu_robo.funcional());

        meu_robo.set_durabilidade(0);
        System.out.println(meu_robo.funcional());

        meu_robo.set_durabilidade(-1.0f);
        System.out.println(meu_robo.funcional());

        System.out.println("Durabilidade: " + meu_robo.get_durabilidade());
        meu_robo.pegar_chuva();
        System.out.println("Durabilidade: " + meu_robo.get_durabilidade());

        System.out.println(meu_robo);
    }
}
