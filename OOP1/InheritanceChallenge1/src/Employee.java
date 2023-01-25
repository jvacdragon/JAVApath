import java.util.UUID;
public class Employee extends Workers{
    private UUID EmployeeId;
    private String hireDate;

    Employee(String name, String birthDay, String hireDate){
        super(name, birthDay);
        this.EmployeeId = UUID.randomUUID();
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeId=" + EmployeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
