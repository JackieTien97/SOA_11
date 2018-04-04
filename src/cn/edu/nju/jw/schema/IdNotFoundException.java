
package cn.edu.nju.jw.schema;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.3
 * 2018-04-04T16:53:06.982+08:00
 * Generated source version: 3.2.3
 */

@WebFault(name = "NotFoundFault", targetNamespace = "http://jw.nju.edu.cn/schema")
public class IdNotFoundException extends Exception {

    private cn.edu.nju.jw.schema.NotFoundType notFoundFault;

    public IdNotFoundException() {
        super();
    }

    public IdNotFoundException(String message) {
        super(message);
    }

    public IdNotFoundException(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public IdNotFoundException(String message, cn.edu.nju.jw.schema.NotFoundType notFoundFault) {
        super(message);
        this.notFoundFault = notFoundFault;
    }

    public IdNotFoundException(String message, cn.edu.nju.jw.schema.NotFoundType notFoundFault, java.lang.Throwable cause) {
        super(message, cause);
        this.notFoundFault = notFoundFault;
    }

    public cn.edu.nju.jw.schema.NotFoundType getFaultInfo() {
        return this.notFoundFault;
    }
}