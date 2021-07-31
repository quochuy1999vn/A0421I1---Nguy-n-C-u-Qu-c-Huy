package accessModifier_staticMethod_staticProperty.bai_tap.build_write_only_classes_in_java;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName());
        System.out.println(student.getClasses());
        student.setName("Huy");
        student.setClasses("A0421I1");
        System.out.println(student.getName());
        System.out.println(student.getClasses());
    }

}
