package dictionary;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class SaveableDictionary {
    private HashMap<String, String> dictionary;
    private String filename;
    private String f = "hello.txt";

    public SaveableDictionary() {
        dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        dictionary = new HashMap<>();
        this.filename = file;
    }

    public boolean load() {
        try {
            Files.lines(Paths.get(filename))
                    .map(row -> row.split(":"))
                    .filter(parts -> parts.length >= 2)
                    .forEach(parts -> this.add(parts[0],parts[1]));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean save() {
        File file = new File(f);

        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file, true)))) {
            dictionary.keySet()
                    .forEach(key -> pw.println(key + ":" + dictionary.get(key)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void add(String words, String translation) {
        if (!dictionary.containsKey(words)) {
            dictionary.put(words, translation);
        }
    }

    public String translate(String word) {
        if (dictionary.containsKey(word)) {
            return dictionary.get(word);
        }

        return null;
    }

    public void delete(String word) {
        dictionary.remove(word);
    }
}
