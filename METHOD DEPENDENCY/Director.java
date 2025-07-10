class Director {
    public static void plan(String title) {
        System.out.println("Director planning scenes for movie: " + title);
        Writer.writeScript(title);
    }
}
