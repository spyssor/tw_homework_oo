package practice09;

public class Teacher extends Person{

    private Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public boolean isEmptyFromClass(){
        return klass == null;
    }

    public String introduce() {
        if (isEmptyFromClass()) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            return super.introduce() + " I am a Teacher. I teach Class " + klass.getNumber() + ".";
        }
    }

    public String introduceWith(Student student) {
        if (student.getKlass().equals(this.klass)) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        } else {
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() +".";
        }
    }
}
