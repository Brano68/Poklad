package readandwriteobjectfromthefile;

import java.io.*;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) throws Exception {
        //write();
        //print();
        System.out.println("Vysledok je: " + print());
        for(int i = 0; i < 3; i++){
            System.out.println("POkracujem dalekj");
        }
        //
    }


    public static void write(){
        Notebook notebook1 = new Notebook("Lenovo", 555, true);
        Notebook notebook2 = new Notebook("Hp", 888, true);
        Notebook notebook3 = new Notebook("Acer", 444, true);

        File fileObject = new File("output/notebook.ser");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileObject))) {
            oos.writeObject(notebook1);
            oos.writeObject(notebook2);
            oos.writeObject(notebook3);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static int print(){
        File fileObject = new File("output/notebook.ser");
        int pocitadloo = 0;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileObject))){
            //Notebook notebook = (Notebook) ois.readObject();
            //
            //System.out.println(ois.readBoolean());
/*
            while (ois != null){
                    Notebook notebook1 = (Notebook) ois.readObject();
                    System.out.println(notebook1);
            }


 */

            Object obj = null;
            while(!(obj = ois.readObject()).equals(null)){
                if(obj instanceof Notebook){
                    System.out.println(((Notebook)obj).toString());
                    pocitadloo++;
                }
            }

            //System.out.println(notebook);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException e){
            System.out.println("Koniec dlzky pola");
        }
        catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            return pocitadloo;
        }
    }
}
