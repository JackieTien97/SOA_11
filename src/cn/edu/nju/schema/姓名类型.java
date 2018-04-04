
package cn.edu.nju.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>姓名类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="姓名类型"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="姓氏" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="名字" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u59d3\u540d\u7c7b\u578b", propOrder = {
    "\u59d3\u6c0f",
    "\u540d\u5b57"
})
public class 姓名类型 {

    @XmlElement(required = true)
    protected String 姓氏;
    @XmlElement(required = true)
    protected String 名字;

    /**
     * 获取姓氏属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get姓氏() {
        return 姓氏;
    }

    /**
     * 设置姓氏属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set姓氏(String value) {
        this.姓氏 = value;
    }

    /**
     * 获取名字属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get名字() {
        return 名字;
    }

    /**
     * 设置名字属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set名字(String value) {
        this.名字 = value;
    }

}
