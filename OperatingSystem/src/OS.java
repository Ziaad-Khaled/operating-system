import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class OS {
    static Hashtable<String, Object> stringToCorrespondingValue = new Hashtable<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your program name: ");
        String programName = in.nextLine();
        System.out.println("Name is: " + programName);
        try
        {
            File file=new File(programName);
            FileReader fr=new FileReader(file);
            BufferedReader br=new BufferedReader(fr);

            String line;
            while((line=br.readLine())!=null)
            {
                System.out.println("--------");
                Vector<String> lineTokenizer = new Vector<>();
                StringTokenizer st = new StringTokenizer(line," ");
                while(st.hasMoreTokens())
                {
                    lineTokenizer.add(st.nextToken());
                }
                // now I have each line in a vector
                switch(lineTokenizer.get(0)) {
                    case "assign":

                        switch (lineTokenizer.get(2))
                        {
                            case "input":
                                // first case: assign value to input
                                System.out.print("Assign a value to" + " '" + lineTokenizer.get(1) + "' " +"\n" + "Enter your value please: ");
                                String value = in.nextLine();
                                System.out.println("value: " + value);
                                break;
                            case "readFile":
                                // second case: assign value to readFile
                                System.out.println("Assigning a value to" + " '" + lineTokenizer.get(1) + "' " + "from reading file"+ " '" + lineTokenizer.get(3) + "' ");
                                break;
                            default:
                                System.out.println("Invalid System Call");

                        }

                        break;
                    case "print":
                        print(lineTokenizer.get(1));
                        break;
                    case "add":
                        // add two values
                        System.out.println( " '" + lineTokenizer.get(1) + "' " +"+" + " '" + lineTokenizer.get(2) + "' " + "=");
                        break;
                    case "writeFile":
                        //writeFile x y, where x is the filename and y is the data
                        System.out.println( "writing the data in "+ " '" + lineTokenizer.get(2) + "' " +"to" + " '" + lineTokenizer.get(1) + "' ");
                        break;
                    case "readFile":
                        //readFile x, where x is the filename
                        System.out.println( "reading the data in "+ " '" + lineTokenizer.get(1) + "' " );
                        break;
                    default:
                        System.out.println("Invalid System Call");
                }

            }
            fr.close();
            in.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void print(String s) {
        if(stringToCorrespondingValue.get(s)==null)
            System.out.println(s);
        else
        {
            System.out.println(s + " = " + stringToCorrespondingValue.get(s));
        }
    }
}

