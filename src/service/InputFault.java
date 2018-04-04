
package service;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.3
 * 2018-04-04T17:02:39.053+08:00
 * Generated source version: 3.2.3
 */

@WebFault(name = "fault1", targetNamespace = "http://service")
public class InputFault extends Exception {

    private service.fault.InputFault fault1;

    public InputFault() {
        super();
    }

    public InputFault(String message) {
        super(message);
    }

    public InputFault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public InputFault(String message, service.fault.InputFault fault1) {
        super(message);
        this.fault1 = fault1;
    }

    public InputFault(String message, service.fault.InputFault fault1, java.lang.Throwable cause) {
        super(message, cause);
        this.fault1 = fault1;
    }

    public service.fault.InputFault getFaultInfo() {
        return this.fault1;
    }
}
