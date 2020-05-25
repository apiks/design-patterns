package mediatorANDfactoryANDSingleton.demo;

import mediatorANDfactoryANDSingleton.factory.User;
import mediatorANDfactoryANDSingleton.factory.UserFactory;
import mediatorANDfactoryANDSingleton.mediator.ChatRoom;

public class Demo {
    public static void main(String[] args) {
        ChatRoom chatroom = new ChatRoom();
        UserFactory userFactory = new UserFactory();

        User mark = userFactory.getUser("USER", "Mark", chatroom);
        User andrew = userFactory.getUser("USER", "Andrew", chatroom);
        User james = userFactory.getUser("USER", "James", chatroom);
        User george = userFactory.getUser("ADMIN", "George", chatroom);

        mark.sendMessage("Hello Andrew, how are you?");
        andrew.sendMessage("I'm doing great, Andrew, thanks for asking. What about you, James?");
        james.sendMessage("I'm doing good too, thanks. Hey, you seen that cat meme Linda sent yesterday?");
        george.sendMessage("Please don't send messages containing the word cat after this message. Since the last incident cats are no longer allowed. AddBot.");
        james.sendMessage("So did anyone see the cat meme?");
        george.sendMessage("I repeat. Do not say the word 'cat'.");
    }
}
