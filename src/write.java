import java.io.*;

public class write {
    public static void main(String[] args){
    System.out.println("wriring objects...");

        see[] seeer = {new see(1,"sue"), new see(8,"mike"), new see(9,"bob")};
        try(FileOutputStream fr = new FileOutputStream("people.bin")){
            ObjectOutputStream os = new ObjectOutputStream(fr);

            os.writeObject(seeer);
            os.close();


        } catch (FileNotFoundException e){
            System.out.println("file not foundWrite");
        } catch (IOException e){
            System.out.println("ioe exeption");

        }

        }


    }
