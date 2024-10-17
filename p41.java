import java.io.*;
import java.util.*;

public class p41{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file name you want to scan: ");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        
        // Check if the file exists
        if (!file.exists()) {
            System.out.println("File does not exist.");
            return;
        }

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String[] keywords = new String[] {
            "abstract", "assert", "boolean", "break", "byte", "case", 
            "catch", "char", "class", "continue", "default", "do", 
            "double", "else", "enum", "extends", "final", "finally", 
            "float", "for", "if", "implements", "import", "instanceof", 
            "int", "interface", "long", "native", "new", "package", 
            "private", "protected", "public", "return", "short", 
            "static", "strictfp", "super", "switch", "synchronized", 
            "this", "throw", "throws", "transient", "try", "void", 
            "volatile", "while"
        };

        HashSet<String> keywordSet = new HashSet<>(Arrays.asList(keywords));
        String line;
        int count = 0;

        while ((line = br.readLine()) != null) {
            StringTokenizer tokenizer = new StringTokenizer(line, " +-/*%<>;:=&|!~()");

            while (tokenizer.hasMoreTokens()) {
                String token = tokenizer.nextToken();
                if (keywordSet.contains(token)) {
                    count++;
                }
            }
        }

        System.out.println("Total keywords are: " + count);
        br.close();
        sc.close();
    }
}
