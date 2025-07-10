class CastingTeam {
    public static void selectActors(String title) {
        System.out.println("Casting Team selecting actors for: " + title);
        Crew.manageProduction(title);
    }
}
