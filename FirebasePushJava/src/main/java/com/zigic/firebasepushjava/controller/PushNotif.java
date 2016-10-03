/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zigic.firebasepushjava.controller;

import com.google.gson.Gson;
import com.zigic.firebasepushjava.model.Data;
import com.zigic.firebasepushjava.model.Notif;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 *
 * @author reja
 */
public class PushNotif {

    OkHttpClient client;
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    public PushNotif() {
        client = new OkHttpClient();
    }

    public String doPostRequest(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                /*
                add your firebase key api
                */
                .addHeader("Authorization", "yourkeyapi")
                .url(url)
                .post(body)
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public void sendNotif(String message) {
        List<String> listtoken = new ArrayList<>();
        /*
         add your token id
         */
        listtoken.add("token id 1");
        listtoken.add("token id 2");
        listtoken.add("token id 3");
        try {
            PushNotif push = new PushNotif();
            String postResponse = push.doPostRequest("https://fcm.googleapis.com/fcm/send", createJSON(listtoken, message));
            System.out.println(postResponse);
        } catch (IOException ex) {

        }
    }

    public String createJSON(List<String> listtokenid, String message) {
        Data data = new Data();
        data.setTitle("Firebase Title");
        data.setMessage("Firebase Message");
        data.setOtherKey(true);
        data.setBody(message);

        Notif notif = new Notif();
        notif.setData(data);
        notif.setRegistrationIds(listtokenid);

        Gson gson = new Gson(); // convert java object to JSON format, // and returned as JSON formatted string 
        String json = gson.toJson(notif);
        System.out.println(json);
        return json;
    }
}
