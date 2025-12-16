package Design_Pattern.State_Pattern;

// State interface
interface MessageState {
    void Send(Text text);

    void receiveDeliveryReport(Text text);

    String getStatus();
}

// Concrete State
class TypingState implements MessageState {

    @Override
    public void Send(Text text) {
        System.out.println("-> Sending message from typing state");
        text.setState(new SentState());
    }

    @Override
    public void receiveDeliveryReport(Text text) {
        System.out.println("-> Cannot receive report. Message is still in typing state");
    }

    @Override
    public String getStatus() {
        return "Typing";
    }

}

class SentState implements MessageState {

    @Override
    public void Send(Text text) {
        System.out.println("-> Message already sent");
    }

    @Override
    public void receiveDeliveryReport(Text text) {
        System.out.println("-> Received delivery report from sent state");
        text.setState(new DeliveredState());
    }

    @Override
    public String getStatus() {
        return "Sent";
    }

}

class DeliveredState implements MessageState {

    @Override
    public void Send(Text text) {
        System.out.println("-> Message already delivered");
    }

    @Override
    public void receiveDeliveryReport(Text text) {
        System.out.println("-> Cannot receive report. Message is already delivered");
    }

    @Override
    public String getStatus() {
        return "Delivered";
    }

}

// Context
class Text {

    private MessageState state;
    private final String content;

    public Text(String content) {
        this.content = content;
        this.state = new TypingState();
    }

    public void setState(MessageState state) {
        this.state = state;
        System.out.println("Current State: " + this.state.getStatus());
    }

    public void Send() {
        System.out.println("-> Sending message");
        System.out.println("Content: " + this.content);
        this.state.Send(this);
    }

    public void receiveDeliveryReport() {
        System.out.println("-> Receiving delivery report");
        System.out.println("Content: " + this.content);
        this.state.receiveDeliveryReport(this);
    }

    public MessageState getState() {
        return state;
    }

}

public class State_Pattern {
     public static void main(String[] args) {
        Text message = new Text("Hello, World!");
        System.out.println("State: " + message.getState().getStatus());
        message.Send();
        message.Send();
        message.getState();
        message.receiveDeliveryReport();
        message.getState();
     }
}
