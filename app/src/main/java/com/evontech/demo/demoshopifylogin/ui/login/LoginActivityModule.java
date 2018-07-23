package com.evontech.demo.demoshopifylogin.ui.login;

        import dagger.Module;
        import dagger.Provides;

@Module
public class LoginActivityModule {


    @Provides
    LoginViewModel provideLoginViewModel() {
        return new LoginViewModel();
    }


}
