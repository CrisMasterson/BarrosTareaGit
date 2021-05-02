import java.util.Locale;

public class Name {
    private String name;

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int methodReturn1(){
        int count = name.length();
        return count;
    }
}