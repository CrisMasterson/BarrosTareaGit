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
    public String methodReverse2(){
        String methodReverse2 = "";
        for(int i= name.length() - 1; i>=0; i--){
            methodReverse2 += name.charAt(i);
        }
        return methodReverse2;
    }
}