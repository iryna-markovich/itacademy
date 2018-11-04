package by.itacademy.training;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("doc.txt");
        file.createNewFile();
        long millisec = file.lastModified();
        Date dt = new Date(millisec);
        System.out.println(file.getParent());
        System.out.println(file.getAbsolutePath());
        System.out.println(dt);
        System.out.println(file.getTotalSpace());
        System.out.println(file.length());
        System.out.println("____________________________________");
        InputStream readFile = new FileInputStream(file);
        int size = readFile.available();
        for (int i = 0; i < size; i++) {
            System.out.print((char) readFile.read());
        }
        readFile.close();



//        int arrSize = 2;
//        for (int j = 0; j <= (file.length() / arrSize); j++) {
//            byte[] bs = new byte[arrSize];
//            readFile.read(bs);
//            System.out.print(new String(bs));
//        }
//
//        OutputStream output = new FileOutputStream("file.txt");
//        String str = "Сережа - будущий архитектор";
//        System.out.println("Сережа - будущий архитектор!!!!");
//
//        byte[] bytes = str.getBytes();
//        for (int i = 0; i < bytes.length; i = i + 1 + bytes.length / 3) {
//            byte[] t = Arrays.copyOfRange(bytes, i, i + 1 + bytes.length / 3);
//            output.write(t);
//        }

        SmthObj smthObj_1 = new SmthObj(true, 2222);
        SmthObj smthObj_2 = new SmthObj(false, 3333);

        List<SmthObj> arrayList = new ArrayList();
        arrayList.add(smthObj_1);
        arrayList.add(smthObj_2);

        DataOutputStream out = new DataOutputStream(new FileOutputStream("doc.txt"));
        for (SmthObj item : arrayList) {
            out.writeLong(item.getSmthLong());
            out.writeBoolean(item.isSmthBoolean());
        }
    }
}

