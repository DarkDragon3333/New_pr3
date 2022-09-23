import java.util.ArrayList;

public class Tester {
    int c = 5;
    double max = 0, min = 0;
    ArrayList<Circle> arr = new ArrayList<>(c);

    void MaxCircle(int Size) {
        for (int i = 0; i < Size; i++) {
            if (max < arr.get(i).GetCircle()) max = arr.get(i).GetCircle();
        }
        System.out.println(max);
    }

    void MinCircle(int Size) {
        min = arr.get(1).GetCircle();
            for (int j = 0; j < Size; j++) {
                if (min > arr.get(j).GetCircle()) min = arr.get(j).GetCircle();
            }
        System.out.println(min);
    }
}


