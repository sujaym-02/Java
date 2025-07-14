class BannerRunner{

	public static void main(String banners[]){

	System.out.println("MAIN STARTED\n");

	String message = Banner.getMessage();
	System.out.println("the message on the banner is : "+message+"\n");

	String  color= Banner.getColor();
	System.out.println("the colr of the banner is : "+color+"\n");

	int width = Banner.getWidth();
	System.out.println("The width of the Banner is : "+width+ "inch\n");

	int  height= Banner.getHeight();
	System.out.println("The Height of thr banner is : "+height+ "inch\n"); 

	String material = Banner.getMaterial();
	System.out.println("The Material of the banner is : "+material+"\n");

	boolean isReusable = Banner.getIsReusable();
	System.out.println("Whether the Banner can be re used : "+isReusable+"\n");

	System.out.println("MAIN ENDED");
}


}