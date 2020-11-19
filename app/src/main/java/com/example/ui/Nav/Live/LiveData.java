package com.example.ui.Nav.Live;

import java.io.Serializable;

public class LiveData implements Serializable {
    private String title;
    private String line;
    private String dir;
    private String data;
    private String num;

    public LiveData(String line, String dir, String data, String title, String num) {
        this.line = line;
        this.dir = dir;
        this.data = data;
        this.title = title;
        this.num = num;
    }
    public LiveData(String dir, String data, String title) {
        this.line = line;
        this.dir = dir;
        this.data = data;
        this.title = title;
    }
    public void setNum(String num){this.num = num;}
    public void setTitle(String title) {
        this.title = title;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNum(){return num;}
    public String getTitle() {
        return title;
    }

    public String getLine() {
        return line;
    }

    public String getDir() {
        return dir;
    }

    public String getData() {
        return data;
    }

}