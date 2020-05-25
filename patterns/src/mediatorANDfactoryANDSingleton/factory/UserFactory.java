package mediatorANDfactoryANDSingleton.factory;

import mediatorANDfactoryANDSingleton.mediator.ChatRoom;

import java.util.ArrayList;

public class UserFactory {
    public User getUser(String userType, String username, ChatRoom chatroom){
        if (userType == null) {
            return null;
        }

        User user = new User();

        if (userType.equalsIgnoreCase("USER")){
            user.setUsername(username);
            user.setPermission("default");
        }
        if (userType.equalsIgnoreCase("ADMIN")){
            user.setUsername(username);
            user.setPermission("admin");
        }

        if (!user.getUsername().equals("")) {
            ArrayList<User> chatroomUsers = chatroom.getUsers();
            chatroomUsers.add(user);
            chatroom.setUsers(chatroomUsers);
            return user;
        }

        return null;
    }
}
