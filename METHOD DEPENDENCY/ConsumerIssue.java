class ConsumerIssue {
    public static void reportIssue(String issue) {
        System.out.println("Consumer reported: " + issue);
        CustomerSupport.receive(issue);
    }
}
