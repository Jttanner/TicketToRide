package command;

import commandData.CreateGameCommandData;
import result.Result;

/**
 * Created by Hwang on 9/29/2017.
 */

public class CreateGameCommand extends CreateGameCommandData implements ICommand{

    public CreateGameCommand(){
        super();
    }

    @Override
    public Result execute() {
        try {
            CreateGameCommandData createGameCommandData = new CreateGameCommandData();
            //String str = createGameCommandData.getStr();
            //int number = StringProcessor.instance().parseInteger(str);
            //String data = String.valueOf(number);
            Result result = new Result(true, data, null);
            return result;
        }
        catch (NumberFormatException e) {
            Result result = new Result(false, null, "Error, not a number!");
            return result;
        }
    }
}
