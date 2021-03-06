
package org.soa.ws.tp2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloWorldImpl", targetNamespace = "http://tp2.ws.soa.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWorldImpl {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "simpleHello", targetNamespace = "http://tp2.ws.soa.org/", className = "org.soa.ws.tp2.SimpleHello")
    @ResponseWrapper(localName = "simpleHelloResponse", targetNamespace = "http://tp2.ws.soa.org/", className = "org.soa.ws.tp2.SimpleHelloResponse")
    @Action(input = "http://tp2.ws.soa.org/HelloWorldImpl/simpleHelloRequest", output = "http://tp2.ws.soa.org/HelloWorldImpl/simpleHelloResponse")
    public String simpleHello();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "makeHello", targetNamespace = "http://tp2.ws.soa.org/", className = "org.soa.ws.tp2.MakeHello")
    @ResponseWrapper(localName = "makeHelloResponse", targetNamespace = "http://tp2.ws.soa.org/", className = "org.soa.ws.tp2.MakeHelloResponse")
    @Action(input = "http://tp2.ws.soa.org/HelloWorldImpl/makeHelloRequest", output = "http://tp2.ws.soa.org/HelloWorldImpl/makeHelloResponse")
    public String makeHello(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
