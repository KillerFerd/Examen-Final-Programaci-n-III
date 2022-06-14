
public class Note {

    private String name;
    private int math;
    private int programming;
    private int science;
    private int English;

    public Note() {
    }

    public Note(String name, int math, int programming, int science, int English) {
        this.name = name;
        this.math = math;
        this.programming = programming;
        this.science = science;
        this.English = English;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getProgramming() {
        return programming;
    }

    public void setProgramming(int programming) {
        this.programming = programming;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int English) {
        this.English = English;
    }
    
    
}
