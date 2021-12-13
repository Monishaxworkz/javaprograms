package com.xworkz.fuctional.president;

public class PresidentTester {

	public static void main(String[] args) {
		
		PresidentDto dto[] = new PresidentDto[50];
		
		dto[0] = new PresidentDto("Ram Nath Kovind", "76","India","Hindi");
		dto[1] = new PresidentDto("Joko Widodo", "60","Indonesia","Bahasa");
		dto[2] = new PresidentDto("Ali Khamenei", "82","Iran","Farsi");
		dto[3] = new PresidentDto("Barham Salih", "61","Iraq","Arabic and Kurdish");
		dto[4] = new PresidentDto("Ilham Meta", "52","Albania","Indo-European");
		dto[5] = new PresidentDto("Ilham Aliyev", "59","Azerbaijan","Azerbaijani");
		dto[6] = new PresidentDto("Alexander Van der Bellen", "77","Austria","German");
		dto[7] = new PresidentDto("Armen Sarksyan", "68","Armenia","Armenia");
		dto[8] = new PresidentDto("Ilham Aliyev", "59","Azerbaijan","Azerbaijan");
		dto[9]=new PresidentDto("Lazarus Chakwera","66","Malawi","English");
		 dto[10]=new PresidentDto("Abdul Hamid", "77","Bangladesh","Bengali");
		 dto[11]=new PresidentDto("Dame Sandra Mason","72","Barbados","English");
	     dto[12]=new PresidentDto("Alexander Lukashenko","67" ,"Belarus","Belarusian");
	     dto[13]=new PresidentDto("Rumen Radev","58","Bulgaria","Turkish");
		 dto[14]=new PresidentDto("Roch Marc Christian Kabore","64" ,"Burkina Faso","French");
	     dto[15]=new PresidentDto("Jose Maria Neves","61","Cape Verde","Portuguese");
		 dto[16]=new PresidentDto("Faustin-Archange Touadera[","64","Central African Republic"," French");
		 dto[17]=new PresidentDto("Felix Tshisekedi","58","Congo","Frech");
		 dto[18]=new PresidentDto("Zoran Milanovic","55" ,"Croatia","Standard Croatian");
		 dto[19]=new PresidentDto("Milos Zeman","77" ,"Czech Republic","Czech");
	     dto[20]=new PresidentDto("Ismail Omar Guelleh","74" ," Djibouti"," French and Arabic");
	     dto[21]=new PresidentDto("Charles Savarin","78" ,"Dominica","English");
	     dto[22]=new PresidentDto("Francisco Guterres","67","East Timor","Austronesian");
	     dto[23]=new PresidentDto("Abdel Fattah el-Sisi","67","Egypt","Modern Standard Arabic");
	     dto[24]=new PresidentDto("Nayib Bukele","40","El Salvador","Spanish");
	     dto[25]=new PresidentDto("Alar Karis","63"," Estonian","Estonia");
	     dto[26]=new PresidentDto("Sahle-Work Zewde","71","Ethiopia","Amharic");
	     dto[27]=new PresidentDto("Sauli Niinisto","73","Finland","Finnish and Swedish");
	     dto[28]=new PresidentDto("Salome Zourabichvili","69","Georgia","kartuli ena");
	     dto[29]=new PresidentDto("Abdrabbuh Mansur Hadi","76","Yemen","Arabic");
	     dto[30]=new PresidentDto("Frank-Walter Steinmeier","65","Germany","Indo-European");
	     dto[31]=new PresidentDto("Katerina Sakellaropoulou","69","Greece","Greek");
	     dto[32]=new PresidentDto("Umaro Sissoco Embalo","49","Guinea-Bissau","Portuguese");
     	 dto[33]=new PresidentDto("Janos Ader","62","Hungary","Hungarian");
	     dto[34]=new PresidentDto("Guoni Th. Johannesson","53","Iceland","Icelandic");
	     dto[35]=new PresidentDto("Isaac Herzog","61","Israel","Hebrew");
	     dto[36]=new PresidentDto("Egils Levits","66","Latvia","Latvian");
	     dto[37]=new PresidentDto("Michel Aoun","88","Lebanon","Arabic");
	     dto[38]=new PresidentDto("Gitanas Nauseda","57","Lithuania","Lithuanian");
	     dto[39]=new PresidentDto("Andry Rajoelina","47","Madagascar","French");
	     dto[40]=new PresidentDto("George Vella","65","Malta","Maltese");
	     dto[41]=new PresidentDto("Mohamed Ould Ghazouani","65","Mauritania","Arabic");
	     dto[42]=new PresidentDto("Prithvirajsing Roopun","62","Mauritius","English");
	     dto[43]=new PresidentDto("Maia Sandu","49","Moldova","Romanian");
	     dto[44]=new PresidentDto("Bidhya Devi Bhandari","60","Nepal","Nepali");
	     dto[45]=new PresidentDto("Mohamed Bazoum","61","Niger","French");
	     dto[46]=new PresidentDto("Stevo Pendarovski","58","North Macedonia","Albanian");
	     dto[47]=new PresidentDto("Mahmoud Abbas","86","Palestine","Arabic");
	     dto[48]=new PresidentDto("Klaus Iohannis","62","Romania","Romanian");
	     dto[49]=new PresidentDto("Vladimir Putin","69","Russia","Russian");
	     
		PresidentDao dao = new PresidentDao();
		for(int i=0;i<=49;i++) {
			dao.add(dto[i]);
		}
		System.out.println(dao.find((dto1,str)->(dto1.getName()).equalsIgnoreCase(str),"Mahmoud Abbas"));
		System.out.println(dao.find((dto2, str)->(dto2.getName()).startsWith(str),"R"));
	}
}
