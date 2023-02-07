package tutorials;

public interface JavaInterface {
    void build();
    String rename();
}

abstract class JavaAbstractClass {
    public void build(String newBuild) {
        System.out.println("Build");
    }
    public String rename(String newName) {
        return newName;
    }
}

class JavaClass extends JavaAbstractClass implements JavaInterface {

    @Override
    public void build(String newBuild) {

    }

    @Override
    public void build() {
        System.out.println("Build interface");
    }

    @Override
    public String rename() {
        return null;
    }

    public static void main(String[] args) {

    }
}

class RunClass {
    static JavaClass jc = new JavaClass();

    public static void main(String[] args) {
        jc.build();
    }
}
