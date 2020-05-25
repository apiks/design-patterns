package mediatorANDfactory.factory;

import mediatorANDfactory.mediator.ChatRoom;

public class User {
    String username;
    String permission;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPermission() {
        return permission;
    }
    public void setPermission(String permission) {
        this.permission = permission;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
