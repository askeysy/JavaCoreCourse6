package HW3;

public class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getSalary() {
        return salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    void paySalary(){
        balance+=salary;
    }

    void withdraw(int summ){
        int percent;
        if (summ<1000){
            percent=summ*5/100;
        }
        else percent = summ * 10 / 100;
        balance-=percent;
    }
    void companyNameLenght(){
        User Worker=new User("Worker",15000,5,"IKEA",1000,"EUR");
        int companyLength=Worker.getCompanyName().length();
    }
    void monthIncreaser(int addMonth){
        User Worker=new User("Worker",15000,5,"IKEA",1000,"EUR");
        int month=Worker.getMonthsOfEmployment();
        Worker.setMonthsOfEmployment(month+addMonth);
    }

    public static void main(String[] args) {
        User user=new User("1",5000,5,"ss",2540,"USD");
        System.out.println(user.getSalary());
    }
}

