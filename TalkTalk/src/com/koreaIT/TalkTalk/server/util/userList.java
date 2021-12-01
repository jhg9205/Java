package com.koreaIT.TalkTalk.server.util;

import com.koreaIT.TalkTalk.model.User;

import java.util.ArrayList;

public class userList {
    transient private static ArrayList<User> list = new ArrayList<User>();

    public synchronized static boolean addList(User newUser){
        if(!isDuplicated(newUser.getName())){
            list.add(newUser);
            return true;
        }else{
            return false;
        }
    }

    public static boolean isDuplicated(String userName){
        return contain(userName);
    }
    public static boolean contain(String targetName){
        for(User user : list){
            if(user.getName().equals(targetName)){
                return true;
            }
        }
        return false;
    }

    public static ArrayList<User> getList() {return list;}
    public static void setList(ArrayList<User> list) {userList.list = list;}
}
