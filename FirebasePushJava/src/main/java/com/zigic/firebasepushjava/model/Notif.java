/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zigic.firebasepushjava.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Notif {

    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("registration_ids")
    @Expose
    private List<String> registrationIds = new ArrayList<String>();

    /**
     *
     * @return The data
     */
    public Data getData() {
        return data;
    }

    /**
     *
     * @param data The data
     */
    public void setData(Data data) {
        this.data = data;
    }

    /**
     *
     * @return The registrationIds
     */
    public List<String> getRegistrationIds() {
        return registrationIds;
    }

    /**
     *
     * @param registrationIds The registration_ids
     */
    public void setRegistrationIds(List<String> registrationIds) {
        this.registrationIds = registrationIds;
    }

}
