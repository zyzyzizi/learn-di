package com.twobros.sample.data.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class Post implements Parcelable {
    private long userId;
    private long id;
    private String title;
    private String body;

    public Post(long userId, long id, String title, String body){
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public long getUserId(){
        return userId;
    }

    public long getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getBody() {
        return body;
    }

    protected Post(Parcel in) {
        this.userId = in.readLong();
        this.id = in.readLong();
        this.title = in.readString();
        this.body = in.readString();
    }

    public static final Creator<Post> CREATOR = new Creator<Post>() {
        @Override
        public Post createFromParcel(Parcel in) {
            return new Post(in);
        }

        @Override
        public Post[] newArray(int size) {
            return new Post[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flag) {
        dest.writeLong(this.userId);
        dest.writeLong(this.id);
        dest.writeString(this.title);
        dest.writeString(this.body);
    }
}
