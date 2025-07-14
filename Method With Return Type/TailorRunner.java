class TailorRunner {

    public static void main(String args[]) {

        System.out.println("MAIN STARTED\n");

        String name = Tailor.getName();
        System.out.println("Tailor Name: " +name+"\n");

        int experience = Tailor.getYearsOfExperience();
        System.out.println("Experience: " +experience+" years\n");

        String specialization = Tailor.getSpecialization();
        System.out.println("Specializes in : "+specialization+"\n");

        String location = Tailor.getShopLocation();
        System.out.println("Shop Location: " +location+"\n");

        boolean homeService = Tailor.getOffersHomeService();
        System.out.println("Offers Home Service?: "+homeService+"\n");

        double charge = Tailor.getStitchingCharge();
        System.out.println("Stitching Charge: "+charge+"rs\n");

        System.out.println("MAIN ENDED");
    }
}
