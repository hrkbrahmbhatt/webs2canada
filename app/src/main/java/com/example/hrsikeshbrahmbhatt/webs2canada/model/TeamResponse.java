package com.example.hrsikeshbrahmbhatt.webs2canada.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by hrsikeshbrahmbhatt on 2017-10-08.
 */

public class TeamResponse {


    @SerializedName("Team")
    @Expose
    private List<TeamAlbum> albums;

    public List<TeamAlbum> getAlbums(){

        return albums;
    }
    public void setAlbums(List<TeamAlbum>albums){
        this.albums = albums;
    }

}
