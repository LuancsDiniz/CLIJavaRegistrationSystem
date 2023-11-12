package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.User;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<User> user = new ArrayList<>();

		System.out.print("Digite o caminho do arquivo: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			List<String> list = new ArrayList<>();

			while (line != null) {
				list.add(line);
				line = br.readLine();
			}

			list.forEach(System.out::println);

			System.out.println("Responda respectivamente as perguntas acima:");
			String name = sc.nextLine();
			String email = sc.nextLine();
			int age = sc.nextInt();
			double height = sc.nextDouble();

			user.add(new User(name, email, age, height));

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}
}
