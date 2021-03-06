package handler;

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.sql.SQLException;

import command.CreateGameCommand;
import command.GetGameListCommand;
import command.JoinGameCommand;
import commandData.Command;
import result.Result;

/**
 * Created by Hwang on 9/28/2017.
 */

public class CommandHandler extends BaseHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {

        boolean success = false;

        try {
            InputStream reqBody = exchange.getRequestBody();
            String reqData = readString(reqBody);

            Gson gson = new Gson();
            Command cmd = gson.fromJson(reqData, Command.class);

            switch (cmd.getType()) {
                case "createGame":
                    CreateGameCommand word = gson.fromJson(reqData, CreateGameCommand.class);
                    Result result = word.execute();
                    String jsonStr = gson.toJson(word);
                    exchange.sendResponseHeaders(HttpURLConnection.HTTP_OK, 0);
                    OutputStream respBody = exchange.getResponseBody();
                    writeString(jsonStr, respBody);
                    respBody.close();
                    break;
                case "joinGame":
                    JoinGameCommand word = gson.fromJson(reqData, JoinGameCommand.class);
                    Result result = word.execute();
                    String jsonStr = gson.toJson(word);
                    exchange.sendResponseHeaders(HttpURLConnection.HTTP_OK, 0);
                    OutputStream respBody = exchange.getResponseBody();
                    writeString(jsonStr, respBody);
                    respBody.close();
                    break;
                case "getGameList":
                    GetGameListCommand word = gson.fromJson(reqData, GetGameListCommand.class);
                    Result result = word.execute();
                    String jsonStr = gson.toJson(word);
                    exchange.sendResponseHeaders(HttpURLConnection.HTTP_OK, 0);
                    OutputStream respBody = exchange.getResponseBody();
                    writeString(jsonStr, respBody);
                    respBody.close();
                    break;
                default:
                    break;
            }
        }
        catch (IOException e) {
            exchange.sendResponseHeaders(HttpURLConnection.HTTP_SERVER_ERROR, 0);
            exchange.getResponseBody().close();
            e.printStackTrace();
        }
    }
}
