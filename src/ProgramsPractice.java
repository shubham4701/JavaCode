import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProgramsPractice {

    public static void main(String[] args) {

        stringManipulate("ZpglnRxqenU");

    }















    private static String[] stringCommon() {
        String array1[] = new String[]{ "arp", "live", "strong" };
        String array2[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < array1.length; i++) {
            for(String b : array2) {
                if(b.contains(array1[i])) {
                    list.add(array1[i]);
                    break;
                }
            }
        }
        return list.toArray(new String[list.size()]);
    }

    private static void callFindDifference() {
        String[] a1 = new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        String[] a2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
        System.out.println(findDifference(a1, a2));
        a1 = new String[]{"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"};
        a2 = new String[]{"bbbaaayddqbbrrrv"};
        System.out.println(findDifference(a1, a2));
    }

    private static int findDifference(String[] a1, String[] a2) {
        if(a1.length == 0 || a2.length == 0) return -1;
        int diff = 0;
        for(String data : a1) {
            for(String data2 : a2) {
                if(Math.abs(data2.length() - data.length()) > diff) {
                    diff = Math.abs(data2.length() - data.length());
                }
            }
        }
       return diff;
    }

    static int counter = 0;
    static int prev_counter = 0;
    public static int persistence(long n) {
        // your code
        if(n >= 10) {
            n = multiplyDigits(n);
            counter++;
            persistence(n);

        } else {
            prev_counter = counter;
            counter = 0;
        }
        return prev_counter;
    }

    private static long multiplyDigits(long n) {
        long product = 1;
        while(n > 0) {
            product *= n%10;
            n /= 10;
        }
        return product;
    }

    private static void stringManipulate(String data) {
        StringBuilder final_string = new StringBuilder();
        int length = data.length();
        for(int i = 0; i < length; i++){
            for(int j = 0; j <= i; j++){
                final_string.append((j == 0)?Character.toUpperCase(data.charAt(i)):Character.toLowerCase(data.charAt(i)));
            }
            if(i < length-1) final_string.append('-');
        }
        System.out.println(final_string);
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

    private void checkNumberDivisbleBySum() {
        int a = 0;
        System.out.println("Please enter the number");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        int sum = sumOfDigits(a);
        System.out.println((a % sum == 0));
    }

    private static int sumOfDigits(int a) {
        int sum = 0;
        while (a != 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }

}
