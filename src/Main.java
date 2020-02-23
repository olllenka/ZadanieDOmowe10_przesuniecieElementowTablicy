public class Main {
    public static void main(String[] args) {
        System.out.println("Pierwsza tablica testowa");
        int[] array = {0,1,2,3,4,5,6,7,8,9};
        int n =3;
        ArrayUtils.printElements(array);
        int[] movedArray = ArrayUtils.moveElements(n, array);
        ArrayUtils.printElements(array);
        ArrayUtils.printElements(movedArray);

        System.out.println("Druga tablica testowa");
        int[] array2 = {-4,-5,-6,-7,-8,-9};
        int n2 =15;
        ArrayUtils.printElements(array2);
        int[] movedArray2 = ArrayUtils.moveElements(n2, array2);
        ArrayUtils.printElements(array2);
        ArrayUtils.printElements(movedArray2);

    }

}
