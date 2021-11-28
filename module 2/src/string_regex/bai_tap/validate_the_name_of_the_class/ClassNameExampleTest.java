package string_regex.bai_tap.validate_the_name_of_the_class;

public class ClassNameExampleTest {
    private static ClassNameExample classNameExample;

    public static final String[] validClassName = new String[] {"A0421I","C0321G","P0221K"};
    public static final String[] invalidClassName = new String[] {"B0421I","D0321G","E0221K"};

    public static void main(String[] args) {
        classNameExample = new ClassNameExample();

        for (String className : validClassName) {
            boolean isvalid = classNameExample.validate(className);
            System.out.println("Class Name is " + className +" is valid: "+ isvalid);
        }
        for (String className : invalidClassName) {
            boolean isvalid = classNameExample.validate(className);
            System.out.println("Class Name is " + className +" is valid: "+ isvalid);
        }
    }
}
