package School;

public class Gradstudent extends Student{
    private String instructor;
    public Gradstudent(String name,String gender,int age,int number,String department,String instructor){
        super(name,gender,age,number,department);
        this.instructor=instructor;
    }
    public String getInstructor(){
        return instructor;
    }
}
