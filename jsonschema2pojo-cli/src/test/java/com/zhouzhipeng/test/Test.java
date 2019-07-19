package com.zhouzhipeng.test;

import com.google.gson.Gson;

public class Test {
    public static void main(String[] args) {
//        new CreateAccountRequest.CreateAccountRequestBuilder()
//                .withData(new CreateAccountRequest.Data.DataBuilder()
//                        .withAttributes())
        CreateAccountRequest req = new CreateAccountRequest()
                .withData(new CreateAccountRequest
                        .Data()
                        .withAttributes(new CreateAccountRequest
                                .Attributes()
                                .withAccountType("sdfsdf")));


        System.out.println(new Gson().toJson(req));
    }
}
