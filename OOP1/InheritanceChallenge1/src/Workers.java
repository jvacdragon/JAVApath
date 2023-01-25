import java.time.LocalDate;
import java.time.Period;
public class Workers {
    private String name;
    private String birthDate;
    private String endDate;

    Workers(String name, String birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

   public int getAge(){
        LocalDate parseBirthDay = LocalDate.parse(this.birthDate);
        LocalDate curDate = LocalDate.now();
        //System.out.println(Period.between(parseBirthDay, curDate).getYears());
        return Period.between(parseBirthDay, curDate).getYears();
    }

    public double collectPay(){
        return 0.0;
    }

    public void terminateDate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Workers{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
