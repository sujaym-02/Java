class RiverRunner {

    public static void main(String args[]) {

        System.out.println("MAIN STARTED\n");

        String name = River.getName();
        System.out.println("River Name: "+name+"\n");

        String origin = River.getOrigin();
        System.out.println("Origin: "+origin+"\n");

        String endsAt = River.getEndsAt();
        System.out.println("Ends At: "+endsAt+"\n");

        double length = River.getLength();
        System.out.println("Length: " +length+" km\n");

        boolean isPolluted = River.getIsPolluted();
        System.out.println("Is Polluted?: "+isPolluted+"\n");

        boolean supportsBoating = River.getSupportsBoating();
        System.out.println("Supports Boating?: " +supportsBoating+"\n");

        System.out.println("MAIN ENDED");
    }
}
