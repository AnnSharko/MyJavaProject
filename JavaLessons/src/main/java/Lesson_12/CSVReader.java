package Lesson_12;
import Lesson_12.AppData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {

    public AppData load(String filePath) {
        String[] header = null;
        ArrayList<int[]> dataList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isFirstLine = true;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (isFirstLine) {
                    header = parts;
                    isFirstLine = false;
                } else {
                    int[] row = new int[parts.length];
                    for (int i = 0; i < parts.length; i++) {
                        row[i] = Integer.parseInt(parts[i]);
                    }
                    dataList.add(row);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        int[][] data = dataList.toArray(new int[0][]);
        return new AppData(header, data);
    }
}
