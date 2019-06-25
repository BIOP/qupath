package qupathj;

import org.scijava.command.Command;
import org.scijava.plugin.Parameter;
import org.scijava.plugin.Plugin;

@Plugin(type = Command.class, menuPath = "Plugins>Send Overlay To QuPath")
public class QUPath_Send_Overlay_to_QuPath_Command implements Command {

    @Parameter
    String greeting;

    @Override
    public void run() {
        System.out.println(greeting);
    }
}
