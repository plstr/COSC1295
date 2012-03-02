import java.util.Scanner;

public class IORead {
    
    public String readInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public Integer readInt(){
        return Integer.parseInt(readInput);
    }
}
