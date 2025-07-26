import model.User;
import service.ExamService;
import service.UserService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserService userService = new UserService();
        ExamService examService = new ExamService();

        System.out.println("Welcome to Online Examination System");
        System.out.print("Username: ");
        String user = sc.nextLine();
        System.out.print("Password: ");
        String pass = sc.nextLine();

        User currentUser = userService.login(user, pass);
        if (currentUser == null) {
            System.out.println("Invalid login.");
            return;
        }

        System.out.println("Login successful. Hello " + currentUser.getName());

        while (true) {
            System.out.println("\n1. Update Profile");
            System.out.println("2. Take Exam");
            System.out.println("3. Logout");
            System.out.print("Choose: ");
            int choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter new name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter new password: ");
                    String newPass = sc.nextLine();
                    userService.updateProfile(currentUser, name, newPass);
                    System.out.println("Profile updated!");
                    break;
                case 2:
                    examService.startExam();
                    break;
                case 3:
                    System.out.println("Logged out successfully!");
                    System.exit(0);
            }
        }
    }
}