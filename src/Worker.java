public class Worker {

    private String name;
    private String birthday;
    protected String endDate;

    public Worker(){

    }

    public Worker(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public int getAge() {
        int currentYear = 2026;
        int birthYear = Integer.parseInt(birthday.substring(6));

        return (currentYear - birthYear);
    }
}
