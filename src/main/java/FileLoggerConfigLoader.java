import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileLoggerConfigLoader {
    public static FileLoggerConfiguration load(String path) throws FileNotFoundException {
        File file = new File(path);
        if (file.exists()) {
            try (InputStream in = new FileInputStream(path);
                 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in))) {

                Map<String, String> params = new HashMap<String, String>();
                String line = bufferedReader.readLine();
                while (line != null) {
                    line = line.replace(" ", "");
                    String[] split = line.split(":");

                    params.put(split[0], split[1]);
                }
                params.get("FILE_NAME");
                new FileLoggerConfiguration();

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            // read file context

        }
    }

}
