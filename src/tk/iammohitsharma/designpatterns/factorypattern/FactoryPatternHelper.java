package tk.iammohitsharma.designpatterns.factorypattern;

public class FactoryPatternHelper {
    public static BaseParser getInstance(String file) {
        if(file.endsWith(".csv"))
            return new CSVParser();
        return null;
    }
}
