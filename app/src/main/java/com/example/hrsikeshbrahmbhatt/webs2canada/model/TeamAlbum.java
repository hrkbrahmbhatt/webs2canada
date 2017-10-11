package com.example.hrsikeshbrahmbhatt.webs2canada.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by hrsikeshbrahmbhatt on 2017-10-08.
 */

public class TeamAlbum {

    @SerializedName("devName")
    @Expose

    private String devName;

    @SerializedName("devRole")
    @Expose
    private String devRole;

    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;

    public TeamAlbum(){

    }

    public TeamAlbum(String devName, String devRole, String thumbnail){
        this.devName = devName;
        this.devRole = devRole;
        this.thumbnail = thumbnail;

    }

    public String getDevName(){
        return devName;
    }

    public void setDevName(String devName){

        this.devName = devName;
    }

    public  String getDevRole(){
        return devRole;
    }

    public void  setDevRole(String devRole){
        this.devRole = devRole;
    }

    public String getThumbnail(){
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
}
