package nanodegree.damian.jokerlib;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.io.IOException;


public class JokesGenerator {

    private static final String JOKE_KEY = "value";
    private static final String INSPIRATION_URL =
            "https://api.chucknorris.io/jokes/random";

    public static final String FALLBACK_VALUE = "Something went wrong";

    public static String generate() {
        try {
            HttpGet httpget = new HttpGet(INSPIRATION_URL);
            HttpClient client = HttpClientBuilder.create().build();
            String response = EntityUtils.toString(client.execute(httpget).getEntity());

            return new JSONObject(response).getString(JOKE_KEY);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return FALLBACK_VALUE;
    }

}
