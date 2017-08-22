import java.util.Arrays;
import java.util.function.Function;

public class StringArrayMirror {

    public static String vertMirror(String strng) {
        // your code
        StringBuilder final_string = new StringBuilder();
        Arrays.stream(strng.split("\n")).forEach(a -> {
            final_string.append(new StringBuilder(a).reverse() + "\n");
        });
        return final_string.delete(final_string.length() - 2, final_string.length()).toString();
    }

    public static String horMirror(String strng) {
        // your code
        String temp;
        StringBuilder final_string = new StringBuilder();
        String[] data = strng.split("\n");
        for (int i = 0; i < (data.length) / 2; i++) {
            temp = data[i];
            data[i] = data[data.length - 1 - i];
            data[data.length - 1 - i] = temp;
        }
        for (int i = 0; i < data.length; i++) {
            final_string.append(data[i] + ((i < data.length - 1)?"\n":""));
        }
        return final_string.toString();
    }

    public static String oper(Function<String, String> operator, String s) {
        // your code and complete ... before operator
        return operator.apply(s);
    }

    public static void main(String[] args) {
        System.out.println("********** String Mirroring Horizontal and Vertical **********");
        System.out.println("\nFixed Tests Vertical Mirror\n");
        String s = "hSgdHQ\nHnDMao\nClNNxX\niRvxxH\nbqTVvA\nwvSyRu";
        String r = "QHdgSh\noaMDnH\nXxNNlC\nHxxvRi\nAvVTqb\nuRySvw";
        System.out.println("Starting String : \n" + s);
        System.out.println("Final String : \n" + StringArrayMirror.oper(StringArrayMirror::vertMirror, s));
        s = "IzOTWE\nkkbeCM\nWuzZxM\nvDddJw\njiJyHF\nPVHfSx";
        r = "EWTOzI\nMCebkk\nMxZzuW\nwJddDv\nFHyJij\nxSfHVP";
        StringArrayMirror.oper(StringArrayMirror::vertMirror, s);
        System.out.println("Starting String : \n" + s);
        System.out.println("Final String : \n" + StringArrayMirror.oper(StringArrayMirror::vertMirror, s));
        System.out.println("\nFixed Tests Horizontal Mirror\n");
        s = "lVHt\nJVhv\nCSbg\nyeCt";
        r = "yeCt\nCSbg\nJVhv\nlVHt";
        System.out.println("Starting String : \n" + s);
        System.out.println("Final String : \n" + StringArrayMirror.oper(StringArrayMirror::horMirror, s));
        s = "njMK\ndbrZ\nLPKo\ncEYz";
        r = "cEYz\nLPKo\ndbrZ\nnjMK";
        System.out.println("Starting String : \n" + s);
        System.out.println("Final String : \n" + StringArrayMirror.oper(StringArrayMirror::horMirror, s));
    }

}
