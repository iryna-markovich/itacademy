package it.academy.lesson19;

public class Plumber {
    private String name;
    private int experience;
    private boolean fresh;

    public Plumber(String name, int experience, boolean fresh) {
        this.name = name;
        this.experience = experience;
        this.fresh = fresh;
    }

    @Override
    public String toString() {
        return "Plumber{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                ", fresh=" + fresh +
                '}';
    }
}
