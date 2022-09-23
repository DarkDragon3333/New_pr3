import java.util.Random;
public class Main {

    public void Test(){
        Point A = new Point(1, 2);
        Point B = new Point(2, 3);
        Point c = new Point(4, 5);
        Point D = new Point(6, 7);
        Circle C = new Circle(A, 6.9);
        Circle b = new Circle(B, 7.9);
        Circle n = new Circle(c, 8.9);
        Circle m = new Circle(D, 5.9);
        Tester t = new Tester();
        t.arr.add(C);
        t.arr.add(b);
        t.arr.add(n);
        t.arr.add(m);
        t.MaxCircle(4);
        t.MinCircle(4);
    }

    public static void main(String[] args) {
        Random rand = new Random();
        double[] arr = new double[5];
        double temp;
        Main t = new Main();

        for (int i = 0; i < 5; i++){
            arr[i] = rand.nextInt(100);
            if (i == 4) System.out.println();
            else System.out.print(arr[i] + " ");
        }

       for (int i = 0; i < 5; i++){
           for (int j = i; j < 5; j++){
               if(arr[i] > arr[j]){
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
           }
           if (i == 4) System.out.println();
           else System.out.print(arr[i] + " ");
       }

        System.out.println();
        for (int i = 0; i < 5; i++){
            arr[i] =  Math.random();
            if (i == 4) System.out.println();
            else System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < 5; i++){
            for (int j = i; j < 5; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            if (i == 4) System.out.println();
            else System.out.print(arr[i] + " ");
        }

        t.Test();
    }

}
