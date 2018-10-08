package lesson4.by.itacademy.hospital;

public class Main {
    public static void main(String[] args) {
        HospitalList hospitalList = new HospitalList(2);
        hospitalList.input();
        hospitalList.output();
        hospitalList.search(5);
    }
}
