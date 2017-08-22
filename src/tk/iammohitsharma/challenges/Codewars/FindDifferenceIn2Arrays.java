public class FindDifferenceIn2Arrays {
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

    public static void main(String[] args) {
        System.out.println("********** FInd Difference of Max length to Min Length in 2 Arrays **********");
        callFindDifference();
    }
}
