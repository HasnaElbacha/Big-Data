package org.example.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GoogleBooksRespense {
    @SerializedName("Kind")
    private String King;
    @SerializedName("totalItems")
    private int totalItems;
    @SerializedName("items")
    private List<Book> items;

    public String getKing() {
        return King;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public List<Book> getItems() {
        return items;
    }

    public void setKing(String king) {
        King = king;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public void setItems(List<Book> items) {
        this.items = items;
    }
}
