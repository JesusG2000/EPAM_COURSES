package by.etc.controller;

public final class Controller {
    private final CommandProvider commandProvider = new CommandProvider();

    public String executeTask(String request,String data){
        Command executionCommand;
        String response;

        executionCommand=commandProvider.getCommand(request);
        response=executionCommand.execute(data);

        return response;
    }
}
