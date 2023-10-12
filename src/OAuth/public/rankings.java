/*
import WIP
import WIP
import WIP
import WIP
*/
import javax.net.ssl.HttpsURLConnection;
import java.io.UnsupportedEncodingException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class Rankings {

  public Ranking() {
  }

  public Rankings getRanking(
    Mode gamemode,
    Type type,
    Options options
  ) {
    mode = GameModeSchema.parse(mode);
    type = RankingTypeSchema.parse(type);
    options = GetRankingOptionsSchema.optional().parse(options);
    System.out.println("rankings/" + mode + "/" + type, connection.setRequestMethod("GET"), options)
  }
 /* spotlight wrap wip
*/
} 