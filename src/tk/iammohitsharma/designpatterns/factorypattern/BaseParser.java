package tk.iammohitsharma.designpatterns.factorypattern;

import java.util.List;

public interface BaseParser {
    List<UserInfo> read(String file);
    void write(String folder, List<UserInfo> data);
}
