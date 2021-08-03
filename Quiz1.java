import java.util.Scanner;
public class Quiz1 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        Scanner name = new Scanner(System.in);

        System.out.print("번호 입력: ");
        int num = number.nextInt();
        System.out.print("이름 입력: ");
        String nam = name.next();

        System.out.println(num + " " + nam);
    }
}
