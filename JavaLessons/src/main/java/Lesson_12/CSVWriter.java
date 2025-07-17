package Lesson_12;

import java.io.FileWriter;
import java.io.IOException;

    public class CSVWriter {

        public void save(AppData appData, String filePath) {
            try (FileWriter writer = new FileWriter(filePath)) {

                String[] header = appData.getHeader();
                writer.write(String.join(";", header) + "\n");


                for (int[] row : appData.getData()) {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < row.length; i++) {
                        sb.append(row[i]);
                        if (i < row.length - 1) sb.append(";");
                    }
                    writer.write(sb.toString() + "\n");
                }

            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }
        }
    }

