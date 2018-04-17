package com.example.rafaj.fragmentapp;


import android.os.Parcel;
import android.os.Parcelable;

public class BasicInformation implements Parcelable {

    private String  title;
    private int  image;
    private String description;

    //constructor
    public BasicInformation(String title, int image, String description){
        this.title = title;
        this.image = image;
        this.description = description;
    }

    protected BasicInformation(Parcel in) {
        this.title = in.readString();
        this.image = in.readInt();
        this.description = in.readString();
    }
    //Implementacion de Parcelable interface
    public static final Creator<BasicInformation> CREATOR = new Creator<BasicInformation>() {
        @Override
        public BasicInformation createFromParcel(Parcel in) {
            return new BasicInformation(in);
        }

        @Override
        public BasicInformation[] newArray(int size) { return new BasicInformation[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    } //describe los objetos contenidos en esta instancia de parcelable

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        //da tamano de parcel, dest en que parcel se debe escribir el objeto, flags como debe ser escrito
        dest.writeString(title);
        dest.writeInt(image);
        dest.writeString(description);
    }

    //definicion de setters y getters

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
