package School;

public class Teacher extends Member{
    private String title;
    private String course;
    public Teacher(String name,String gender,int age,String title,String course){
        super(name,gender,age);
        this.title=title;
        this.course=course;
    }
    public String getTitle(){
        return title;
    }
    public String getCourse(){
        return course;
    }
}
