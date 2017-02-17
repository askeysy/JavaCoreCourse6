package HW3.HW33;

public class SpecialStudent extends CollegeStudent{
    private long secretKey;
    private String email;
    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public SpecialStudent(String firstName, String lastName, int group, long secretKey, String email) {
        super(firstName, lastName, group);
        this.secretKey = secretKey;
    }

    public SpecialStudent(String lastName, Course[] coursesTaken, long secretKey, String email) {
        super(lastName, coursesTaken);
        this.secretKey = secretKey;
    }

    public long getSecretKey() {
        return secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
