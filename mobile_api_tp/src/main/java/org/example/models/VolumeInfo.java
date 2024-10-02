package org.example.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VolumeInfo {
    @SerializedName("title")
    private String title;
    @SerializedName("authors");
    private List<String> authors;
    private String published ;
    private String description ;
}
