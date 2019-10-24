/**
 * YaswanthServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.y;

public class YaswanthServiceLocator extends org.apache.axis.client.Service implements com.y.YaswanthService {

    public YaswanthServiceLocator() {
    }


    public YaswanthServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public YaswanthServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Yaswanth
    private java.lang.String Yaswanth_address = "http://192.168.1.107:8181/YSC/services/Yaswanth";

    public java.lang.String getYaswanthAddress() {
        return Yaswanth_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String YaswanthWSDDServiceName = "Yaswanth";

    public java.lang.String getYaswanthWSDDServiceName() {
        return YaswanthWSDDServiceName;
    }

    public void setYaswanthWSDDServiceName(java.lang.String name) {
        YaswanthWSDDServiceName = name;
    }

    public com.y.Yaswanth getYaswanth() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Yaswanth_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getYaswanth(endpoint);
    }

    public com.y.Yaswanth getYaswanth(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.y.YaswanthSoapBindingStub _stub = new com.y.YaswanthSoapBindingStub(portAddress, this);
            _stub.setPortName(getYaswanthWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setYaswanthEndpointAddress(java.lang.String address) {
        Yaswanth_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.y.Yaswanth.class.isAssignableFrom(serviceEndpointInterface)) {
                com.y.YaswanthSoapBindingStub _stub = new com.y.YaswanthSoapBindingStub(new java.net.URL(Yaswanth_address), this);
                _stub.setPortName(getYaswanthWSDDServiceName());
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
        if ("Yaswanth".equals(inputPortName)) {
            return getYaswanth();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://y.com", "YaswanthService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://y.com", "Yaswanth"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Yaswanth".equals(portName)) {
            setYaswanthEndpointAddress(address);
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
