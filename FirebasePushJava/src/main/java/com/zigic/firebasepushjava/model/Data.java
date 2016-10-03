/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zigic.firebasepushjava.model;

/**
 *
 * @author reja
 */
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Data {

@SerializedName("title")
@Expose
private String title;
@SerializedName("message")
@Expose
private String message;
@SerializedName("other_key")
@Expose
private Boolean otherKey;
@SerializedName("body")
@Expose
private String body;

/**
*
* @return
* The title
*/
public String getTitle() {
return title;
}

/**
*
* @param title
* The title
*/
public void setTitle(String title) {
this.title = title;
}

/**
*
* @return
* The message
*/
public String getMessage() {
return message;
}

/**
*
* @param message
* The message
*/
public void setMessage(String message) {
this.message = message;
}

/**
*
* @return
* The otherKey
*/
public Boolean getOtherKey() {
return otherKey;
}

/**
*
* @param otherKey
* The other_key
*/
public void setOtherKey(Boolean otherKey) {
this.otherKey = otherKey;
}

/**
*
* @return
* The body
*/
public String getBody() {
return body;
}

/**
*
* @param body
* The body
*/
public void setBody(String body) {
this.body = body;
}

}