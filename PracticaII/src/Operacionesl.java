/*import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;
import java.util.Arrays;
public class Operacionesl {
    public static void LeerArc() {
        BufferedReader reader = new BufferedReader(new FileReader("sales_data.csv"));
        Stream<String> lines = reader.lines();
        lines.map

    }







    public static void LeerArc() {
        String csvFile = "sales_data.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] datos = line.split(cvsSplitBy);
                System.out.println(datos[0] + ", " + datos[1] + ", " + datos[2] + ", " + datos[3] + ", " + datos[4] + ", " + datos[5] + ", " + datos[6] + ", " + datos[7] + ", " + datos[8] + ", " + datos[9] + ", " + datos[10] + ", " + datos[11] + ", " + datos[12] + ", " + datos[13] + ", " + datos[14] + ", " + datos[15] + ", " + datos[16] + ", " + datos[17] + ", " + datos[18] + ", " + datos[19] + ", " + datos[20] + ", " + datos[21] + ", " + datos[22] + ", " + datos[23] + ", " + datos[24]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }*/
