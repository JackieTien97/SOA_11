
package cn.edu.nju.jw.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.edu.nju.jw.schema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _课程信息_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u8bfe\u7a0b\u4fe1\u606f");
    private final static QName _课程列表_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u8bfe\u7a0b\u5217\u8868");
    private final static QName _学生信息_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u5b66\u751f\u4fe1\u606f");
    private final static QName _验证信息_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u9a8c\u8bc1\u4fe1\u606f");
    private final static QName _认证请求_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u8ba4\u8bc1\u8bf7\u6c42");
    private final static QName _InvalidParamFault_QNAME = new QName("http://jw.nju.edu.cn/schema", "InvalidParamFault");
    private final static QName _NotFoundFault_QNAME = new QName("http://jw.nju.edu.cn/schema", "NotFoundFault");
    private final static QName _AuthFault_QNAME = new QName("http://jw.nju.edu.cn/schema", "AuthFault");
    private final static QName _ServerFault_QNAME = new QName("http://jw.nju.edu.cn/schema", "ServerFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.edu.nju.jw.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link 课程信息类型 }
     * 
     */
    public 课程信息类型 create课程信息类型() {
        return new 课程信息类型();
    }

    /**
     * Create an instance of {@link 课程列表类型 }
     * 
     */
    public 课程列表类型 create课程列表类型() {
        return new 课程列表类型();
    }

    /**
     * Create an instance of {@link 学生信息类型 }
     * 
     */
    public 学生信息类型 create学生信息类型() {
        return new 学生信息类型();
    }

    /**
     * Create an instance of {@link 验证类型 }
     * 
     */
    public 验证类型 create验证类型() {
        return new 验证类型();
    }

    /**
     * Create an instance of {@link 账号认证类型 }
     * 
     */
    public 账号认证类型 create账号认证类型() {
        return new 账号认证类型();
    }

    /**
     * Create an instance of {@link ParamFaultType }
     * 
     */
    public ParamFaultType createParamFaultType() {
        return new ParamFaultType();
    }

    /**
     * Create an instance of {@link NotFoundType }
     * 
     */
    public NotFoundType createNotFoundType() {
        return new NotFoundType();
    }

    /**
     * Create an instance of {@link AuthFaultType }
     * 
     */
    public AuthFaultType createAuthFaultType() {
        return new AuthFaultType();
    }

    /**
     * Create an instance of {@link ServerFaultType }
     * 
     */
    public ServerFaultType createServerFaultType() {
        return new ServerFaultType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 课程信息类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u8bfe\u7a0b\u4fe1\u606f")
    public JAXBElement<课程信息类型> create课程信息(课程信息类型 value) {
        return new JAXBElement<课程信息类型>(_课程信息_QNAME, 课程信息类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 课程列表类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u8bfe\u7a0b\u5217\u8868")
    public JAXBElement<课程列表类型> create课程列表(课程列表类型 value) {
        return new JAXBElement<课程列表类型>(_课程列表_QNAME, 课程列表类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 学生信息类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u5b66\u751f\u4fe1\u606f")
    public JAXBElement<学生信息类型> create学生信息(学生信息类型 value) {
        return new JAXBElement<学生信息类型>(_学生信息_QNAME, 学生信息类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 验证类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u9a8c\u8bc1\u4fe1\u606f")
    public JAXBElement<验证类型> create验证信息(验证类型 value) {
        return new JAXBElement<验证类型>(_验证信息_QNAME, 验证类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 账号认证类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u8ba4\u8bc1\u8bf7\u6c42")
    public JAXBElement<账号认证类型> create认证请求(账号认证类型 value) {
        return new JAXBElement<账号认证类型>(_认证请求_QNAME, 账号认证类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "InvalidParamFault")
    public JAXBElement<ParamFaultType> createInvalidParamFault(ParamFaultType value) {
        return new JAXBElement<ParamFaultType>(_InvalidParamFault_QNAME, ParamFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotFoundType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "NotFoundFault")
    public JAXBElement<NotFoundType> createNotFoundFault(NotFoundType value) {
        return new JAXBElement<NotFoundType>(_NotFoundFault_QNAME, NotFoundType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "AuthFault")
    public JAXBElement<AuthFaultType> createAuthFault(AuthFaultType value) {
        return new JAXBElement<AuthFaultType>(_AuthFault_QNAME, AuthFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServerFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "ServerFault")
    public JAXBElement<ServerFaultType> createServerFault(ServerFaultType value) {
        return new JAXBElement<ServerFaultType>(_ServerFault_QNAME, ServerFaultType.class, null, value);
    }

}
