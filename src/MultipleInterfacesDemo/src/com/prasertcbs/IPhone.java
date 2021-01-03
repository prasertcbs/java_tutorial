package com.prasertcbs;

/**
 * Created by prasert on 10/21/2014.
 */
public interface IPhone {
    void call(String phoneNumber);
    void hangup();
    void sendSms(String phoneNumber, String message);
}
