package com.koreaIT.TalkTalk.model;

import java.io.ObjectOutputStream;
import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int proFileNum;
    transient private ObjectOutputStream oos;

    public User(String name, int proFileNum, ObjectOutputStream oos){
        this.name = name;
        this.proFileNum = proFileNum;
        this.oos = oos;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getProFileNum() {return proFileNum;}
    public void setProFileNum(int proFileNum) {this.proFileNum = proFileNum;}

    public ObjectOutputStream getOos() {return oos;}
    public void setOos(ObjectOutputStream oos) {this.oos = oos;}


}
