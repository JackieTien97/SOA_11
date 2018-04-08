package homework.resolver;

import homework.handler.AuthHandler;
import homework.handler.LogHandler;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import java.util.ArrayList;
import java.util.List;


public class SimpleResolver implements HandlerResolver{

    @Override
    public List<Handler> getHandlerChain(PortInfo portInfo) {
        List<Handler> handlers = new ArrayList<>();
        handlers.add(new LogHandler());
        handlers.add(new AuthHandler());
        return handlers;
    }
}
