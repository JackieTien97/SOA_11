package homework.resolver;

import homework.handler.AuthIdentityHandler;
import homework.handler.LogHandler;
import homework.handler.StudentModifyHandler;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import java.util.ArrayList;
import java.util.List;


public class ComplexResolver implements HandlerResolver{
    @Override
    public List<Handler> getHandlerChain(PortInfo portInfo) {
        List<Handler> handlers = new ArrayList<>();
        handlers.add(new LogHandler());
        handlers.add(new AuthIdentityHandler());
        handlers.add(new StudentModifyHandler());
        return handlers;
    }
}
