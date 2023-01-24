public class Main {
    public static void main(String[] args){
        Customer joao = new Customer("João", "joao_aguiarcosta@hotmail.com");
        System.out.println(joao.getCreditLimit());
        System.out.println(joao.getName());
    }
}
