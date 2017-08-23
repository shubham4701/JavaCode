import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProgramsPractice {

    public static void main(String[] args) {



    }


    private void girlCountFingers() {
        int a = 0;
        System.out.println("Please enter the number");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        switch (a % 10) {
            case 1:
                System.out.println("Thumb");
                break;
            case 2:
                System.out.println("Index");
                break;
            case 3:
                System.out.println("Middle");
                break;
            case 4:
                System.out.println("Ring");
                break;
            case 5:
                System.out.println("Little");
                break;
            case 6:
                System.out.println("Thumb");
                break;
            case 7:
                System.out.println("Index");
                break;
            case 8:
                System.out.println("Middle");
                break;
            case 9:
                System.out.println("Ring");
                break;
            case 0:
                System.out.println("Little");
                break;
        }
    }



}
