import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        ArrayList<Integer> lote1 = (new FileReader("./lote01.txt")).read();
        System.out.println("La cantidad de inversiones del lote 1 es de: " + Counter.count(lote1));
        ArrayList<Integer> lote2 = (new FileReader("./lote02.txt")).read();
        System.out.println("La cantidad de inversiones del lote 2 es de: " + Counter.count(lote2));
        ArrayList<Integer> lote3 = (new FileReader("./lote03.txt")).read();
        System.out.println("La cantidad de inversiones del lote 3 es de: " + Counter.count(lote3));
    }
}
