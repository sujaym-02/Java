class SignalRunner {

    public static void main(String signals[]) {

        System.out.println("MAIN STARTED\n");

        String type = Signal.getType();
        System.out.println("The type of the signal is: " + type + "\n");

        double frequency = Signal.getFrequency();
        System.out.println("The frequency of the signal is: " + frequency + "GHz\n");

        int range = Signal.getRange();
        System.out.println("The range of the signal is: " + range + "meter\n");

        boolean isActive = Signal.getIsActive();
        System.out.println("Is the signal active?: " + isActive + "\n");

        int powerLevel = Signal.getPowerLevel();
        System.out.println("The power level of the signal is: " + powerLevel + "%\n");

        boolean isEncrypted = Signal.getIsEncrypted();
        System.out.println("Is the signal encrypted?: " + isEncrypted + "\n");

        System.out.println("MAIN ENDED");
    }
}
