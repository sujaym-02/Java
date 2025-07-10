class Producer {
    public static void project(String title) {
        System.out.println("Producer started the movie project: " + title);
        Director.plan(title);
    }
}
