import java.util.ArrayList;
import java.util.Collections;

public class Counter
{
    public static Long count(ArrayList<Integer> numbers)
    {
        if (numbers.size() == 1) return 0L;
        ArrayList<Integer> array1 = new ArrayList<>(numbers.subList(0, numbers.size() / 2));
        ArrayList<Integer> array2 = new ArrayList<>(numbers.subList((numbers.size() / 2), numbers.size()));
        Long x = count(array1);
        Long y = count(array2);
        Collections.sort(array1);
        Collections.sort(array2);
        Long z = countSplitInversions(array1, array2);
        return x + y + z;
    }

    private static Long countSplitInversions(ArrayList<Integer> array1, ArrayList<Integer> array2)
    {
        Long c = 0L;
        for (Integer numberArray1: array1)
        {
            int cAux = 0;
            while (array2.size() > cAux && numberArray1 > array2.get(cAux))
            {
                c++;
                cAux++;
            }
        }
        return c;
    }
}
