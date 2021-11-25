package School;

public class Student extends Member{
    private int number;
    private String department;
    public Student(String name,String gender,int age,int number,String department){
        super(name,gender,age);
        this.number=number;
        this.department=department;
    }
    public int getNumber(){
        return number;
    }
    public String getDepartment(){
        return department;
    }
}
