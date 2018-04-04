
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.xml.sax.SAXException;
import service.fault.InputFault;
import service.model.RequestResult;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
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

    private final static QName _SidList_QNAME = new QName("http://service", "sidList");
    private final static QName _QueryScoreOperationReturn_QNAME = new QName("http://service", "queryScoreOperationReturn");
    private final static QName _Fault_QNAME = new QName("http://service", "fault");
    private final static QName _Fault1_QNAME = new QName("http://service", "fault1");
    private final static QName _DeleteScoreList_QNAME = new QName("http://service", "deleteScoreList");
    private final static QName _DeleteScoreOperationReturn_QNAME = new QName("http://service", "deleteScoreOperationReturn");
    private final static QName _ModifyScoreList_QNAME = new QName("http://service", "modifyScoreList");
    private final static QName _ModifyScoreOperationReturn_QNAME = new QName("http://service", "modifyScoreOperationReturn");
    private final static QName _AddScoreList_QNAME = new QName("http://service", "addScoreList");
    private final static QName _AddScoreOperationReturn_QNAME = new QName("http://service", "addScoreOperationReturn");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfXsdAnyType }
     * 
     */
    public ArrayOfXsdAnyType createArrayOfXsdAnyType() {
        return new ArrayOfXsdAnyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfXsdAnyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service", name = "sidList")
    public JAXBElement<ArrayOfXsdAnyType> createSidList(ArrayOfXsdAnyType value) {
        return new JAXBElement<ArrayOfXsdAnyType>(_SidList_QNAME, ArrayOfXsdAnyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfXsdAnyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service", name = "queryScoreOperationReturn")
    public JAXBElement<ArrayOfXsdAnyType> createQueryScoreOperationReturn(ArrayOfXsdAnyType value) {
        return new JAXBElement<ArrayOfXsdAnyType>(_QueryScoreOperationReturn_QNAME, ArrayOfXsdAnyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SAXException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service", name = "fault")
    public JAXBElement<SAXException> createFault(SAXException value) {
        return new JAXBElement<SAXException>(_Fault_QNAME, SAXException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service", name = "fault1")
    public JAXBElement<InputFault> createFault1(InputFault value) {
        return new JAXBElement<InputFault>(_Fault1_QNAME, InputFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfXsdAnyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service", name = "deleteScoreList")
    public JAXBElement<ArrayOfXsdAnyType> createDeleteScoreList(ArrayOfXsdAnyType value) {
        return new JAXBElement<ArrayOfXsdAnyType>(_DeleteScoreList_QNAME, ArrayOfXsdAnyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service", name = "deleteScoreOperationReturn")
    public JAXBElement<RequestResult> createDeleteScoreOperationReturn(RequestResult value) {
        return new JAXBElement<RequestResult>(_DeleteScoreOperationReturn_QNAME, RequestResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfXsdAnyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service", name = "modifyScoreList")
    public JAXBElement<ArrayOfXsdAnyType> createModifyScoreList(ArrayOfXsdAnyType value) {
        return new JAXBElement<ArrayOfXsdAnyType>(_ModifyScoreList_QNAME, ArrayOfXsdAnyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service", name = "modifyScoreOperationReturn")
    public JAXBElement<RequestResult> createModifyScoreOperationReturn(RequestResult value) {
        return new JAXBElement<RequestResult>(_ModifyScoreOperationReturn_QNAME, RequestResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfXsdAnyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service", name = "addScoreList")
    public JAXBElement<ArrayOfXsdAnyType> createAddScoreList(ArrayOfXsdAnyType value) {
        return new JAXBElement<ArrayOfXsdAnyType>(_AddScoreList_QNAME, ArrayOfXsdAnyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service", name = "addScoreOperationReturn")
    public JAXBElement<RequestResult> createAddScoreOperationReturn(RequestResult value) {
        return new JAXBElement<RequestResult>(_AddScoreOperationReturn_QNAME, RequestResult.class, null, value);
    }

}
