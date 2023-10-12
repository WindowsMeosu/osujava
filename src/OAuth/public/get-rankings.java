// converted to java, exists so i have something to work off.
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public class getrankings {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://osu.ppy.sh/api/v2/rankings/mania/performance");
            Map<String, String> params = new HashMap<>();
            params.put("country", "0");
            params.put("filter", "all");
            params.put("variant", "4k");

            StringBuilder urlParams = new StringBuilder();
            for (Map.Entry<String, String> entry : params.entrySet()) {
                if (urlParams.length() != 0) {
                    urlParams.append("&");
                }
                urlParams.append(entry.getKey()).append("=").append(entry.getValue());
            }

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            System.out.println(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
