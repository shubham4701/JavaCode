import java.util.Scanner;

public class StringPattern1 {
    private static String stringManipulate(String data) {
        StringBuilder final_string = new StringBuilder();
        int length = data.length();
        for(int i = 0; i < length; i++){
            for(int j = 0; j <= i; j++){
                final_string.append((j == 0)?Character.toUpperCase(data.charAt(i)):Character.toLowerCase(data.charAt(i)));
            }
            if(i < length-1) final_string.append('-');
        }
        return (final_string.toString());
    }

    public static void main(String[] args) {
        String text = "";
        System.out.println("********** String Pattern 1 **********");
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("\nType exit to close program, enter the String to continue");
                System.out.print("\nPlease Enter String : ");
                text = scanner.next();
                if (text.equalsIgnoreCase("exit")) {
                    System.out.print("\nBye..");
                    break;
                }
                System.out.println("\nNumber of Duplicates : " + stringManipulate(text));
            }
        }
    }
}
