package servercomms;

import com.encoder.Encoder;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import modeling.ResultObject;


/**
 * Created by tyler on 9/12/2017.
 * This class communicates with the server. It is called by the server proxy, given URLs and request objects and send those
 * off through http and returns the results.
 */
public class ClientCommunicator {
    private static ClientCommunicator ourInstance = new ClientCommunicator();

    public static ClientCommunicator getInstance() {
        return ourInstance;
    }

    private ClientCommunicator() {
    }

    public ResultObject send(URL url, Object request) {
        try {

            HttpURLConnection http = (HttpURLConnection) url.openConnection();

            http.setRequestMethod("POST");
            http.setDoOutput(true);    // There is a request body

            http.addRequestProperty("Accept", "application/json");

            Encoder encoder = new Encoder();
            encoder.encode(request, http.getOutputStream());

            http.connect();

            if (http.getResponseCode() == HttpURLConnection.HTTP_OK) {

                //return encoder.decodeResultObject(http.getInputStream());

            } else {
                System.out.println("ERROR: " + http.getResponseMessage());
                //return encoder.decodeResultObject(http.getErrorStream());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
