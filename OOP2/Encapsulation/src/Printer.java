public class Printer {
    private double tonerPercentLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(boolean duplex){
        this(100, duplex);
    }

    public Printer(int tonerPercentLevel, boolean duplex) {

        if(tonerPercentLevel >100){
            this.tonerPercentLevel = 100;
        } else if(tonerPercentLevel <=0){
            this.tonerPercentLevel = 0;
        } else{
            this.tonerPercentLevel = tonerPercentLevel;
        }

        this.duplex = duplex;
    }

    public double addToner(double tonerAmount){

        if(tonerPercentLevel+tonerAmount > 100){
           return tonerPercentLevel = 100;
        } else{
            return tonerPercentLevel+=tonerAmount;
        }
    }

    public void printPages(int pages){

        if(duplex && hasPercentEnough(pages*2)){
                pagesPrinted = pages*2;
            System.out.println("Amount of pages printed is " + pagesPrinted);
            System.out.println("Toner Level: " + tonerPercentLevel);
        }
        if(!duplex && hasPercentEnough(pages)){
            System.out.println("Amount of pages printed is " + pagesPrinted);
            System.out.println("Toner Level: " + tonerPercentLevel);
        }

    }

    private boolean hasPercentEnough(int pages){
        double percentLose = pages*1/4;

        if((tonerPercentLevel - percentLose) < 0){
            System.out.println("Toner Level is too low.");
             return false;
        }
        tonerPercentLevel -= percentLose;
        return true;
    }
}
