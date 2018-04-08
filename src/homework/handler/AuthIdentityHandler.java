package homework.handler;

import cn.edu.nju.jw.schema.*;
import homework.resolver.DefaultResolver;
import org.w3c.dom.NodeList;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;


public class AuthIdentityHandler implements SOAPHandler<SOAPMessageContext> {
    @Override
    public Set<QName> getHeaders() {
        return null;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        if ((Boolean) context.get(SOAPMessageContext.MESSAGE_OUTBOUND_PROPERTY)) {
            SOAPMessage soapMessage = context.getMessage();
            try {
                SOAPHeader soapHeader = soapMessage.getSOAPHeader();
                if (soapHeader!=null) {
                    NodeList nodeList = soapHeader.getChildNodes();
                    String email = nodeList.item(0).getTextContent();
                    String password = nodeList.item(1).getTextContent();
                    MyAuthService myService = new MyAuthService();
                    myService.setHandlerResolver(new DefaultResolver());
                    MyAuth myAuth = myService.getAuthPort();
                    账号认证类型 login = new 账号认证类型();
                    login.set邮箱(email);
                    login.set密码(password);
                    try {
                        验证类型 response = myAuth.verify(login);
                        if (!(response.get权限() == 权限级别.老师)) {
                            writeMsg("无权限操作.");
                            return false;
                        }
                    } catch (IdNotFoundException e) {
                        writeMsg(e.getFaultInfo().getNotFoundId());
                        return false;
                    } catch (PswErrorException e) {
                        e.printStackTrace();
                    }
                }
            } catch (SOAPException e) {
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }

    private void writeMsg(String msg) {
        try {
            File file = new File("msg.log");
            if (!file.exists()) {
                boolean result = file.createNewFile();
                if (!result)
                    throw new IOException("Cannot create file.");
            }
            FileOutputStream outputStream = new FileOutputStream(file,true);
            outputStream.write("====================Handler Info=====================\n".getBytes());
            outputStream.write(msg.getBytes());
            outputStream.write('\n');
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        return true;
    }

    @Override
    public void close(MessageContext context) {

    }
}
