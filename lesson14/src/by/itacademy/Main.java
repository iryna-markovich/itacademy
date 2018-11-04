package by.itacademy;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Gson().fromJson(json, Hospital.class);
    }
}
