
package cn.edu.nju.jw.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>课程信息类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="课程信息类型"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="课程编号" type="{http://jw.nju.edu.cn/schema}课程编号类型"/&gt;
 *         &lt;element name="课程名称" type="{http://jw.nju.edu.cn/schema}课程名称类型"/&gt;
 *         &lt;element name="授课教师编号" type="{http://jw.nju.edu.cn/schema}授课教师编号类型"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u8bfe\u7a0b\u4fe1\u606f\u7c7b\u578b", propOrder = {
    "\u8bfe\u7a0b\u7f16\u53f7",
    "\u8bfe\u7a0b\u540d\u79f0",
    "\u6388\u8bfe\u6559\u5e08\u7f16\u53f7"
})
public class 课程信息类型 {

    @XmlElement(required = true)
    protected String 课程编号;
    @XmlElement(required = true)
    protected String 课程名称;
    @XmlElement(required = true)
    protected String 授课教师编号;

    /**
     * 获取课程编号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get课程编号() {
        return 课程编号;
    }

    /**
     * 设置课程编号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set课程编号(String value) {
        this.课程编号 = value;
    }

    /**
     * 获取课程名称属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get课程名称() {
        return 课程名称;
    }

    /**
     * 设置课程名称属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set课程名称(String value) {
        this.课程名称 = value;
    }

    /**
     * 获取授课教师编号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get授课教师编号() {
        return 授课教师编号;
    }

    /**
     * 设置授课教师编号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set授课教师编号(String value) {
        this.授课教师编号 = value;
    }

}
