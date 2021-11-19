import java.util.*;
import java.lang.StringBuilder;
public class build {
    public static void main(String[]args){
        StringBuilder build = new StringBuilder();
        String str1="hello,";
        build.append(str1);
        System.out.println("What is your name?");
        Scanner in = new Scanner(System.in);
        String str2=in.nextLine();
        build.insert(6,str2);//相当于第6位前一个，如果是0就是在hello，的h前面。
        String str= build.toString();
        System.out.printf("%s",str);
    }
}
