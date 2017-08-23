package tk.iammohitsharma.challenges.Codewars;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.*;

public class SortArrayBySumOfDigits implements Comparator {
    private static int sumOfDigits(String number) {
        try{
            Long num = Long.parseLong(number);
            int sum = 0;
            while(num > 0) {
                sum += num % 10;
                num /= 10;
            }
            return sum;
        } catch (NumberFormatException e) {
            System.out.println("Error : " + e.getMessage());
        }
        return 0;
    }

    @Override
    public int compare(Object o1, Object o2) {
        if ((sumOfDigits(o1.toString()) > sumOfDigits(o2.toString())) && (o1.toString().length() > o2.toString().length())){
            return 1;
        } else if (sumOfDigits(o1.toString()) < sumOfDigits(o2.toString())) {
            return -1;
        } else if(sumOfDigits(o1.toString()) == sumOfDigits(o2.toString())){
            return o1.toString().compareTo(o2.toString());
        }
        else{
            return 0;
        }
    }

    private static String orderWeight(String strng) {
        StringBuilder solution = new StringBuilder();
        List<String> dataArray = Arrays.asList(strng.replace("\"", "").split(" "));
        dataArray.sort(new SortArrayBySumOfDigits());
        for (int i = 0; i < dataArray.size(); i++) {
            solution.append(dataArray.get(i) + ((i < dataArray.size()-1)?" ":""));
        }
        return solution.toString();
    }

    public static void main(String[] args) {
        System.out.println("********** Sort Strings By Weight ***********");
        System.out.println("\n2000 10003 1234000 44444444 9999 11 11 22 123\n");
        System.out.println("Sorted String by weights is : ");
        System.out.println(orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
    }
}
