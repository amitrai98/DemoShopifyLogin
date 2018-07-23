package com.evontech.demo.demoshopifylogin.ui.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.evontech.demo.demoshopifylogin.R;
import com.evontech.demo.demoshopifylogin.databinding.ActivityLoginBinding;
import com.evontech.demo.demoshopifylogin.ui.base.BaseActivity;

import javax.inject.Inject;

public class LoginActivity extends BaseActivity<ActivityLoginBinding, LoginViewModel> implements LoginNavigator {
    @Inject
    LoginViewModel mLoginViewModel;
    private ActivityLoginBinding mActivityLoginBinding;

    public static Intent newIntent(Context context) {
        return new Intent(context, LoginActivity.class);
    }

    @Override
    public int getBindingVariable() {
        return 0;//BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public LoginViewModel getViewModel() {
        return mLoginViewModel;
    }

    @Override
    public void handleError(Throwable throwable) {
        // handle error
    }

    @Override
    public void login() {
//        String email = mActivityLoginBinding.etEmail.getText().toString();
//        String password = mActivityLoginBinding.etPassword.getText().toString();
//        if (mLoginViewModel.isEmailAndPasswordValid(email, password)) {
//            hideKeyboard();
//            mLoginViewModel.login(email, password);
//        } else {
//            Toast.makeText(this, getString(R.string.invalid_email_password), Toast.LENGTH_SHORT).show();
//        }
    }

    @Override
    public void openMainActivity() {
//        Intent intent = MainActivity.newIntent(LoginActivity.this);
//        startActivity(intent);
//        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityLoginBinding = getViewDataBinding();
        mLoginViewModel.setNavigator(this);
    }
}
