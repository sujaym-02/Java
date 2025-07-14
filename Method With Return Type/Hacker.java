class Hacker {

    static String alias;
    static String skillLevel;
    static String specialization;
    static boolean isEthical;
    static int yearsOfExperience;
    static String toolUsed;

    public static String getAlias() {
        alias = "ShadowByte";
        return alias;
    }

    public static String getSkillLevel() {
        skillLevel = "Expert";
        return skillLevel;
    }

    public static String getSpecialization() {
        specialization = "Network Penetration";
        return specialization;
    }

    public static boolean getIsEthical() {
        isEthical = false;
        return isEthical;
    }

    public static int getYearsOfExperience() {
        yearsOfExperience = 6;
        return yearsOfExperience;
    }

    public static String getToolUsed() {
        toolUsed = "Metasploit";
        return toolUsed;
    }
}
