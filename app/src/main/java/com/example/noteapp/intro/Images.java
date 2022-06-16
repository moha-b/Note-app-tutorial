package com.example.noteapp.intro;

public class Images {
    private int img;
    private String content;

    public Images(int image, String text) {
        this.img = image;
        this.content = text;

    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
