class CourtcaseRunner {
    public static void main(String[] args) {

        System.out.println("MAIN STARTED\n");

        Courtcase case1 = new Courtcase(101, "Criminal", "Supreme Court", "Justice Rao", false, "2025-08-10");
        case1.getInformation();

        Courtcase case2 = new Courtcase(102, "Civil", "High Court", "Justice Iyer", true, "2023-05-22");
        case2.getInformation();

        Courtcase case3 = new Courtcase(103, "Family", "District Court", "Justice Mehra", false, "2025-09-15");
        case3.getInformation();

        Courtcase case4 = new Courtcase(104, "Constitutional", "Supreme Court", "Justice Patel", true, "2021-11-18");
        case4.getInformation();

        Courtcase case5 = new Courtcase(105, "Commercial", "City Civil Court", "Justice Verma", false, "2024-03-08");
        case5.getInformation();

        Courtcase case6 = new Courtcase(106, "Tax", "Tribunal Court", "Justice Sharma", true, "2022-12-01");
        case6.getInformation();

        Courtcase case7 = new Courtcase(107, "Environmental", "Green Tribunal", "Justice Menon", false, "2025-10-05");
        case7.getInformation();

        Courtcase case8 = new Courtcase(108, "Cyber Crime", "Cyber Court", "Justice Reddy", false, "2024-07-12");
        case8.getInformation();

        Courtcase case9 = new Courtcase(109, "Juvenile", "Juvenile Court", "Justice Singh", true, "2020-04-04");
        case9.getInformation();

        Courtcase case10 = new Courtcase(110, "Labor", "Labor Court", "Justice Pandey", false, "2025-01-25");
        case10.getInformation();

        Courtcase case11 = new Courtcase(111, "Dispute", "Court11", "Judge11", true, "2025-09-11");
        case11.getInformation();

        Courtcase case12 = new Courtcase(112, "Fraud", "Court12", "Judge12", false, "2025-09-12");
        case12.getInformation();

        Courtcase case13 = new Courtcase(113, "IPR", "Court13", "Judge13", true, "2025-09-13");
        case13.getInformation();

        Courtcase case14 = new Courtcase(114, "Contract", "Court14", "Judge14", false, "2025-09-14");
        case14.getInformation();

        Courtcase case15 = new Courtcase(115, "Property", "Court15", "Judge15", true, "2025-09-15");
        case15.getInformation();

        Courtcase case16 = new Courtcase(116, "Tenant", "Court16", "Judge16", false, "2025-09-16");
        case16.getInformation();

        Courtcase case17 = new Courtcase(117, "Traffic", "Court17", "Judge17", true, "2025-09-17");
        case17.getInformation();

        Courtcase case18 = new Courtcase(118, "Accident", "Court18", "Judge18", false, "2025-09-18");
        case18.getInformation();

        Courtcase case19 = new Courtcase(119, "Immigration", "Court19", "Judge19", true, "2025-09-19");
        case19.getInformation();

        Courtcase case20 = new Courtcase(120, "Finance", "Court20", "Judge20", false, "2025-09-20");
        case20.getInformation();
    }
}
