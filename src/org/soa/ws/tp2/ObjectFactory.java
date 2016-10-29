
package org.soa.ws.tp2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.soa.ws.tp2 package. 
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

    private final static QName _MakeHelloResponse_QNAME = new QName("http://tp2.ws.soa.org/", "makeHelloResponse");
    private final static QName _MakeHello_QNAME = new QName("http://tp2.ws.soa.org/", "makeHello");
    private final static QName _SimpleHello_QNAME = new QName("http://tp2.ws.soa.org/", "simpleHello");
    private final static QName _SimpleHelloResponse_QNAME = new QName("http://tp2.ws.soa.org/", "simpleHelloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.soa.ws.tp2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SimpleHelloResponse }
     * 
     */
    public SimpleHelloResponse createSimpleHelloResponse() {
        return new SimpleHelloResponse();
    }

    /**
     * Create an instance of {@link SimpleHello }
     * 
     */
    public SimpleHello createSimpleHello() {
        return new SimpleHello();
    }

    /**
     * Create an instance of {@link MakeHello }
     * 
     */
    public MakeHello createMakeHello() {
        return new MakeHello();
    }

    /**
     * Create an instance of {@link MakeHelloResponse }
     * 
     */
    public MakeHelloResponse createMakeHelloResponse() {
        return new MakeHelloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp2.ws.soa.org/", name = "makeHelloResponse")
    public JAXBElement<MakeHelloResponse> createMakeHelloResponse(MakeHelloResponse value) {
        return new JAXBElement<MakeHelloResponse>(_MakeHelloResponse_QNAME, MakeHelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp2.ws.soa.org/", name = "makeHello")
    public JAXBElement<MakeHello> createMakeHello(MakeHello value) {
        return new JAXBElement<MakeHello>(_MakeHello_QNAME, MakeHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp2.ws.soa.org/", name = "simpleHello")
    public JAXBElement<SimpleHello> createSimpleHello(SimpleHello value) {
        return new JAXBElement<SimpleHello>(_SimpleHello_QNAME, SimpleHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp2.ws.soa.org/", name = "simpleHelloResponse")
    public JAXBElement<SimpleHelloResponse> createSimpleHelloResponse(SimpleHelloResponse value) {
        return new JAXBElement<SimpleHelloResponse>(_SimpleHelloResponse_QNAME, SimpleHelloResponse.class, null, value);
    }

}
