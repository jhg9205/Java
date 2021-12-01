package com.koreaIT.TalkTalk.server;

import com.koreaIT.TalkTalk.model.Message;
import com.koreaIT.TalkTalk.model.TypeIfMessage;
import com.koreaIT.TalkTalk.model.User;
import com.koreaIT.TalkTalk.server.util.userList;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Handler implements Runnable{

    Socket socket;
    ObjectInputStream ois;
    ObjectOutputStream oos;
    User user;
    String name;
    Message message;

    public Handler(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            addUser();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private void addUser()throws IOException, ClassNotFoundException {
        ois = new ObjectInputStream(socket.getInputStream());
        oos = new ObjectOutputStream(socket.getOutputStream());
        Message userName = (Message) ois.readObject();
        user = new User(userName.getName(), Integer.parseInt(userName.getMessage()),oos);
        if(userList.addList(user)){
            name = userName.getName();
            sendWelcomeMessage();
        }else{
            sendDuplicateError();
            // 예외상황 발생시키기!
        }
    }
    private void sendWelcomeMessage() throws IOException{
        String adminMessage = name + "님이 입장하셨습니다.";
        setAdminMessage(TypeIfMessage.WELCOME, adminMessage);
    }

    private void setAdminMessage(TypeIfMessage type, String adminMessage){
        String adminName = "관리자";
        message = new Message();
        message.setName(adminName);
        message.setType(type);
        message.setMessage(adminMessage);
        message.setUserList(userList.getList());////주석///
    }

    private void sendDuplicateError() throws IOException{
        setAdminMessage(TypeIfMessage.DUPLICATE, null);
        // 사용자에게 에러메세지 전달
    }
}
