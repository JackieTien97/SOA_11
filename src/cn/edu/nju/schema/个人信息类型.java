
package cn.edu.nju.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>������Ϣ���� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="������Ϣ����"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="����" type="{http://www.nju.edu.cn/schema}��������"/&gt;
 *         &lt;element name="�Ա�" type="{http://www.nju.edu.cn/schema}�Ա�����"/&gt;
 *         &lt;element name="���֤����" type="{http://www.nju.edu.cn/schema}���֤��������"/&gt;
 *         &lt;element name="������Ϣ" type="{http://www.nju.edu.cn/schema}������Ϣ����"/&gt;
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
public class ������Ϣ���� {

    @XmlElement(required = true)
    protected �������� ����;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected �Ա����� �Ա�;
    @XmlElement(required = true)
    protected String ���֤����;
    @XmlElement(required = true)
    protected ������Ϣ���� ������Ϣ;

    /**
     * ��ȡ�������Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link �������� }
     *     
     */
    public �������� get����() {
        return ����;
    }

    /**
     * �����������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link �������� }
     *     
     */
    public void set����(�������� value) {
        this.���� = value;
    }

    /**
     * ��ȡ�Ա����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link �Ա����� }
     *     
     */
    public �Ա����� get�Ա�() {
        return �Ա�;
    }

    /**
     * �����Ա����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link �Ա����� }
     *     
     */
    public void set�Ա�(�Ա����� value) {
        this.�Ա� = value;
    }

    /**
     * ��ȡ���֤�������Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get���֤����() {
        return ���֤����;
    }

    /**
     * �������֤�������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set���֤����(String value) {
        this.���֤���� = value;
    }

    /**
     * ��ȡ������Ϣ���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ������Ϣ���� }
     *     
     */
    public ������Ϣ���� get������Ϣ() {
        return ������Ϣ;
    }

    /**
     * ���ò�����Ϣ���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ������Ϣ���� }
     *     
     */
    public void set������Ϣ(������Ϣ���� value) {
        this.������Ϣ = value;
    }

}
