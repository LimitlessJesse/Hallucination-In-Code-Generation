import javax.activation.CommandInfo;
import javax.activation.MailcapCommandMap;
import javax.activation.CommandMap;

public class CommandInfo_2 {
    public static void main(String[] args) {
        CommandMap commandMap = (CommandMap)MailcapCommandMap.getDefaultCommandMap();
        CommandInfo[] commands = commandMap.getCommands();

        for (CommandInfo command : commands) {
            System.out.println(command.getCommandName());
        }
    }
}
