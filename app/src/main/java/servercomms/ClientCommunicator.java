package servercomms;

/**
 * Created by tyler on 9/26/2017.
 */
public class ClientCommunicator {
    private static ClientCommunicator ourInstance = new ClientCommunicator();

    public static ClientCommunicator getInstance() {
        return ourInstance;
    }

    private ClientCommunicator() {
    }
}
