package lab08;

public class Tongket {
    public static void main(String[] args) {
        Student st1 = new Student("123" , "Thi", 21, 9);
        System.out.println(st1);
        st1.setGrade();
        System.out.println(st1);
        Person a = new Person("1" , "Thi" , 21);
        System.out.println(a);

    }
}
