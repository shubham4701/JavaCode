package tk.iammohitsharma.designpatterns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrototypePatternEntity implements Cloneable {
    private List<Integer> dataList = new ArrayList<>();

    PrototypePatternEntity() {}

    PrototypePatternEntity(List<Integer> data) {
        this.dataList = data;
    }

    public List<Integer> getDataList() {
        return dataList;
    }

    public void loadData() {
        for (int i = 0; i <= 10; i++) {
            dataList.add(i);
        }
    }

    public void addMore(List<Integer> data) {
        dataList.addAll(data);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<Integer> tempData = new ArrayList<>(dataList);
        Collections.copy(tempData, tempData);
        return new PrototypePatternEntity(tempData);
    }
}
