package eu.fusepool.p3.gui.literalextraction.server;

import org.wymiwyg.commons.util.arguments.ArgumentsWithHelp;
import org.wymiwyg.commons.util.arguments.CommandLine;

public interface Arguments extends ArgumentsWithHelp {
    
    @CommandLine(longName = "port", shortName = {"P"}, required = false,
            defaultValue = "8207",
            description = "The port on which the bing translate transformer factory shall listen")
    public int getPort();
    
}
