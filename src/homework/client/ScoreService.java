package homework.client;

import com.sun.xml.internal.ws.api.message.Headers;
import com.sun.xml.internal.ws.developer.WSBindingProvider;
import group8.service.*;
import homework.resolver.ComplexResolver;

import javax.xml.namespace.QName;
import javax.xml.ws.Holder;


public class ScoreService {

    private static final String AUTH_NS = "http://nju.edu.cn/service/";

    public void addScore(ArrayOfXsdAnyType listType, String email, String password) {
        ScoreManagementService service = new ScoreManagementService();
        service.setHandlerResolver(new ComplexResolver());
        ScoreManagement scoreManage = service.getScoreManagement();
        WSBindingProvider bp = (WSBindingProvider)scoreManage;
        bp.setOutboundHeaders(Headers.create(new QName(AUTH_NS,"email"),email),
                Headers.create(new QName(AUTH_NS,"password"),password));
        Holder<ArrayOfXsdAnyType> param = new Holder<>(listType);
        try {
            scoreManage.addScoreOperation(listType);
        } catch (InputFault inputFault) {
            inputFault.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }

    public void deleteScore(ArrayOfXsdAnyType listType, String email, String password) {
        ScoreManagementService service = new ScoreManagementService();
        service.setHandlerResolver(new ComplexResolver());
        ScoreManagement scoreManage = service.getScoreManagement();
        WSBindingProvider bp = (WSBindingProvider)scoreManage;
        bp.setOutboundHeaders(Headers.create(new QName(AUTH_NS,"email"),email),
                Headers.create(new QName(AUTH_NS,"password"),password));
        try {
            scoreManage.deleteScoreOperation(listType);
        } catch (InputFault inputFault) {
            inputFault.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }

    public void queryScore(String sid, String email, String password) {
        ScoreManagementService service = new ScoreManagementService();
        service.setHandlerResolver(new ComplexResolver());
        ScoreManagement scoreManage = service.getScoreManagement();
        WSBindingProvider bp = (WSBindingProvider)scoreManage;
        bp.setOutboundHeaders(Headers.create(new QName(AUTH_NS,"email"),email),
                Headers.create(new QName(AUTH_NS,"password"),password));
        try {
            scoreManage.queryScoreOperation(sid);
        } catch (InputFault inputFault) {
            inputFault.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }

    public void modifyScore(ArrayOfXsdAnyType courseScore, String email, String password) {
        ScoreManagementService service = new ScoreManagementService();
        service.setHandlerResolver(new ComplexResolver());
        ScoreManagement scoreManage = service.getScoreManagement();
        WSBindingProvider bp = (WSBindingProvider)scoreManage;
        bp.setOutboundHeaders(Headers.create(new QName(AUTH_NS,"email"),email),
                Headers.create(new QName(AUTH_NS,"password"),password));
        try {
            scoreManage.modifyScoreOperation(courseScore);
        } catch (InputFault inputFault) {
            inputFault.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }

}
