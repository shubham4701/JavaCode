package tk.iammohitsharma.designpatterns;

import tk.iammohitsharma.designpatterns.factorypattern.BaseParser;
import tk.iammohitsharma.designpatterns.factorypattern.FactoryPatternHelper;
import tk.iammohitsharma.designpatterns.factorypattern.UserInfo;

import java.io.File;
import java.util.List;

public class FactoryPattern {
    public static void main(String[] args) {
        BaseParser parser = FactoryPatternHelper.getInstance("users.csv");
        List<UserInfo> data = parser.read("users.csv");
        parser.write("", data);
    }
}
