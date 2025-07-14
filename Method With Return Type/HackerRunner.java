class HackerRunner {

    public static void main(String args[]) {

        System.out.println("MAIN STARTED\n");

        String alias = Hacker.getAlias();
        System.out.println("Hacker Alias: "+alias+"\n");

        String skillLevel = Hacker.getSkillLevel();
        System.out.println("Skill Level: " +skillLevel+"\n");

        String specialization = Hacker.getSpecialization();
        System.out.println("Specialization: " +specialization+"\n");

        boolean isEthical = Hacker.getIsEthical();
        System.out.println("Is Ethical Hacker?: " +isEthical+"\n");

        int experience = Hacker.getYearsOfExperience();
        System.out.println("Years of Experience: " +experience+"\n");

        String tool = Hacker.getToolUsed();
        System.out.println("Preferred Tool: " +tool+"\n");

        System.out.println("MAIN ENDED");
    }
}
