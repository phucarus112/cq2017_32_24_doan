package com.example.project.APIConnect;
import com.google.gson.annotations.SerializedName;

public class CreateTourRequest {

    @SerializedName("token")
    private String token;

    @SerializedName("name")
    private String name;

    @SerializedName("startDate")
    private long startDate;

    @SerializedName("endDate")
    private long endDate;

    @SerializedName("sourceLat")
    private float sourceLat;

    @SerializedName("sourceLong")
    private float sourceLong;

    @SerializedName("desLat")
    private float desLat;

    @SerializedName("desLong")
    private float desLong;

    @SerializedName("isPrivate")
    private boolean isPrivate;

    @SerializedName("adults")
    private int adults;

    @SerializedName("childs")
    private int childs;

    @SerializedName("minCost")
    private float minCost;

    @SerializedName("maxCost")
    private float maxCost;

    @SerializedName("hostId")
    private String hostId;

    @SerializedName("status")
    private int status;

    @SerializedName("id")
    private int id;

    @SerializedName("avatar")
    private String avatar;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getStartDate() {
        return startDate;
    }

    public void setStartDate(long startDate) {
        this.startDate = startDate;
    }

    public long getEndDate() {
        return endDate;
    }

    public void setEndDate(long endDate) {
        this.endDate = endDate;
    }

    public float getSourceLat() {
        return sourceLat;
    }

    public void setSourceLat(float sourceLat) {
        this.sourceLat = sourceLat;
    }

    public float getSourceLong() {
        return sourceLong;
    }

    public void setSourceLong(float sourceLong) {
        this.sourceLong = sourceLong;
    }

    public float getDesLat() {
        return desLat;
    }

    public void setDesLat(float desLat) {
        this.desLat = desLat;
    }

    public float getDesLong() {
        return desLong;
    }

    public void setDesLong(float desLong) {
        this.desLong = desLong;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public int getAdults() {
        return adults;
    }

    public void setAdults(int adults) {
        this.adults = adults;
    }

    public int getChilds() {
        return childs;
    }

    public void setChilds(int childs) {
        this.childs = childs;
    }

    public float getMinCost() {
        return minCost;
    }

    public void setMinCost(float minCost) {
        this.minCost = minCost;
    }

    public float getMaxCost() {
        return maxCost;
    }

    public void setMaxCost(float maxCost) {
        this.maxCost = maxCost;
    }

    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
