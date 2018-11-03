package tk.iammohitsharma.designpatterns;

import java.util.Arrays;
import java.util.List;

public class PrototypePattern {
    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypePatternEntity object1, object2, object3;
//        Initial Object with default data
        object1 = new PrototypePatternEntity();
        object1.loadData();
        System.out.println(object1.getDataList());
//        Create a clone and add more elements
        object2 = (PrototypePatternEntity) object1.clone();
        object2.addMore(Arrays.asList(11, 12, 13));
        System.out.println(object2.getDataList());
//        Create a clone and add more elements
        object3 = (PrototypePatternEntity) object1.clone();
        object3.addMore(Arrays.asList(14, 15, 16));
        System.out.println(object3.getDataList());
        /*
        Output :
        [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]
        [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 14, 15, 16]
         */
    }
}
