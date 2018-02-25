package controller;

public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("No command excute");
    }

    @Override
    public void undo() {

    }
}
