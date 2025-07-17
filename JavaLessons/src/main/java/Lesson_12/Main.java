package Lesson_12;
import Lesson_12.CSVWriter;
import Lesson_12.CSVReader;
import Lesson_12.AppData;

public class Main {
    public static void main(String[] args) {
        String[] headers = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {
                {100, 200, 123},
                {300, 400, 500}
        };

        AppData appData = new AppData(headers, data);
        String filePath = "data.csv";

        CSVWriter writer = new CSVWriter();
        writer.save(appData, filePath);

        CSVReader reader = new CSVReader();
        AppData loadedData = reader.load(filePath);

        for (String h : loadedData.getHeader()) {
            System.out.print(h + " ");
        }
        System.out.println();

        for (int[] row : loadedData.getData()) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}