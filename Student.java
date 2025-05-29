import java.util.Scanner;
public class Student extends Person {
    public String StudentId;
    public float Score;

    public Student(String name, int age, String studentId, float score) {
        super(name, age);
        this.StudentId = studentId;
        this.Score = score;
    }

    @Override
    public void nhapThongTin() {
        try {
            super.nhapThongTin();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập mã sinh viên: ");
            StudentId = scanner.nextLine();
            System.out.print("Nhập điểm: ");
            Score = Float.parseFloat(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi khi nhập thông tin sinh viên: " + e.getMessage());
        }
    }

    @Override
    public void hienThiThongTin() {
        try {
            super.hienThiThongTin();
            System.out.println("Mã sinh viên: " + StudentId);
            System.out.println("Điểm: " + Score);
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi khi hiển thị thông tin sinh viên: " + e.getMessage());
        }
    }
}