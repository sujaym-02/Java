class ServiceManager {
    public static void verify(String issue) {
        System.out.println("Service Manager verifying fix for: " + issue);
        Company.resolve(issue);
    }
}
