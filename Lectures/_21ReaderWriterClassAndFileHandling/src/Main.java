
import java.io.*;
import java.nio.Buffer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        try(BufferedReader fr = new BufferedReader(new FileReader("file.txt"))){
//            System.out.println(fr.readLine());
//        } catch (IOException e){
//            System.out.println(e.getMessage());
//        }
//        try(InputStreamReader r = new InputStreamReader(System.in)){
//            System.out.println((char)r.read());
//        } catch (IOException e){
//            System.out.println(e.getMessage());
//        }
//        try(BufferedReader r = new BufferedReader(new StringReader("this is a string"))){
//            System.out.println(r.readLine());
//        } catch (IOException e){
//            System.out.println(e.getMessage());
//        }

        //Actual file handling
        try{
            File fo = new File("new-file.txt");
            fo.createNewFile();
            //the fo.delete() returns boolean value
//            if(fo.delete()){
//                System.out.println("Deleted the file "+fo.getName());
//            }
        } catch(IOException e){
            System.out.println(e.getMessage());
        }

        try(FileWriter fw = new FileWriter("new-file.txt")){
            fw.write("This is written by the file writer.");
            fw.append(" This should be appended");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        try(BufferedReader fr = new BufferedReader(new FileReader("new-file.txt"))){
            System.out.println(fr.readLine());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
