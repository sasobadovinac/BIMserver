package org.bimserver.generatedclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.3
 * 2013-05-21T11:46:17.719+02:00
 * Generated source version: 2.7.3
 * 
 */
@WebService(targetNamespace = "org.buildingsmart.bimsie", name = "AuthInterface")
@XmlSeeAlso({ObjectFactory.class})
public interface AuthInterface {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "org.buildingsmart.bimsie", className = "org.bimserver.generatedclient.Login")
    @WebMethod(action = "login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "org.buildingsmart.bimsie", className = "org.bimserver.generatedclient.LoginResponse")
    public java.lang.String login(
        @WebParam(name = "username", targetNamespace = "")
        java.lang.String username,
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password
    ) throws UserException_Exception, ServerException_Exception;

    @RequestWrapper(localName = "logout", targetNamespace = "org.buildingsmart.bimsie", className = "org.bimserver.generatedclient.Logout")
    @WebMethod(action = "logout")
    @ResponseWrapper(localName = "logoutResponse", targetNamespace = "org.buildingsmart.bimsie", className = "org.bimserver.generatedclient.LogoutResponse")
    public void logout() throws UserException_Exception, ServerException_Exception;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getLoggedInUser", targetNamespace = "org.buildingsmart.bimsie", className = "org.bimserver.generatedclient.GetLoggedInUser")
    @WebMethod(action = "getLoggedInUser")
    @ResponseWrapper(localName = "getLoggedInUserResponse", targetNamespace = "org.buildingsmart.bimsie", className = "org.bimserver.generatedclient.GetLoggedInUserResponse")
    public org.bimserver.generatedclient.SUser getLoggedInUser() throws UserException_Exception, ServerException_Exception;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "isLoggedIn", targetNamespace = "org.buildingsmart.bimsie", className = "org.bimserver.generatedclient.IsLoggedIn")
    @WebMethod(action = "isLoggedIn")
    @ResponseWrapper(localName = "isLoggedInResponse", targetNamespace = "org.buildingsmart.bimsie", className = "org.bimserver.generatedclient.IsLoggedInResponse")
    public java.lang.Boolean isLoggedIn() throws UserException_Exception, ServerException_Exception;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "changePassword", targetNamespace = "org.buildingsmart.bimsie", className = "org.bimserver.generatedclient.ChangePassword")
    @WebMethod(action = "changePassword")
    @ResponseWrapper(localName = "changePasswordResponse", targetNamespace = "org.buildingsmart.bimsie", className = "org.bimserver.generatedclient.ChangePasswordResponse")
    public java.lang.Boolean changePassword(
        @WebParam(name = "uoid", targetNamespace = "")
        java.lang.Long uoid,
        @WebParam(name = "oldPassword", targetNamespace = "")
        java.lang.String oldPassword,
        @WebParam(name = "newPassword", targetNamespace = "")
        java.lang.String newPassword
    ) throws UserException_Exception, ServerException_Exception;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getAccessMethod", targetNamespace = "org.buildingsmart.bimsie", className = "org.bimserver.generatedclient.GetAccessMethod")
    @WebMethod(action = "getAccessMethod")
    @ResponseWrapper(localName = "getAccessMethodResponse", targetNamespace = "org.buildingsmart.bimsie", className = "org.bimserver.generatedclient.GetAccessMethodResponse")
    public org.bimserver.generatedclient.SAccessMethod getAccessMethod() throws UserException_Exception, ServerException_Exception;

    @RequestWrapper(localName = "requestPasswordChange", targetNamespace = "org.buildingsmart.bimsie", className = "org.bimserver.generatedclient.RequestPasswordChange")
    @WebMethod(action = "requestPasswordChange")
    @ResponseWrapper(localName = "requestPasswordChangeResponse", targetNamespace = "org.buildingsmart.bimsie", className = "org.bimserver.generatedclient.RequestPasswordChangeResponse")
    public void requestPasswordChange(
        @WebParam(name = "username", targetNamespace = "")
        java.lang.String username,
        @WebParam(name = "resetUrl", targetNamespace = "")
        java.lang.String resetUrl
    ) throws UserException_Exception, ServerException_Exception;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getCurrentUser", targetNamespace = "org.buildingsmart.bimsie", className = "org.bimserver.generatedclient.GetCurrentUser")
    @WebMethod(action = "getCurrentUser")
    @ResponseWrapper(localName = "getCurrentUserResponse", targetNamespace = "org.buildingsmart.bimsie", className = "org.bimserver.generatedclient.GetCurrentUserResponse")
    public org.bimserver.generatedclient.SUser getCurrentUser() throws UserException_Exception, ServerException_Exception;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "validateAccount", targetNamespace = "org.buildingsmart.bimsie", className = "org.bimserver.generatedclient.ValidateAccount")
    @WebMethod(action = "validateAccount")
    @ResponseWrapper(localName = "validateAccountResponse", targetNamespace = "org.buildingsmart.bimsie", className = "org.bimserver.generatedclient.ValidateAccountResponse")
    public org.bimserver.generatedclient.SUser validateAccount(
        @WebParam(name = "uoid", targetNamespace = "")
        java.lang.Long uoid,
        @WebParam(name = "token", targetNamespace = "")
        java.lang.String token,
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password
    ) throws UserException_Exception, ServerException_Exception;
}