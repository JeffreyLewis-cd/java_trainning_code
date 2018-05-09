
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
        /*泛型集合中，不能添加泛型规定的类型及其子类型以外的对象！*/
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

    /*泛型集合可以添加泛型的子类型的对象实例*/
    public void testChild(){
        ChildCourse ccr=new ChildCourse();
        ccr.id="3";
        ccr.name="我是子类型的课程对象实例~~";
        courses.add(ccr);
    }

    /*泛型不能使用基本类型*/
    public void testBasicType(){
        List<Integer>list=new ArrayList<Integer>();
        list.add(1);
        System.out.println("基本类型必须使用包装类作为泛型: "+list.get(0));
    }

    public static void main(String[] args) {
        TestGeneric tg = new TestGeneric();
        tg.testAdd();
        tg.testForEach();
        tg.testChild();
        tg.testForEach();
        tg.testBasicType();
    }
}
