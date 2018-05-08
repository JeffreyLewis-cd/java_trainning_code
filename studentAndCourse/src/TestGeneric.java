
import java.util.*;

public class TestGeneric {
    public List <Course> courses;

    public TestGeneric(){
        this.courses=new ArrayList<Course>();
    }

    /*添加测试*/
    public void testAdd(){
        Course cr1=new Course("1","大学语文");
        courses.add(cr1);
        /*泛型集合中，不能添加规定以外的类型！*/
//        courses.add("能否添加奇怪的东西？");

        Course cr2=new Course("2","Java基础");
        courses.add(cr2);
    }

    /*测试循环遍历*/
    public void testForEach(){
        for(Course cr:courses){
            System.out.println("课程Id为："+cr.id+",课程名称为："+cr.name);
        }
    }

    public static void main(String[] args) {
        TestGeneric tg = new TestGeneric();
        tg.testAdd();
        tg.testForEach();

    }
}
