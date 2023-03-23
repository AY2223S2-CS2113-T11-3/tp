package seedu.pettracker.commands;

import seedu.pettracker.ui.Ui;
import seedu.pettracker.data.TaskList;

public class MarkTaskCommand extends Command{
    protected int taskNumber;

    public MarkTaskCommand(String commandArgs) {
        super();
        this.taskNumber = Integer.parseInt(commandArgs);
    }

    /**
     * Executes the given command
     *
     * @param ui Ui to do printing if required
     */
    @Override
    public void execute(Ui ui) {
        TaskList.markTask(taskNumber, true);
        ui.markTaskCommandMessage();
    }

    /**
     * Parses the arguments of the command
     *
     * @param commandArgs String containing the arguments of the command
     * @return String array containing the arguments of the command
     */
    @Override
    public String[] parseArgs(String commandArgs) {
        return new String[0];
    }

    /**
     * Sets isExit to be true to exit the program
     *
     * @return isExit boolean value for program to exit
     */
    @Override
    public boolean isExit() {
        return false;
    }
}