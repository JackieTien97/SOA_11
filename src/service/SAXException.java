
package service;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.3
 * 2018-04-04T17:02:38.957+08:00
 * Generated source version: 3.2.3
 */

@WebFault(name = "fault", targetNamespace = "http://service")
public class SAXException extends Exception {

    private org.xml.sax.SAXException fault;

    public SAXException() {
        super();
    }

    public SAXException(String message) {
        super(message);
    }

    public SAXException(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public SAXException(String message, org.xml.sax.SAXException fault) {
        super(message);
        this.fault = fault;
    }

    public SAXException(String message, org.xml.sax.SAXException fault, java.lang.Throwable cause) {
        super(message, cause);
        this.fault = fault;
    }

    public org.xml.sax.SAXException getFaultInfo() {
        return this.fault;
    }
}