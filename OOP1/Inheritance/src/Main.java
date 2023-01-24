public class Main {
    public static void main(String[] args) {
        Animal vertebrado = new Animal("vertebrado", "2 metros", 50);
        String vertData = vertebrado.toString();

        System.out.println(vertData);

        Dog doug = new Dog("mamifero", "medium", 35, "doug");

        System.out.println(doug.toString());
    }

}
