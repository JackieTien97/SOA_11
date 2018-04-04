
package cn.edu.nju.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>个人信息类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="个人信息类型"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="姓名" type="{http://www.nju.edu.cn/schema}姓名类型"/&gt;
 *         &lt;element name="性别" type="{http://www.nju.edu.cn/schema}性别类型"/&gt;
 *         &lt;element name="身份证号码" type="{http://www.nju.edu.cn/schema}身份证号码类型"/&gt;
 *         &lt;element name="部门信息" type="{http://www.nju.edu.cn/schema}部门信息类型"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u4e2a\u4eba\u4fe1\u606f\u7c7b\u578b", propOrder = {
    "\u59d3\u540d",
    "\u6027\u522b",
    "\u8eab\u4efd\u8bc1\u53f7\u7801",
    "\u90e8\u95e8\u4fe1\u606f"
})
public class 个人信息类型 {

    @XmlElement(required = true)
    protected 姓名类型 姓名;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected 性别类型 性别;
    @XmlElement(required = true)
    protected String 身份证号码;
    @XmlElement(required = true)
    protected 部门信息类型 部门信息;

    /**
     * 获取姓名属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 姓名类型 }
     *     
     */
    public 姓名类型 get姓名() {
        return 姓名;
    }

    /**
     * 设置姓名属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 姓名类型 }
     *     
     */
    public void set姓名(姓名类型 value) {
        this.姓名 = value;
    }

    /**
     * 获取性别属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 性别类型 }
     *     
     */
    public 性别类型 get性别() {
        return 性别;
    }

    /**
     * 设置性别属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 性别类型 }
     *     
     */
    public void set性别(性别类型 value) {
        this.性别 = value;
    }

    /**
     * 获取身份证号码属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get身份证号码() {
        return 身份证号码;
    }

    /**
     * 设置身份证号码属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set身份证号码(String value) {
        this.身份证号码 = value;
    }

    /**
     * 获取部门信息属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 部门信息类型 }
     *     
     */
    public 部门信息类型 get部门信息() {
        return 部门信息;
    }

    /**
     * 设置部门信息属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 部门信息类型 }
     *     
     */
    public void set部门信息(部门信息类型 value) {
        this.部门信息 = value;
    }

}
