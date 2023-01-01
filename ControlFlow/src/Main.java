public class Main {
    public static void main(String[] args){

        learnSwich(3);

        System.out.println("Janeiro está no " + newSwicth("JANEIRO"));
    }

    public static String newSwicth(String month){
      return switch(month){
          case "JANEIRO", "FEVEREIRO", "MARÇO", "ABRIL", "MAIO", "JUNHO" -> "1 semestre";
          case "JULHO", "AGOSTO", "SETEMBRO", "OUTUBRO", "NOVEMBRO", "DEZEMBRO" -> "2 semestre";

          default -> "wrong data";
      };
    }
    public static void learnSwich(int value){
        switch (value) {
            case 1 -> System.out.println("YOUR VALUE IS 1");
            case 2 -> System.out.println("YOUR VALUE IS 2");
            default -> System.out.println("No valid value");
        }


//        switch (value){
//            case 1:
//                System.out.println("YOUR VALUE IS 1");
//
//                break;
//            case 2:
//                System.out.println("YOUR VALUE IS 2");
//
//                break;
//            default:
//                System.out.println("No valid value");
//        }
    }
}