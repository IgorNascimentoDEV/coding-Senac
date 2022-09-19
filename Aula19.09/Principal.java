public class Principal {
    public static void main(String[] args) {
        Animal bidu = new Animal("Vira-Lata", "Bidu", 14f, 'M', 12);
        System.out.println("ola " + bidu.nome);
        bidu.Andar();
        System.out.println(bidu.hashCode());
    
        Animal tartaruga = new Animal("Tartaruga", "Donatelo", 115f, 'M', 21);
        System.out.println("Esse e o "+ tartaruga.nome);
        tartaruga.Andar();
        System.out.println(tartaruga.hashCode());
    }
}