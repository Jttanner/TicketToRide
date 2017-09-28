package modeling;

/**
 * Created by tyler on 9/27/2017.
 * This can either be subclassed as a Login or Register Request. This request is made in the Proxy and send through the Client
 * Communicator to the server and a result object is returned
 */

public class RequestObject {
    public RequestObject() {
    }
    //TODO once we have more request objects, take out the constructor below and move to appropriate subclasses
    public RequestObject(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    private String userName;
    private String password;



    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
