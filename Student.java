public class Student {
    private int id;
    private int age;
    private int year;
    private String name;
    private String specialization;

    public Student(int id, int age, int year, String name, String specialization){
        this.id = id;
        this.age = age;
        this.year = year;
        this.name = name;
        this.specialization = specialization;
    }
    public int getId() {

        return id;
    }
    public void setYear(int year) {

        this.year = year;
    }
    public int getYear(){

        return year;
    }
    public void setAge(int age){

        this.age = age;
    }
    public int getAge() {

        return age;
    }
    public void setSpecialization(String  specialization) {
        this.specialization = specialization;
    }
    public String getSpecialization(){

        return specialization;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {

        return name;
    }
    @Override
    public String toString() {
        return "Student [id=" + id +
                ", age=" + age +
                ", year=" + year +
                ", name=" + name +
                ", specialization=" + specialization +
                "]";
    }
}

