package variaveis;

public class TipoString {

	public static void main(String[] args) {
		
		String email = "lUcAsAbrEu@hotmail.com";
		System.out.println("Original:" + email);
		System.out.println("Minuscula:" + email.toLowerCase());
		System.out.println("Maiuscula: " + email.toUpperCase());
		System.out.println("Qntde de caracteres: " + email.length());	
		System.out.println("? igual: " + email.equals("lUcAsAbrEU@hotmail.com"));
		System.out.println("? igual: " + email.equalsIgnoreCase("lucasabreu@hotmail.com"));
		System.out.println("Cont?m: " + email.contains("@"));
		System.out.println("Posi??od o @: " + email.indexOf("@"));
		System.out.println("Do 3 ate o 5:" + email.substring(2,4));
		
		if (email.contains("@") == true) {
		
		
				//System.out.println("Do 3 ate o 5:" + email.substring(0,email.indexOf("@")));
			
				System.out.println("Usuario: " + email.substring(0,email.indexOf("@")));				
		
	}
		
		
	
	}
}

