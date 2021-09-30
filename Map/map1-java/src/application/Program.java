package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
	public static void main(String[] args) {
		Map<String, String> cookies = new TreeMap<>();
		// TreeMap ordena o Map, neste caso ele vai ordenar por ordem alfabética
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "98123456");
		
		cookies.remove("email");
		
		cookies.put("phone", "98123455");
		// Como o Map não aceita repetições na chave ele vai sobreescrever o dado inserido
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		
		
		
		System.out.println("ALL COOKIES: ");
		for(String key: cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}
}
