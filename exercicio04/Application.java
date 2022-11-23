import banner.Banner;
import controller.Controller;

class Application {
    public static void main(String[] args) {
        Banner b = new Banner();
        b.banner();
        b.informacoes();

        Controller controller = new Controller();
        controller.applicationEscolha();

    }
}