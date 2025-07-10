class CustomerSupport {
    public static void receive(String issue) {
        System.out.println("Customer Support received issue: " + issue);
        TechnicalTeam.analyze(issue);
    }
}
