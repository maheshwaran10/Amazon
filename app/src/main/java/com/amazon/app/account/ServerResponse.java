package com.amazon.app.account;

public interface ServerResponse {

      void onSuccess(String response);
      void onFailed(String error);
}
