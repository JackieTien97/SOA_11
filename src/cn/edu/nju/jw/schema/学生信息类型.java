
package cn.edu.nju.jw.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import cn.edu.nju.schema.������Ϣ����;


/**
 * <p>ѧ����Ϣ���� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ѧ����Ϣ����"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ѧ��" type="{http://jw.nju.edu.cn/schema}ѧ������"/&gt;
 *         &lt;element name="������Ϣ" type="{http://www.nju.edu.cn/schema}������Ϣ����"/&gt;
 *         &lt;element name="�γ��б�" type="{http://jw.nju.edu.cn/schema}�γ��б�����"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u5b66\u751f\u4fe1\u606f\u7c7b\u578b", propOrder = {
    "\u5b66\u53f7",
    "\u4e2a\u4eba\u4fe1\u606f",
    "\u8bfe\u7a0b\u5217\u8868"
})
public class ѧ����Ϣ���� {

    @XmlElement(required = true)
    protected String ѧ��;
    @XmlElement(required = true)
    protected ������Ϣ���� ������Ϣ;
    @XmlElement(required = true)
    protected �γ��б����� �γ��б�;

    /**
     * ��ȡѧ�����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getѧ��() {
        return ѧ��;
    }

    /**
     * ����ѧ�����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setѧ��(String value) {
        this.ѧ�� = value;
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
     * ���ø�����Ϣ���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ������Ϣ���� }
     *     
     */
    public void set������Ϣ(������Ϣ���� value) {
        this.������Ϣ = value;
    }

    /**
     * ��ȡ�γ��б����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link �γ��б����� }
     *     
     */
    public �γ��б����� get�γ��б�() {
        return �γ��б�;
    }

    /**
     * ���ÿγ��б����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link �γ��б����� }
     *     
     */
    public void set�γ��б�(�γ��б����� value) {
        this.�γ��б� = value;
    }

}
