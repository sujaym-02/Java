class FestivalsRunner {
    public static void main(String[] args) {

        System.out.println("MAIN STARTED\n");


        Festivals festival1 = new Festivals(101, "Diwali", "India", true, 5.0, "October");
        festival1.getInformation();

        Festivals festival2 = new Festivals(102, "Christmas", "Worldwide", true, 1.0, "December");
        festival2.getInformation();

        Festivals festival3 = new Festivals(103, "Holi", "India", true, 2.0, "March");
        festival3.getInformation(); // Corrected from festival2.getInformation()

        Festivals festival4 = new Festivals(104, "Eid", "Muslim World", true, 1.0, "May");
        festival4.getInformation(); // Corrected from festival1.getInformation()

        Festivals festival5 = new Festivals(105, "Navratri", "India", true, 9.0, "October");
        festival5.getInformation();

        Festivals festival6 = new Festivals(106, "Pongal", "Tamil Nadu", true, 4.0, "January");
        festival6.getInformation();

        Festivals festival7 = new Festivals(107, "Bihu", "Assam", true, 3.0, "January");
        festival7.getInformation();

        Festivals festival8 = new Festivals(108, "Onam", "Kerala", true, 10.0, "August");
        festival8.getInformation();

        Festivals festival9 = new Festivals(109, "Easter", "Worldwide", true, 1.0, "April");
        festival9.getInformation();

        Festivals festival10 = new Festivals(110, "Thanksgiving", "USA", false, 1.0, "November");
        festival10.getInformation();

        Festivals festival11 = new Festivals(111, "Lohri", "Punjab", false, 1.0, "January");
        festival11.getInformation();

        Festivals festival12 = new Festivals(112, "Hanukkah", "Jewish Communities", true, 8.0, "December");
        festival12.getInformation();

        Festivals festival13 = new Festivals(113, "New Year", "Worldwide", false, 1.0, "January");
        festival13.getInformation();

        Festivals festival14 = new Festivals(114, "Baisakhi", "Punjab", true, 1.0, "April");
        festival14.getInformation();

        Festivals festival15 = new Festivals(115, "Durga Puja", "West Bengal", true, 5.0, "October");
        festival15.getInformation();

        Festivals festival16 = new Festivals(116, "Kumbh Mela", "India", true, 48.0, "January");
        festival16.getInformation();

        Festivals festival17 = new Festivals(117, "Ganesh Chaturthi", "Maharashtra", true, 10.0, "September");
        festival17.getInformation();

        Festivals festival18 = new Festivals(118, "Rath Yatra", "Odisha", true, 1.0, "July");
        festival18.getInformation();

        Festivals festival19 = new Festivals(119, "Raksha Bandhan", "India", true, 1.0, "August");
        festival19.getInformation();

        Festivals festival20 = new Festivals(120, "Makar Sankranti", "India", true, 1.0, "January");
        festival20.getInformation();
    }
}
