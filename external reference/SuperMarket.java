class SuperMarket{

        static String van= "Vanila ";
        static String cho= "Choclate ";
        static String stra= "Strawberry ";
        static String berr= "BerryMix ";
        static String dry= "DryFruit ";
        static String tend= "Tender Coconut ";
        static String chikk= "Chikku ";
        static String man= "Mango ";
        static String pin= "Pinapple ";
        static String butt= "butterScotch ";

        static String dio= "Dior Sauvage";
        static String chan= "Chanel No. 5";
        static String cree= "Creed Aventus";
        static String guc= "Gucci Bloom";
        static String ysl= "YSL Black Opium";
        static String arm=  "Armani Acqua di Gio";
        static String tom= "Tom Ford Oud Wood";
        static String ver= "Versace Eros";
        static String bur=  "Burberry Her";
        static String ck= "CK One";

        static String ri= "Rice";
        static String whe=  "Wheat Flour";
        static String su=  "Sugar";
        static String sa=  "Salt";        
	static String oil= "Cooking Oil";
        static String spi= "Spices";
        static String tea= "Tea";
        static String coff=  "Coffee";
        static String mil= "Milk Powder";

        static String lip= "Lipstick";
        static String foun= "Foundation";
        static String eye= "Eyeliner";
        static String mas= "Mascara";
        static String blu= "Blush";
        static String face= "Face Powder";
        static String prim= "Primer";
        static String comp= "Compact";
        static String bb= "BB Cream";
        static String high= "Highlighter";


	static String iceCreams[] = {van, cho, stra, berr, dry, tend, chikk, man, pin, butt};
	static String perfumes[]  = {dio, chan, cree, guc, ysl, arm, tom, ver, bur, ck};
	static String groceries[] = {ri, whe, su, sa, oil, spi, tea, coff, mil};
	static String cosmetics[] = {lip, foun, eye, mas, blu, face, prim, comp, bb, high};

	public static void main(String items[]){
		/* System.out.println("THE ICE CREAMS AVAILABLE ARE : " + iceCreams[0] + " " + iceCreams[1] + " " + iceCreams[2] + " " + iceCreams[3] + " " + iceCreams[4] + " " + iceCreams[5] + " " + iceCreams[6] + " " + iceCreams[7] + " " + iceCreams[8] + " " + iceCreams[9] + " \n");
		System.out.println("THE PERFUMES AVAILABLE ARE : " + perfumes[0] + ", " + perfumes[1] + ", " + perfumes[2] + ", " + perfumes[3] + ", " + perfumes[4] + ", " + perfumes[5] + ", " + perfumes[6] + ", " + perfumes[7] + ", " + perfumes[8] + ", " + perfumes[9] + " \n");
		System.out.println("THE GROCERIES AVAILABLE ARE : " + groceries[0] + ", " + groceries[1] + ", " + groceries[2] + ", " + groceries[3] + ", " + groceries[4] + ", " + groceries[5] + ", " + groceries[6] + ", " + groceries[7] + ", " + groceries[8] + ", " + groceries[9] + "\n");
		System.out.println("THE COSMETICS AVAILABLE ARE : " + cosmetics[0] + ", " + cosmetics[1] + ", " + cosmetics[2] + ", " + cosmetics[3] + ", " + cosmetics[4] + ", " + cosmetics[5] + ", " + cosmetics[6] + ", " + cosmetics[7] + ", " + cosmetics[8] + ", " + cosmetics[9] + "\n"); */


	for(String ice : iceCreams){
	System.out.println(ice);
}

	for(String perf : perfumes){
	System.out.println(perf);
}
	for(String gro : groceries){
	System.out.println(gro);
}
	for(String cos : cosmetics){
	System.out.println(cos);
}




}

}