package practice06;

public class Teacher extends Person{

    private int klass;

    public int getKlass() {
        return klass;
    }

    public Teacher(String name, int age) {
        this(name, age,-1);
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public String introduce(){
        if (klass != -1) {
            return super.introduce() + " I am a Teacher. I teach Class " + klass + ".";
        } else {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
    }
}
