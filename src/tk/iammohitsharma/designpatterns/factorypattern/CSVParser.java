package tk.iammohitsharma.designpatterns.factorypattern;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVParser implements BaseParser {
    @Override
    public List<UserInfo> read(String file) {
        StringBuilder builder = new StringBuilder();
        String line = null;
        List<UserInfo> data = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while ((line = reader.readLine()) != null) {
                builder.append(line.trim());
            }
            String[] records = builder.toString().split("\n");
            for (String record : records) {
                if(record.trim() != "") {
                    String[] user = record.split(",");
                    data.add(new UserInfo(user[0], user[1], user[2]));
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found while reading! Please try again with valid file, " + e.getLocalizedMessage());
        } catch (IOException e) {
            System.err.println("Unknown error, " + e.getLocalizedMessage());
        }
        return data;
    }

    @Override
    public void write(String folder, List<UserInfo> data) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(folder + "records.txt"))) {
            for (UserInfo user : data) {
                writer.write(data.toString());
            }
        }  catch (FileNotFoundException e) {
            System.err.println("File not found while writing! Please try again with valid file, " + e.getLocalizedMessage());
        } catch (IOException e) {
            System.err.println("Unknown error, " + e.getLocalizedMessage());
        }
    }
}
