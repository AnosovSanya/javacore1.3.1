import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		StringBuilder log = new StringBuilder();

		File games = new File("..//javacore1.3.1//Games");
		if (games.mkdir()) {
			log.append("Каталог Games успешно создан\n");
		} else {
			log.append("Каталог Games не создан\n");
		}


		File src = new File("..//javacore1.3.1//Games//src");
		if (src.mkdir()) {
			log.append("Каталог src в games успешно создан\n");
		} else {
			log.append("Каталог src не создан\n");
		}


		File res = new File("..//javacore1.3.1//Games//res");
		if (res.mkdir()) {
			log.append("Каталог res в games успешно создан\n");
		} else {
			log.append("Каталог res не создан\n");
		}


		File savegames = new File("..//javacore1.3.1//Games//savegames");
		if (savegames.mkdir()) {
			log.append("Каталог savegames в games успешно создан\n");
		} else {
			log.append("Каталог savegames не создан\n");
		}


		File temp = new File("..//javacore1.3.1//Games//temp");
		if (temp.mkdir()) {
			log.append("Каталог temp в games успешно создан\n");
		} else {
			log.append("Каталог temp не создан\n");
		}


		File main = new File("..//javacore1.3.1//Games//src//main");
		if (main.mkdir()) {
			log.append("Каталог main в src успешно создан\n");
		} else {
			log.append("Каталог main не создан\n");
		}


		File test = new File("..//javacore1.3.1//Games//src//test");
		if (test.mkdir()) {
			log.append("Каталог test в src успешно создан\n");
		} else {
			log.append("Каталог test не создан\n");
		}


		File mainFile = new File("..//javacore1.3.1//Games//src//main", "Main.java");
		try {
			if (mainFile.createNewFile()) {
				log.append("Файл Main.java в папке main успешно создан\n");
			}
		} catch (IOException ex) {
			log.append("Файл Main.java не создан\n");
		}


		File utilsFile = new File("..//javacore1.3.1//Games//src//main", "Utils.java");
		try {
			if (utilsFile.createNewFile()) {
				log.append("Файл Utils.java в папке main успешно создан\n");
			}
		} catch (IOException ex) {
			log.append("Файл Utils.java не создан\n");
		}


		File drawables = new File("..//javacore1.3.1//Games//res//drawables");
		if (drawables.mkdir()) {
			log.append("Каталог drawables в res успешно создан\n");
		} else {
			log.append("Каталог drawables не создан\n");
		}

		File vectors = new File("..//javacore1.3.1//Games//res//vectors");
		if (vectors.mkdir()) {
			log.append("Каталог vectors в res успешно создан\n");
		} else {
			log.append("Каталог vectors не создан\n");
		}

		File icons = new File("..//javacore1.3.1//Games//res//icons");
		if (icons.mkdir()) {
			log.append("Каталог icons в res успешно создан\n");
		} else {
			log.append("Каталог icons не создан\n");
		}


		File tempFile = new File("..//javacore1.3.1//Games//temp", "temp.txt");
		try {
			if (tempFile.createNewFile()) {
				log.append("Файл temp.txt в папке temp успешно создан\n");
			}
		} catch (IOException ex) {
			log.append("Файл temp.txt не создан\n");
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("..//javacore1.3.1//Games//temp//temp.txt"))) {
			bw.write(log.toString());
			System.out.println("Данные в файл temp.txt успешно записаны.");
		} catch (IOException ex) {
			System.out.println("Записать данные в файл temp.txt не удалось.");
		}

	}
}
