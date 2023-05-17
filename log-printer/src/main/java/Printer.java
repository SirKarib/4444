import java.io.*;

public class Printer {
    public static void main(String[] args) throws FileNotFoundException {
        final File file = new File(args[0]);
        if (file == null || !file.isDirectory()) throw new RuntimeException("Directory not found");
        for (File logFile : file.listFiles()) {
            if (!logFile.isFile()) continue;
            final FileInputStream fileInputStream = new FileInputStream(logFile);
            try (BufferedReader br = new BufferedReader(new InputStreamReader(fileInputStream))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
