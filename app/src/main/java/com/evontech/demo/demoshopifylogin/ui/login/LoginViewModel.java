package com.evontech.demo.demoshopifylogin.ui.login;

import android.text.TextUtils;
import android.util.Log;

import com.evontech.demo.demoshopifylogin.ui.base.BaseViewModel;

public class LoginViewModel extends BaseViewModel<LoginNavigator> {
    private final String TAG = LoginActivity.class.getName();

//    public LoginViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
//        super(dataManager, schedulerProvider);
//    }

    public LoginViewModel() {
        super();
    }

    public boolean isEmailAndPasswordValid(String email, String password) {
        // validate email and password
        if (TextUtils.isEmpty(email)) {
            return false;
        }
//        if (!CommonUtils.isEmailValid(email)) {
//            return false;
//        }
        if (TextUtils.isEmpty(password)) {
            return false;
        }
        return true;
    }

    public void login(String email, String password) {

        Log.e(TAG, "email is "+email+"password"+password);

        setIsLoading(true);

        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        Log.i("tag", "This'll run 3000 milliseconds later");
                        setIsLoading(false);

                    }
                },
                3000);

//        setIsLoading(true);
//        getCompositeDisposable().add(getDataManager()
//                .doServerLoginApiCall(new LoginRequest.ServerLoginRequest(email, password))
//                .doOnSuccess(response -> getDataManager()
//                        .updateUserInfo(
//                                response.getAccessToken(),
//                                response.getUserId(),
//                                DataManager.LoggedInMode.LOGGED_IN_MODE_SERVER,
//                                response.getUserName(),
//                                response.getUserEmail(),
//                                response.getGoogleProfilePicUrl()))
//                .subscribeOn(getSchedulerProvider().io())
//                .observeOn(getSchedulerProvider().ui())
//                .subscribe(response -> {
//                    setIsLoading(false);
//                    getNavigator().openMainActivity();
//                }, throwable -> {
//                    setIsLoading(false);
//                    getNavigator().handleError(throwable);
//                }));
    }

    public void onFbLoginClick() {
        setIsLoading(true);
//        getCompositeDisposable().add(getDataManager()
//                .doFacebookLoginApiCall(new LoginRequest.FacebookLoginRequest("test3", "test4"))
//                .doOnSuccess(response -> getDataManager()
//                        .updateUserInfo(
//                                response.getAccessToken(),
//                                response.getUserId(),
//                                DataManager.LoggedInMode.LOGGED_IN_MODE_FB,
//                                response.getUserName(),
//                                response.getUserEmail(),
//                                response.getGoogleProfilePicUrl()))
//                .subscribeOn(getSchedulerProvider().io())
//                .observeOn(getSchedulerProvider().ui())
//                .subscribe(response -> {
//                    setIsLoading(false);
//                    getNavigator().openMainActivity();
//                }, throwable -> {
//                    setIsLoading(false);
//                    getNavigator().handleError(throwable);
//                }));
    }

    public void onGoogleLoginClick() {
        setIsLoading(true);
//        getCompositeDisposable().add(getDataManager()
//                .doGoogleLoginApiCall(new LoginRequest.GoogleLoginRequest("test1", "test1"))
//                .doOnSuccess(response -> getDataManager()
//                        .updateUserInfo(
//                                response.getAccessToken(),
//                                response.getUserId(),
//                                DataManager.LoggedInMode.LOGGED_IN_MODE_GOOGLE,
//                                response.getUserName(),
//                                response.getUserEmail(),
//                                response.getGoogleProfilePicUrl()))
//                .subscribeOn(getSchedulerProvider().io())
//                .observeOn(getSchedulerProvider().ui())
//                .subscribe(response -> {
//                    setIsLoading(false);
//                    getNavigator().openMainActivity();
//                }, throwable -> {
//                    setIsLoading(false);
//                    getNavigator().handleError(throwable);
//                }));
    }

    public void onServerLoginClick() {
        getNavigator().login();
    }
}
