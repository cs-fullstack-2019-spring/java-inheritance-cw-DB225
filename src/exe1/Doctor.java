package exe1;

public class Doctor extends Person {
    private String greetingDoc = "Good morning/Afternoon Dr ";
    private String doctor;

    public Doctor(String doctor) {
        this.doctor = doctor;
    }

    public String toString(){
        return (greetingDoc+doctor);
    }
}
