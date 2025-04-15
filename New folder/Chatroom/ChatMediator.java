package Chatroom;

public interface ChatMediator {
    public void sendMessage(String message, User user);
    public void registerUser(User user);
    public void unregisterUser(User user);
    
    
}
