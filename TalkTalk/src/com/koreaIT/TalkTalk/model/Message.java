package com.koreaIT.TalkTalk.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Message implements Serializable {
    private static final long serialVersionUID = 1L;
    private TypeIfMessage type;
    private String name;
    private String message;
    private  String whisperTarget;
    private String imageExtension;
    private byte[] image;
    private ArrayList<User> userList;

    public TypeIfMessage getType() {return type;}
    public void setType(TypeIfMessage type) {this.type = type;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getMessage() {return message;}
    public void setMessage(String message) {this.message = message;}

    public String getWhisperTarget() {return whisperTarget;}
    public void setWhisperTarget(String whisperTarget) {this.whisperTarget = whisperTarget;}

    public String getImageExtension() {return imageExtension;}
    public void setImageExtension(String imageExtension) {this.imageExtension = imageExtension;}

    public byte[] getImage() {return image;}
    public void setImage(byte[] image) {this.image = image;}

    public ArrayList<User> getUserList() {return userList;}
    public void setUserList(ArrayList<User> userList) {this.userList = userList;}
}
