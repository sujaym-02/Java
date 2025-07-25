public class GiTagRunner {

    public static void main(String tag[]) {

        System.out.println("MAIN STARTED\n");

        GiTag tag1 = new GiTag();
        tag1.tagId = 1;
        tag1.product = "Mysore Silk";
        tag1.origin = "Karnataka";
        tag1.isHandmade = true;
        tag1.isCertified = true;
        tag1.yearAwarded = "2005";
        tag1.getInformation();

        GiTag tag2 = new GiTag();
        tag2.tagId = 2;
        tag2.product = "Darjeeling Tea";
        tag2.origin = "West Bengal";
        tag2.isHandmade = false;
        tag2.isCertified = true;
        tag2.yearAwarded = "2004";
        tag2.getInformation();

        GiTag tag3 = new GiTag();
        tag3.tagId = 3;
        tag3.product = "Pochampally Ikat";
        tag3.origin = "Telangana";
        tag3.isHandmade = true;
        tag3.isCertified = true;
        tag3.yearAwarded = "2005";
        tag3.getInformation();

        GiTag tag4 = new GiTag();
        tag4.tagId = 4;
        tag4.product = "Banarasi Saree";
        tag4.origin = "Uttar Pradesh";
        tag4.isHandmade = true;
        tag4.isCertified = true;
        tag4.yearAwarded = "2009";
        tag4.getInformation();

        GiTag tag5 = new GiTag();
        tag5.tagId = 5;
        tag5.product = "Alphonso Mango";
        tag5.origin = "Maharashtra";
        tag5.isHandmade = false;
        tag5.isCertified = true;
        tag5.yearAwarded = "2010";
        tag5.getInformation();

        GiTag tag6 = new GiTag();
        tag6.tagId = 6;
        tag6.product = "Kanjeevaram Silk";
        tag6.origin = "Tamil Nadu";
        tag6.isHandmade = true;
        tag6.isCertified = true;
        tag6.yearAwarded = "2006";
        tag6.getInformation();

        GiTag tag7 = new GiTag();
        tag7.tagId = 7;
        tag7.product = "Blue Pottery";
        tag7.origin = "Rajasthan";
        tag7.isHandmade = true;
        tag7.isCertified = false;
        tag7.yearAwarded = "2008";
        tag7.getInformation();

        GiTag tag8 = new GiTag();
        tag8.tagId = 8;
        tag8.product = "Mysore Agarbathi";
        tag8.origin = "Karnataka";
        tag8.isHandmade = true;
        tag8.isCertified = true;
        tag8.yearAwarded = "2004";
        tag8.getInformation();

        GiTag tag9 = new GiTag();
        tag9.tagId = 9;
        tag9.product = "Kashmir Pashmina";
        tag9.origin = "Jammu & Kashmir";
        tag9.isHandmade = true;
        tag9.isCertified = true;
        tag9.yearAwarded = "2008";
        tag9.getInformation();

        GiTag tag10 = new GiTag();
        tag10.tagId = 10;
        tag10.product = "Nagpur Orange";
        tag10.origin = "Maharashtra";
        tag10.isHandmade = false;
        tag10.isCertified = true;
        tag10.yearAwarded = "2014";
        tag10.getInformation();

        GiTag tag11 = new GiTag();
        tag11.tagId = 11;
        tag11.product = "Aranmula Kannadi";
        tag11.origin = "Kerala";
        tag11.isHandmade = true;
        tag11.isCertified = true;
        tag11.yearAwarded = "2004";
        tag11.getInformation();

        GiTag tag12 = new GiTag();
        tag12.tagId = 12;
        tag12.product = "Madhubani Paintings";
        tag12.origin = "Bihar";
        tag12.isHandmade = true;
        tag12.isCertified = false;
        tag12.yearAwarded = "2007";
        tag12.getInformation();

        GiTag tag13 = new GiTag();
        tag13.tagId = 13;
        tag13.product = "Assam Muga Silk";
        tag13.origin = "Assam";
        tag13.isHandmade = true;
        tag13.isCertified = true;
        tag13.yearAwarded = "2007";
        tag13.getInformation();

        GiTag tag14 = new GiTag();
        tag14.tagId = 14;
        tag14.product = "Bikaneri Bhujia";
        tag14.origin = "Rajasthan";
        tag14.isHandmade = false;
        tag14.isCertified = true;
        tag14.yearAwarded = "2010";
        tag14.getInformation();

        GiTag tag15 = new GiTag();
        tag15.tagId = 15;
        tag15.product = "Tanjore Paintings";
        tag15.origin = "Tamil Nadu";
        tag15.isHandmade = true;
        tag15.isCertified = false;
        tag15.yearAwarded = "2007";
        tag15.getInformation();

        GiTag tag16 = new GiTag();
        tag16.tagId = 16;
        tag16.product = "Kullu Shawl";
        tag16.origin = "Himachal Pradesh";
        tag16.isHandmade = true;
        tag16.isCertified = true;
        tag16.yearAwarded = "2005";
        tag16.getInformation();

        GiTag tag17 = new GiTag();
        tag17.tagId = 17;
        tag17.product = "Bastar Iron Craft";
        tag17.origin = "Chhattisgarh";
        tag17.isHandmade = true;
        tag17.isCertified = true;
        tag17.yearAwarded = "2008";
        tag17.getInformation();

        GiTag tag18 = new GiTag();
        tag18.tagId = 18;
        tag18.product = "Sankheda Furniture";
        tag18.origin = "Gujarat";
        tag18.isHandmade = true;
        tag18.isCertified = false;
        tag18.yearAwarded = "2007";
        tag18.getInformation();

        GiTag tag19 = new GiTag();
        tag19.tagId = 19;
        tag19.product = "Kangra Tea";
        tag19.origin = "Himachal Pradesh";
        tag19.isHandmade = false;
        tag19.isCertified = true;
        tag19.yearAwarded = "2009";
        tag19.getInformation();

        GiTag tag20 = new GiTag();
        tag20.tagId = 20;
        tag20.product = "Solapur Chaddar";
        tag20.origin = "Maharashtra";
        tag20.isHandmade = true;
        tag20.isCertified = true;
        tag20.yearAwarded = "2006";
        tag20.getInformation();

        System.out.println("MAIN ENDED");
    }
}
