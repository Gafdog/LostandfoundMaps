package com.example.lostandfound2;




public class items {

    private String name, description, location, phone, when_Found, lostFound;
    private Double latitude, longitude;
    private int id;

    public items( String name, String description, String location, String phone, String when_Found, String lostFound, Double latitude, Double longitude){
        this.name = name;
        this.description = description;
        this.location = location;
        this.phone = phone;
        this.when_Found = when_Found;
        this.lostFound = lostFound;
        this.latitude = latitude;
        this.longitude = longitude;

    }

    public items(){}

    public items( String name){
        this.name = name;}

    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public String getLocation(){
        return location;
    }
    public String getPhone(){
        return phone;
    }
    public String getWhen_Found(){
        return when_Found;
    }
    public String getLostFound(){
        return lostFound;
    }
    public Double getLatitude(){return latitude;}
    public Double getLongitude(){return longitude;}

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public void setWhen_Found(String when_Found){
        this.when_Found = when_Found;
    }
    public void setLostFound(String lostFound){
        this.lostFound = lostFound;
    }
    public void setLatitude (Double latitude) {this.latitude = latitude;}
    public void setLongitude (Double longitude) {this.longitude = longitude;}

}
