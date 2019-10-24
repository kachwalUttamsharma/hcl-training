package com.y;

public class YaswanthProxy implements com.y.Yaswanth {
  private String _endpoint = null;
  private com.y.Yaswanth yaswanth = null;
  
  public YaswanthProxy() {
    _initYaswanthProxy();
  }
  
  public YaswanthProxy(String endpoint) {
    _endpoint = endpoint;
    _initYaswanthProxy();
  }
  
  private void _initYaswanthProxy() {
    try {
      yaswanth = (new com.y.YaswanthServiceLocator()).getYaswanth();
      if (yaswanth != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)yaswanth)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)yaswanth)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (yaswanth != null)
      ((javax.xml.rpc.Stub)yaswanth)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.y.Yaswanth getYaswanth() {
    if (yaswanth == null)
      _initYaswanthProxy();
    return yaswanth;
  }
  
  public int getInt() throws java.rmi.RemoteException{
    if (yaswanth == null)
      _initYaswanthProxy();
    return yaswanth.getInt();
  }
  
  
}