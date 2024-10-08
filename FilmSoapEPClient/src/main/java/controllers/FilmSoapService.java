/**
 * FilmSoapService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package controllers;

public interface FilmSoapService extends javax.xml.rpc.Service {
    public java.lang.String getFilmSoapAddress();

    public controllers.FilmSoap getFilmSoap() throws javax.xml.rpc.ServiceException;

    public controllers.FilmSoap getFilmSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
