class ChatShop{

	static String pan = "PANI PURI";
	static String bhe = "BHEL PURI";
	static String sev = "SEV PURI";
	static String da = "DAHI PURI";
	static String va = "VADA";
	static String aloo = "ALOO CHAT";
	static String sam = "SAMOOSA CHAT";
	static String pa = "PAPDI CHAT";
	static String mas = "MASALA PURI";
	static String ka = "KACHORI CHAAT";  
	static String chats[] = {pan, bhe, sev, da, va, aloo, sam, pa, mas, ka  };

	public static void main (String names[]){

		//System.out.println("THE CHAT ITEMS AVAILABLE ARE : " + chats[0] + ", " + chats[1] + ", " + chats[2] + ", " + chats[3] + ", " + chats[4] + ", " + chats[5] + ", " + chats[6] + ", " + chats[7] + ", " + chats[8] + ", " + chats[9] + "\n");

		for(String chat : chats){
		System.out.println(chat);

}

}

}