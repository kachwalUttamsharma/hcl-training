/**
 * YaswanthService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.y;

public interface YaswanthService extends javax.xml.rpc.Service {
    public java.lang.String getYaswanthAddress();

    public com.y.Yaswanth getYaswanth() throws javax.xml.rpc.ServiceException;

    public com.y.Yaswanth getYaswanth(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
