import java.util.Scanner;
public class PrintTriangle {
    public String printTriangle(int num){
        System.out.println("높이가 "+num+"일때");
        for(int i = 1; i <= num; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        return "";
    }
    public static void main(String[] args) {
    PrintTriangle pt = new PrintTriangle();
    System.out.println(pt.printTriangle(3));
    System.out.println(pt.printTriangle(5));

    }
}
