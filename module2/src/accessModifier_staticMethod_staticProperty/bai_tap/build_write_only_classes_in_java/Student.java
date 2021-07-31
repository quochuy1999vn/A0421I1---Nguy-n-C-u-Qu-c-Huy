package accessModifier_staticMethod_staticProperty.bai_tap.build_write_only_classes_in_java;

public class Student {
    private String name = "John";
    private String classes = "CO2";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
}
