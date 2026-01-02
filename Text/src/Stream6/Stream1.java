package Stream6;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream1 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("clic");
        list.add("cli");
        list.add("clxi");
        list.add("zli");

        list.stream().filter(name->name.startsWith("c")).filter(name->name.length()==4).forEach(name-> System.out.println(name));
    }
}
