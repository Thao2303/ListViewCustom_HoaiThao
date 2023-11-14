package com.example.listviewcustom;

public class SmartPhone {
    String title;
    String thumbnail;
    String description;

    String price;
  //  String images;

/*    public People(String title, String description, String images) {
        this.title = title;
        this.description = description;
        this.images = images;
    }*/
public SmartPhone(String title, String description, String thumbnail, String price) {
    this.title = title;
    this.description = description;
    this.thumbnail=thumbnail;
    this.price=price;
  //  hinh = hinh;
}

}
