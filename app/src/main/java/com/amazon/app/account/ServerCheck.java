package com.amazon.app.account;


public class ServerCheck {

    void onLogin(String userName, String password, ServerResponse serverResponse)
    {
        if (userName.equalsIgnoreCase("buvanesh") && password.equals("1234"))
        {
            serverResponse.onSuccess("login Success");
        } else {
            serverResponse.onFailed("User name password incorrect");
        }
    }


}
