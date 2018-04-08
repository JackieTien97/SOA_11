package homework.handler;

import group8.model.Score;
import group8.service.InputFault;
import group8.service.SAXException;
import group8.service.StudentInfoManagement;
import group8.service.StudentInfoManagementService;
import homework.resolver.DefaultResolver;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPException;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class StudentModifyHandler implements SOAPHandler<SOAPMessageContext> {
    @Override
    public Set<QName> getHeaders() {
        return null;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        if (!(Boolean) context.get(SOAPMessageContext.MESSAGE_OUTBOUND_PROPERTY)) {
            StudentInfoManagementService serviceImplService = new StudentInfoManagementService();
            serviceImplService.setHandlerResolver(new DefaultResolver());
            StudentInfoManagement service = serviceImplService.getStudentInfoManagement();
            try {
                SOAPBody soapBody = context.getMessage().getSOAPBody();
                Node courseScoreList = soapBody.getFirstChild();
                NodeList courseScores = courseScoreList.getChildNodes();
                for (int i = 0; i < courseScores.getLength(); i++) {
                    Node courseScore = courseScores.item(i);
                    String cid = courseScore.getAttributes().getNamedItem("课程编号").getTextContent();
                    String ctype = courseScore.getAttributes().getNamedItem("成绩性质").getTextContent();
                    NodeList scores = courseScore.getChildNodes();
                    for (int j = 0; j < scores.getLength(); j++) {
                        Node score = scores.item(j);
                        String sid = score.getChildNodes().item(0).getTextContent();
                        String scoreStr = score.getChildNodes().item(1).getTextContent();
                        Score courseScoreType = new Score();
                        courseScoreType.cid = cid;
                        courseScoreType.type = ctype;
                        List<Score> scoreTypes = new ArrayList<>();
                        Score scoreType = new Score();
                        scoreType.score = Integer.parseInt(scoreStr);
                        scoreTypes.add(scoreType);
                        service.modifyStudentInfoOperation(sid, service.retrieveStudentInfoOperation(sid));
                    }
                }
            }  catch (InputFault inputFault) {
                inputFault.printStackTrace();
            } catch (SAXException e) {
                e.printStackTrace();
            } catch (SOAPException e) {
                e.printStackTrace();
            }
        }
        return true;
    }


    @Override
    public boolean handleFault(SOAPMessageContext context) {
        return true;
    }

    @Override
    public void close(MessageContext context) {

    }
}
