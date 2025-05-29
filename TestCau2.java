import java.util.LinkedList;
import java.util.Scanner;
public class TestCau2 {
    public static void main(String[] args) {
        LinkedList<Student> LinkedListStudent = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Nhập tên sinh viên: ");
            String name = scanner.nextLine();
            System.out.print("Nhập tuổi sinh viên: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập mã sinh viên: ");
            String studentId = scanner.nextLine();
            System.out.print("Nhập điểm: ");
            float score = Float.parseFloat(scanner.nextLine());

            Student student = new Student(name, age, studentId, score);
            LinkedListStudent.add(student);

            System.out.println("Bạn có muốn nhập thêm thông tin sinh viên? (yes/no)");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("yes")) {
                break;
            }
        }

        while (true) {
            System.out.print("Nhập mã sinh viên cần sửa thông tin: ");
            String studentIdToEdit = scanner.nextLine();
            boolean found = false;

            for (Student student : LinkedListStudent) {
                if (student.StudentId.equals(studentIdToEdit)) {
                    found = true;
                    System.out.print("Nhập tên mới: ");
                    student.Name = scanner.nextLine();
                    System.out.print("Nhập tuổi mới: ");
                    student.Age = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập điểm mới: ");
                    student.Score = Float.parseFloat(scanner.nextLine());
                    System.out.println("Thông tin sinh viên đã được cập nhật.");
                    break;
                }
            }

            if (!found) {
                System.out.println("Không tìm thấy sinh viên với mã " + studentIdToEdit);
            }

            System.out.println("Bạn có muốn sửa thông tin sinh viên khác? (yes/no)");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Thông tin của tất cả sinh viên:");
        for (Student student : LinkedListStudent) {
            student.hienThiThongTin();
        }
    }

}
