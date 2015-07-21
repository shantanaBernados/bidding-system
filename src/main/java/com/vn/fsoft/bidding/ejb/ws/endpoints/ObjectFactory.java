
package com.vn.fsoft.bidding.ejb.ws.endpoints;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.vn.fsoft.bidding.ejb.ws.endpoints package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetItemResponse_QNAME = new QName("http://endpoints.ws.ejb.bidding.fsoft.vn.com/", "getItemResponse");
    private final static QName _GetBidResponse_QNAME = new QName("http://endpoints.ws.ejb.bidding.fsoft.vn.com/", "getBidResponse");
    private final static QName _GetItem_QNAME = new QName("http://endpoints.ws.ejb.bidding.fsoft.vn.com/", "getItem");
    private final static QName _GetBid_QNAME = new QName("http://endpoints.ws.ejb.bidding.fsoft.vn.com/", "getBid");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.vn.fsoft.bidding.ejb.ws.endpoints
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetItemResponse }
     * 
     */
    public GetItemResponse createGetItemResponse() {
        return new GetItemResponse();
    }

    /**
     * Create an instance of {@link GetBidResponse }
     * 
     */
    public GetBidResponse createGetBidResponse() {
        return new GetBidResponse();
    }

    /**
     * Create an instance of {@link GetItem }
     * 
     */
    public GetItem createGetItem() {
        return new GetItem();
    }

    /**
     * Create an instance of {@link GetBid }
     * 
     */
    public GetBid createGetBid() {
        return new GetBid();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link Bid }
     * 
     */
    public Bid createBid() {
        return new Bid();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.ws.ejb.bidding.fsoft.vn.com/", name = "getItemResponse")
    public JAXBElement<GetItemResponse> createGetItemResponse(GetItemResponse value) {
        return new JAXBElement<GetItemResponse>(_GetItemResponse_QNAME, GetItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBidResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.ws.ejb.bidding.fsoft.vn.com/", name = "getBidResponse")
    public JAXBElement<GetBidResponse> createGetBidResponse(GetBidResponse value) {
        return new JAXBElement<GetBidResponse>(_GetBidResponse_QNAME, GetBidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.ws.ejb.bidding.fsoft.vn.com/", name = "getItem")
    public JAXBElement<GetItem> createGetItem(GetItem value) {
        return new JAXBElement<GetItem>(_GetItem_QNAME, GetItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.ws.ejb.bidding.fsoft.vn.com/", name = "getBid")
    public JAXBElement<GetBid> createGetBid(GetBid value) {
        return new JAXBElement<GetBid>(_GetBid_QNAME, GetBid.class, null, value);
    }

}
