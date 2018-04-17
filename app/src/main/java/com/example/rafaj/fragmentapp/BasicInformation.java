package com.example.rafaj.fragmentapp;


import android.os.Parcel;
import android.os.Parcelable;

public class BasicInformation implements Parcelable {

    private String  title;
    private int  image;
    private String description;

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
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(description);
        dest.writeInt(image);
    }

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
