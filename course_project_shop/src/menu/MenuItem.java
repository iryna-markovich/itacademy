package menu;
import exceptions.ArrayIndexOutOfBoundsException;

public interface MenuItem{
    String getName();

    void run() throws ArrayIndexOutOfBoundsException;
}
