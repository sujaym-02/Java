class CourtcaseRunner {
    public static void main(String[] args) {

        System.out.println("MAIN STARTED\n");

        Courtcase case1 = new Courtcase();
        case1.caseId = 101;
        case1.caseType = "Criminal";
        case1.courtName = "Supreme Court";
        case1.judge = "Justice Rao";
        case1.isClosed = false;
        case1.hearingDate = "2025-08-10";
        case1.getInformation();

        Courtcase case2 = new Courtcase();
        case2.caseId = 102;
        case2.caseType = "Civil";
        case2.courtName = "High Court";
        case2.judge = "Justice Iyer";
        case2.isClosed = true;
        case2.hearingDate = "2023-05-22";
        case2.getInformation();

        Courtcase case3 = new Courtcase();
        case3.caseId = 103;
        case3.caseType = "Family";
        case3.courtName = "District Court";
        case3.judge = "Justice Mehra";
        case3.isClosed = false;
        case3.hearingDate = "2025-09-15";
        case3.getInformation();

        Courtcase case4 = new Courtcase();
        case4.caseId = 104;
        case4.caseType = "Constitutional";
        case4.courtName = "Supreme Court";
        case4.judge = "Justice Patel";
        case4.isClosed = true;
        case4.hearingDate = "2021-11-18";
        case4.getInformation();

        Courtcase case5 = new Courtcase();
        case5.caseId = 105;
        case5.caseType = "Commercial";
        case5.courtName = "City Civil Court";
        case5.judge = "Justice Verma";
        case5.isClosed = false;
        case5.hearingDate = "2024-03-08";
        case5.getInformation();

        Courtcase case6 = new Courtcase();
        case6.caseId = 106;
        case6.caseType = "Tax";
        case6.courtName = "Tribunal Court";
        case6.judge = "Justice Sharma";
        case6.isClosed = true;
        case6.hearingDate = "2022-12-01";
        case6.getInformation();

        Courtcase case7 = new Courtcase();
        case7.caseId = 107;
        case7.caseType = "Environmental";
        case7.courtName = "Green Tribunal";
        case7.judge = "Justice Menon";
        case7.isClosed = false;
        case7.hearingDate = "2025-10-05";
        case7.getInformation();

        Courtcase case8 = new Courtcase();
        case8.caseId = 108;
        case8.caseType = "Cyber Crime";
        case8.courtName = "Cyber Court";
        case8.judge = "Justice Reddy";
        case8.isClosed = false;
        case8.hearingDate = "2024-07-12";
        case8.getInformation();

        Courtcase case9 = new Courtcase();
        case9.caseId = 109;
        case9.caseType = "Juvenile";
        case9.courtName = "Juvenile Court";
        case9.judge = "Justice Singh";
        case9.isClosed = true;
        case9.hearingDate = "2020-04-04";
        case9.getInformation();

        Courtcase case10 = new Courtcase();
        case10.caseId = 110;
        case10.caseType = "Labor";
        case10.courtName = "Labor Court";
        case10.judge = "Justice Pandey";
        case10.isClosed = false;
        case10.hearingDate = "2025-01-25";
        case10.getInformation();

        Courtcase case11 = new Courtcase();
        case11.caseId = 111;
        case11.caseType = "Dispute";
        case11.courtName = "Court11";
        case11.judge = "Judge11";
        case11.isClosed = true;
        case11.hearingDate = "2025-09-11";
        case11.getInformation();

        Courtcase case12 = new Courtcase();
        case12.caseId = 112;
        case12.caseType = "Fraud";
        case12.courtName = "Court12";
        case12.judge = "Judge12";
        case12.isClosed = false;
        case12.hearingDate = "2025-09-12";
        case12.getInformation();

        Courtcase case13 = new Courtcase();
        case13.caseId = 113;
        case13.caseType = "IPR";
        case13.courtName = "Court13";
        case13.judge = "Judge13";
        case13.isClosed = true;
        case13.hearingDate = "2025-09-13";
        case13.getInformation();

        Courtcase case14 = new Courtcase();
        case14.caseId = 114;
        case14.caseType = "Contract";
        case14.courtName = "Court14";
        case14.judge = "Judge14";
        case14.isClosed = false;
        case14.hearingDate = "2025-09-14";
        case14.getInformation();

        Courtcase case15 = new Courtcase();
        case15.caseId = 115;
        case15.caseType = "Property";
        case15.courtName = "Court15";
        case15.judge = "Judge15";
        case15.isClosed = true;
        case15.hearingDate = "2025-09-15";
        case15.getInformation();

        Courtcase case16 = new Courtcase();
        case16.caseId = 116;
        case16.caseType = "Tenant";
        case16.courtName = "Court16";
        case16.judge = "Judge16";
        case16.isClosed = false;
        case16.hearingDate = "2025-09-16";
        case16.getInformation();

        Courtcase case17 = new Courtcase();
        case17.caseId = 117;
        case17.caseType = "Traffic";
        case17.courtName = "Court17";
        case17.judge = "Judge17";
        case17.isClosed = true;
        case17.hearingDate = "2025-09-17";
        case17.getInformation();

        Courtcase case18 = new Courtcase();
        case18.caseId = 118;
        case18.caseType = "Accident";
        case18.courtName = "Court18";
        case18.judge = "Judge18";
        case18.isClosed = false;
        case18.hearingDate = "2025-09-18";
        case18.getInformation();

        Courtcase case19 = new Courtcase();
        case19.caseId = 119;
        case19.caseType = "Immigration";
        case19.courtName = "Court19";
        case19.judge = "Judge19";
        case19.isClosed = true;
        case19.hearingDate = "2025-09-19";
        case19.getInformation();

        Courtcase case20 = new Courtcase();
        case20.caseId = 120;
        case20.caseType = "Finance";
        case20.courtName = "Court20";
        case20.judge = "Judge20";
        case20.isClosed = false;
        case20.hearingDate = "2025-09-20";
        case20.getInformation();
    }
}
