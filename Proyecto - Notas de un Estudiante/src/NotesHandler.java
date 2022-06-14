
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NotesHandler {

    private static List<Note> noteList = null;
    private static Note note = null;

    public NotesHandler() {
        note = null;
        noteList = new ArrayList<>();
    }

    public static void add(Note note) {
        noteList.add(note);
    }

    public static void loadData() {
        try {
            Scanner reader = new Scanner(new File("note.txt"));
            while (reader.hasNext()) {
                String data[]=reader.nextLine().split(",");
                    System.out.println(data[0]);
                note = new Note(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]));
                noteList.add(note);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

    public static List<Note> getNoteList() {
        return noteList;
    }

    public static void saveData() {
        try {
            FileWriter writer = new FileWriter(new File("note.txt"));
            for (int i = 0; i < noteList.size(); i++) {
                note = noteList.get(i);
                writer.write(note.getName() + "," + note.getMath() + "," + note.getProgramming() + "," + note.getScience() + "," + note.getEnglish());
                if ((i + 1) != noteList.size()) {
                    writer.write("\n");
                }
            }
            writer.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

}
