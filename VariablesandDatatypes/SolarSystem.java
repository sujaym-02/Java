class SolarSystem {

    static int totalPlanets = 8;
    static int dwarfPlanets = 5;
    static boolean hasAsteroidBelt = true;
    static boolean hasKuiperBelt = true;
    static String centralStar = "Sun";
    static double ageBillionYears = 4.6;
    static boolean hasMoons = true;
    static int totalMoons = 290;
    static boolean hasComets = true;
    static boolean hasOortCloud = true;

	public static void main (String solar[]){

    String largestPlanet = "Jupiter";
    String smallestPlanet = "Mercury";
    boolean earthSupportsLife = true;
    String hottestPlanet = "Venus";
    String coldestPlanet = "Neptune";
    boolean hasArtificialSatellites = true;
    int knownComets = 3000;
    boolean sunProducesSolarFlare = true;
    boolean hasRingsSystem = true;
    boolean exploredByHumans = true;


        System.out.println("Total Planets: " + totalPlanets);
        System.out.println("Dwarf Planets: " + dwarfPlanets);
        System.out.println("Asteroid Belt Present: " + hasAsteroidBelt);
        System.out.println("Kuiper Belt Present: " + hasKuiperBelt);
        System.out.println("Central Star: " + centralStar);
        System.out.println("Age: " + ageBillionYears + " Billion Years");
        System.out.println("Moons Present: " + hasMoons);
        System.out.println("Total Moons: " + totalMoons);
        System.out.println("Comets Present: " + hasComets);
        System.out.println("Oort Cloud Present: " + hasOortCloud);
        System.out.println("Largest Planet: " + largestPlanet);
        System.out.println("Smallest Planet: " + smallestPlanet);
        System.out.println("Earth Supports Life: " + earthSupportsLife);
        System.out.println("Hottest Planet: " + hottestPlanet);
        System.out.println("Coldest Planet: " + coldestPlanet);
        System.out.println("Artificial Satellites: " + hasArtificialSatellites);
        System.out.println("Known Comets: " + knownComets);
        System.out.println("Sun Produces Solar Flares: " + sunProducesSolarFlare);
        System.out.println("Has Ring Systems: " + hasRingsSystem);
        System.out.println("Explored By Humans: " + exploredByHumans);
    }
}