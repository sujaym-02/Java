class Courtcase {
    int caseId;
    String caseType;
    String courtName;
    String judge;
    boolean isClosed;
    String hearingDate;

    void getInformation() {
        System.out.println("Case ID: " + caseId);
        System.out.println("Type: " + caseType);
        System.out.println("Court: " + courtName);
        System.out.println("Judge: " + judge);
        System.out.println("Is Closed: " + isClosed);
        System.out.println("Hearing Date: " + hearingDate);
        System.out.println();
    }
}
