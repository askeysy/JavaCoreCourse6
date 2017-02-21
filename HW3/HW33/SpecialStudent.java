package HW3.HW33;

public class SpecialStudent extends CollegeStudent{
    private long secretKey;
    private String email;
    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public SpecialStudent(String lastName, String coursesTaken) {
        super("", null);
    }

    public SpecialStudent(long secretKey, String email) {
        super("", null);
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
