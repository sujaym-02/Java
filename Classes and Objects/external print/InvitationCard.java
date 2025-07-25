public class InvitationCard {
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
