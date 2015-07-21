
package com.vn.fsoft.bidding.ejb.ws.endpoints;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="account" type="{http://endpoints.ws.ejb.bidding.fsoft.vn.com/}account" minOccurs="0"/>
 *         &lt;element name="bidAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bidId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="item" type="{http://endpoints.ws.ejb.bidding.fsoft.vn.com/}item" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bid", propOrder = {
    "account",
    "bidAmount",
    "bidId",
    "item"
})
public class Bid {

    protected Account account;
    protected BigDecimal bidAmount;
    protected long bidId;
    protected Item item;

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setAccount(Account value) {
        this.account = value;
    }

    /**
     * Gets the value of the bidAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBidAmount() {
        return bidAmount;
    }

    /**
     * Sets the value of the bidAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBidAmount(BigDecimal value) {
        this.bidAmount = value;
    }

    /**
     * Gets the value of the bidId property.
     * 
     */
    public long getBidId() {
        return bidId;
    }

    /**
     * Sets the value of the bidId property.
     * 
     */
    public void setBidId(long value) {
        this.bidId = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link Item }
     *     
     */
    public Item getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link Item }
     *     
     */
    public void setItem(Item value) {
        this.item = value;
    }

}
