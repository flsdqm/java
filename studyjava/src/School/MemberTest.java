package School;

public class MemberTest {
    public static void main(String[] args) {
        var teacher1 = new Teacher("李雷", "男", 49, "教授", "Java");
        var student1 = new Student("华哥", "男", 19, 1234, "计算机学院");
        var student2 = new Student("小红", "女", 20, 2136, "数学与统计学学院");
        var gradstudent1 = new Gradstudent("烨子", "男", 24, 167793, "计算机学院", "李雷");
        System.out.println("name=" + teacher1.getName() + ",gender=" + teacher1.getGender() + ",age=" + teacher1.getAge()+",title="+teacher1.getTitle()+",course="+teacher1.getCourse());
        System.out.println("name=" + student1.getName() + ",gender=" + student1.getGender() + ",age=" + student1.getAge()+",number="+student1.getNumber()+",department="+student1.getDepartment());
        System.out.println("name=" + student2.getName() + ",gender=" + student2.getGender() + ",age=" + student2.getAge()+",number="+student2.getNumber()+",department="+student2.getDepartment());
        System.out.println("name=" + gradstudent1.getName() + ",gender=" + gradstudent1.getGender() + ",age=" + gradstudent1.getAge()+",number="+gradstudent1.getNumber()+",department="+gradstudent1.getDepartment()+",instructor="+gradstudent1.getInstructor());
    }
}
