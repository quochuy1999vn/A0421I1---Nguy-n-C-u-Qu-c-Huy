package class_and_object_in_java.class_fan;

public class Test {
    public static void main(String[] args) {
        Fan fan1 = new Fan();

//        fan1.setSpeed(fan1.getFast());
//        fan1.setRadius(10);
//        fan1.setColor("yellow");
//        fan1.setOn(true);
//        System.out.println(fan1.toString());

        Fan fan2 = new Fan();

        fan2.setSpeed(fan1.getMedium());
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println(fan1.toString());
    }

}
