package com.evontech.demo.demoshopifylogin.ui.login;


public interface LoginNavigator {

    void handleError(Throwable throwable);

    void login();

    void openMainActivity();
}
