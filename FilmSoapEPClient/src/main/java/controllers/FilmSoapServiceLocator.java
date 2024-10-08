/**
 * FilmSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package controllers;

public class FilmSoapServiceLocator extends org.apache.axis.client.Service implements controllers.FilmSoapService {

    public FilmSoapServiceLocator() {
    }


    public FilmSoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FilmSoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FilmSoap
    private java.lang.String FilmSoap_address = "http://localhost:8080/FilmSoapEP/services/FilmSoap";

    public java.lang.String getFilmSoapAddress() {
        return FilmSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FilmSoapWSDDServiceName = "FilmSoap";

    public java.lang.String getFilmSoapWSDDServiceName() {
        return FilmSoapWSDDServiceName;
    }

    public void setFilmSoapWSDDServiceName(java.lang.String name) {
        FilmSoapWSDDServiceName = name;
    }

    public controllers.FilmSoap getFilmSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FilmSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFilmSoap(endpoint);
    }

    public controllers.FilmSoap getFilmSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            controllers.FilmSoapSoapBindingStub _stub = new controllers.FilmSoapSoapBindingStub(portAddress, this);
            _stub.setPortName(getFilmSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFilmSoapEndpointAddress(java.lang.String address) {
        FilmSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (controllers.FilmSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                controllers.FilmSoapSoapBindingStub _stub = new controllers.FilmSoapSoapBindingStub(new java.net.URL(FilmSoap_address), this);
                _stub.setPortName(getFilmSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("FilmSoap".equals(inputPortName)) {
            return getFilmSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://controllers", "FilmSoapService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://controllers", "FilmSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FilmSoap".equals(portName)) {
            setFilmSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
