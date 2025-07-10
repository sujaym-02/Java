class Writer {
    public static void writeScript(String title) {
        System.out.println("Writer writing script for: " + title);
        CastingTeam.selectActors(title);
    }
}
