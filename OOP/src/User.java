public class SinhVien {
    private String name;
    private int age;
    private double gpa;

    public SinhVien(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void hienThi(){
        System.out.println(" Toi ten la " + name +" nam nay toi " + age + " tuoi, gpa cua toi la "+ gpa );
    }
}
