package controllers;

public class FilmSoapProxy implements controllers.FilmSoap {
  private String _endpoint = null;
  private controllers.FilmSoap filmSoap = null;
  
  public FilmSoapProxy() {
    _initFilmSoapProxy();
  }
  
  public FilmSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initFilmSoapProxy();
  }
  
  private void _initFilmSoapProxy() {
    try {
      filmSoap = (new controllers.FilmSoapServiceLocator()).getFilmSoap();
      if (filmSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)filmSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)filmSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (filmSoap != null)
      ((javax.xml.rpc.Stub)filmSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public controllers.FilmSoap getFilmSoap() {
    if (filmSoap == null)
      _initFilmSoapProxy();
    return filmSoap;
  }
  
  public java.lang.String getAllFilms() throws java.rmi.RemoteException{
    if (filmSoap == null)
      _initFilmSoapProxy();
    return filmSoap.getAllFilms();
  }
  
  public java.lang.String insertFilm(java.lang.String title, int year, java.lang.String director, java.lang.String stars, java.lang.String review) throws java.rmi.RemoteException{
    if (filmSoap == null)
      _initFilmSoapProxy();
    return filmSoap.insertFilm(title, year, director, stars, review);
  }
  
  public java.lang.String updateFilm(int id, java.lang.String title, int year, java.lang.String director, java.lang.String stars, java.lang.String review) throws java.rmi.RemoteException{
    if (filmSoap == null)
      _initFilmSoapProxy();
    return filmSoap.updateFilm(id, title, year, director, stars, review);
  }
  
  public java.lang.String deleteFilm(int id) throws java.rmi.RemoteException{
    if (filmSoap == null)
      _initFilmSoapProxy();
    return filmSoap.deleteFilm(id);
  }
  
  
}