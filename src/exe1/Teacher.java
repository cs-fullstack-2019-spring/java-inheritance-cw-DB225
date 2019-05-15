package exe1;

public class Teacher extends Person {
    private String greetingTeacher = "Hello Mr/Mrs ";
    private String teacher;

    public Teacher(String teacher) {
        this.teacher = teacher;
    }

    public String toString(){
        return (greetingTeacher+teacher);
    }
}
