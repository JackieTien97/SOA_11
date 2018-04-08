
package group8.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import group8.service.fault.InputFault;
import group8.service.model.StudentInfo;
import group8.sax.SAXException;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the group8.group8.group8.service package.
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

    private final static QName _StudentToken_QNAME = new QName("http://group8.group8.service.example", "studentToken");
    private final static QName _StudentInfo_QNAME = new QName("http://group8.group8.service.example", "studentInfo");
    private final static QName _ModifyStudentInfoOperationReturn_QNAME = new QName("http://group8.group8.service.example", "modifyStudentInfoOperationReturn");
    private final static QName _Fault_QNAME = new QName("http://group8.group8.service.example", "fault");
    private final static QName _Fault1_QNAME = new QName("http://group8.group8.service.example", "fault1");
    private final static QName _StudentToken1_QNAME = new QName("http://group8.group8.service.example", "studentToken1");
    private final static QName _RetrieveStudentInfoOperationReturn_QNAME = new QName("http://group8.group8.service.example", "retrieveStudentInfoOperationReturn");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: group8.group8.group8.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://group8.group8.service.example", name = "studentToken")
    public JAXBElement<String> createStudentToken(String value) {
        return new JAXBElement<String>(_StudentToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://group8.group8.service.example", name = "studentInfo")
    public JAXBElement<StudentInfo> createStudentInfo(StudentInfo value) {
        return new JAXBElement<StudentInfo>(_StudentInfo_QNAME, StudentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://group8.group8.service.example", name = "modifyStudentInfoOperationReturn")
    public JAXBElement<String> createModifyStudentInfoOperationReturn(String value) {
        return new JAXBElement<String>(_ModifyStudentInfoOperationReturn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SAXException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://group8.group8.service.example", name = "fault")
    public JAXBElement<SAXException> createFault(SAXException value) {
        return new JAXBElement<SAXException>(_Fault_QNAME, SAXException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://group8.group8.service.example", name = "fault1")
    public JAXBElement<InputFault> createFault1(InputFault value) {
        return new JAXBElement<InputFault>(_Fault1_QNAME, InputFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://group8.group8.service.example", name = "studentToken1")
    public JAXBElement<String> createStudentToken1(String value) {
        return new JAXBElement<String>(_StudentToken1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://group8.group8.service.example", name = "retrieveStudentInfoOperationReturn")
    public JAXBElement<StudentInfo> createRetrieveStudentInfoOperationReturn(StudentInfo value) {
        return new JAXBElement<StudentInfo>(_RetrieveStudentInfoOperationReturn_QNAME, StudentInfo.class, null, value);
    }

}
