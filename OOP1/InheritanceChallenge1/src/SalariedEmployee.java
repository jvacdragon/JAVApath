public class SalariedEmployee extends  Employee{
    private double annualSalary;
    private boolean isRetired;

    SalariedEmployee(String name, String birthDay, String hireDate, double annualSalary, boolean isRetired){
       super(name, birthDay, hireDate);
       this.annualSalary = annualSalary;
       this.isRetired = isRetired;
    }

    public void retire(){
        this.isRetired = true;
    }


    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}
