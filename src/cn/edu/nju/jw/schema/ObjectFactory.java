
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

    private final static QName _�γ���Ϣ_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u8bfe\u7a0b\u4fe1\u606f");
    private final static QName _�γ��б�_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u8bfe\u7a0b\u5217\u8868");
    private final static QName _ѧ����Ϣ_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u5b66\u751f\u4fe1\u606f");
    private final static QName _��֤��Ϣ_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u9a8c\u8bc1\u4fe1\u606f");
    private final static QName _��֤����_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u8ba4\u8bc1\u8bf7\u6c42");
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
     * Create an instance of {@link �γ���Ϣ���� }
     * 
     */
    public �γ���Ϣ���� create�γ���Ϣ����() {
        return new �γ���Ϣ����();
    }

    /**
     * Create an instance of {@link �γ��б����� }
     * 
     */
    public �γ��б����� create�γ��б�����() {
        return new �γ��б�����();
    }

    /**
     * Create an instance of {@link ѧ����Ϣ���� }
     * 
     */
    public ѧ����Ϣ���� createѧ����Ϣ����() {
        return new ѧ����Ϣ����();
    }

    /**
     * Create an instance of {@link ��֤���� }
     * 
     */
    public ��֤���� create��֤����() {
        return new ��֤����();
    }

    /**
     * Create an instance of {@link �˺���֤���� }
     * 
     */
    public �˺���֤���� create�˺���֤����() {
        return new �˺���֤����();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link �γ���Ϣ���� }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u8bfe\u7a0b\u4fe1\u606f")
    public JAXBElement<�γ���Ϣ����> create�γ���Ϣ(�γ���Ϣ���� value) {
        return new JAXBElement<�γ���Ϣ����>(_�γ���Ϣ_QNAME, �γ���Ϣ����.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link �γ��б����� }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u8bfe\u7a0b\u5217\u8868")
    public JAXBElement<�γ��б�����> create�γ��б�(�γ��б����� value) {
        return new JAXBElement<�γ��б�����>(_�γ��б�_QNAME, �γ��б�����.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ѧ����Ϣ���� }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u5b66\u751f\u4fe1\u606f")
    public JAXBElement<ѧ����Ϣ����> createѧ����Ϣ(ѧ����Ϣ���� value) {
        return new JAXBElement<ѧ����Ϣ����>(_ѧ����Ϣ_QNAME, ѧ����Ϣ����.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ��֤���� }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u9a8c\u8bc1\u4fe1\u606f")
    public JAXBElement<��֤����> create��֤��Ϣ(��֤���� value) {
        return new JAXBElement<��֤����>(_��֤��Ϣ_QNAME, ��֤����.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link �˺���֤���� }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u8ba4\u8bc1\u8bf7\u6c42")
    public JAXBElement<�˺���֤����> create��֤����(�˺���֤���� value) {
        return new JAXBElement<�˺���֤����>(_��֤����_QNAME, �˺���֤����.class, null, value);
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
