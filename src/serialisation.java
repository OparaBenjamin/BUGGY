import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class serialisation {
    public static void main(String[] args){
        try(FileInputStream fi = new FileInputStream("people.bin")){
            ObjectInputStream os = new ObjectInputStream(fi);
            see[] pepz = (see[]) os.readObject();
            for(see pee: pepz){
                System.out.println(pee);
            }
            os.close();



        }catch (FileNotFoundException e){
            System.out.println("file not found");

        }catch (IOException e){
            System.out.println("ioException");
        } catch (ClassNotFoundException e) {
            System.out.println("its from here bitch");
        }


    }
}
