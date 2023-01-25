public class Main extends java.lang.Object {
    public static void main(String[] args){
        Student joao = new Student("joao", 19);
        System.out.println(joao);

        PrimarySchoolStudent lucas = new PrimarySchoolStudent("lucas", 8, "marcia");
        System.out.println(lucas);
    }
}

class Student{
    private String name;
    private int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class PrimarySchoolStudent extends Student{
    private String parentName;

    PrimarySchoolStudent(String name, int age, String parentName){
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return "PrimarySchoolStudent{" +
                "parentName='" + parentName + '\'' +
                "} " + super.toString();
    }
}
