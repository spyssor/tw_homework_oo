package practice10;

import java.util.List;

public class Teacher extends Person{

    private List<Klass> classes;

    public List<Klass> getClasses() {
        return classes;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, List<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public boolean isEmptyFromClass(){
        return classes == null || classes.size() == 0;
    }

    public String introduce() {
        if (isEmptyFromClass()) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < classes.size(); i ++) {
                sb.append( i == classes.size() - 1 ? classes.get(i).getNumber() : classes.get(i).getNumber() + ", ");
            }
            return super.introduce() + " I am a Teacher. I teach Class " + sb.toString() + ".";
        }
    }

    public String introduceWith(Student student) {
        if (classes.contains(student.getKlass())) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        } else {
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() +".";
        }
    }

    public boolean isTeaching(Student student){

        for (Klass klass : classes) {
            if (klass.isIn(student)){
                return true;
            }
        }

        return false;
    }
}
