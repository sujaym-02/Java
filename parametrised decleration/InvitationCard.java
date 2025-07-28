public class InvitationCard {


    InvitationCard() {
        System.out.println("InvitationCard Default Constructor is invoked");
    }

    InvitationCard(int cardId, String event, String recipientName, String color, String size, boolean isPrinted) {
        System.out.println("InvitationCard Parameterized Constructor is invoked");
        this.cardId = cardId;
        this.event = event;
        this.recipientName = recipientName;
        this.color = color;
        this.size = size;
        this.isPrinted = isPrinted;
    }

    int cardId;
    String event;
    String recipientName;
    String color;
    String size;
    boolean isPrinted;

    void getInformation() {
        System.out.println("Card ID: " + cardId);
        System.out.println("Event: " + event);
        System.out.println("Recipient: " + recipientName);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Printed: " + isPrinted);
        System.out.println();
    }
}
