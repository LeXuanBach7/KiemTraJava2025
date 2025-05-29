public class Person {
    public String Name;
    public int Age;

    public Person(String name, int age) {
        this.Name = name;
        this.Age = age;
    }

    public void nhapThongTin() {
        try {
            System.out.println("Nhập tên: " + Name);
            System.out.println("Nhập tuổi: " + Age);
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi khi nhập thông tin: " + e.getMessage());
        }
    }

    public void hienThiThongTin() {
        try {
            System.out.println("Tên: " + Name);
            System.out.println("Tuổi: " + Age);
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi khi hiển thị thông tin: " + e.getMessage());
        }
    }
}