
package cn.edu.nju.jw.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>�γ���Ϣ���� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="�γ���Ϣ����"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="�γ̱��" type="{http://jw.nju.edu.cn/schema}�γ̱������"/&gt;
 *         &lt;element name="�γ�����" type="{http://jw.nju.edu.cn/schema}�γ���������"/&gt;
 *         &lt;element name="�ڿν�ʦ���" type="{http://jw.nju.edu.cn/schema}�ڿν�ʦ�������"/&gt;
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
public class �γ���Ϣ���� {

    @XmlElement(required = true)
    protected String �γ̱��;
    @XmlElement(required = true)
    protected String �γ�����;
    @XmlElement(required = true)
    protected String �ڿν�ʦ���;

    /**
     * ��ȡ�γ̱�����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get�γ̱��() {
        return �γ̱��;
    }

    /**
     * ���ÿγ̱�����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set�γ̱��(String value) {
        this.�γ̱�� = value;
    }

    /**
     * ��ȡ�γ��������Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get�γ�����() {
        return �γ�����;
    }

    /**
     * ���ÿγ��������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set�γ�����(String value) {
        this.�γ����� = value;
    }

    /**
     * ��ȡ�ڿν�ʦ������Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get�ڿν�ʦ���() {
        return �ڿν�ʦ���;
    }

    /**
     * �����ڿν�ʦ������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set�ڿν�ʦ���(String value) {
        this.�ڿν�ʦ��� = value;
    }

}
