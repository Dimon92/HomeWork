package HomeWorks3;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.NoSuchFileException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CommandPrompt {
	public static void main(String[] args) {
		Path dir = Paths.get("C:\\");
		String inputtext = "";
		Scanner sc = new Scanner(System.in);
		while (!inputtext.equals("exit")) {
			inputtext = sc.nextLine();
			if (inputtext.substring(0, 2).equals("cd")) {
				try {dir = Paths.get(inputtext.substring(3));
					System.out.print(dir.toString() + ">");
				} catch (StringIndexOutOfBoundsException e) {
					System.out.println("No such directory");
				}
			}
			if (inputtext.equals("ls -f")) {
				try (DirectoryStream<Path> stream = Files.newDirectoryStream(
						dir, "*.*")) {
					for (Path file : stream) {
						System.out.println(file.getFileName());
					}
				} catch (IOException | DirectoryIteratorException x) {
					System.err.println(x);
				}
			}
			if (inputtext.equals("ls -d")) {
				try (DirectoryStream<Path> stream = Files
						.newDirectoryStream(dir)) {
					for (Path file : stream) {
						if (Files.isDirectory(file)) {
							System.out.println(file.getFileName());
						}
					}
				} catch (IOException | DirectoryIteratorException x) {
					System.err.println(x);
				}
			}
			if (inputtext.equals("ls")) {
				try (DirectoryStream<Path> stream = Files
						.newDirectoryStream(dir)) {
					for (Path file : stream) {

						System.out.println(file.getFileName());

					}
				} catch (IOException | DirectoryIteratorException x) {
					System.err.println(x);
				}
			}
			if (inputtext.equals("help")) {
				System.out.println("¬ведите 'exit' дл€ выхода");
				System.out
						.println("¬ведите 'ls -f' дл€ просмотра файлов в текущей папке");
				System.out
						.println("¬ведите 'ls -d' дл€ просмотра папок в текущей папке");
				System.out.println("¬ведите 'cd' дл€ перехода к папке");
			}
		}
	}
}