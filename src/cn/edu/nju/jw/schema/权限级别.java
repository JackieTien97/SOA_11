
package cn.edu.nju.jw.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Ȩ�޼���� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="Ȩ�޼���"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="��ʦ"/&gt;
 *     &lt;enumeration value="�о���"/&gt;
 *     &lt;enumeration value="������"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "\u6743\u9650\u7ea7\u522b")
@XmlEnum
public enum Ȩ�޼��� {

    ��ʦ,
    �о���,
    ������;

    public String value() {
        return name();
    }

    public static Ȩ�޼��� fromValue(String v) {
        return valueOf(v);
    }

}
