public class ArrayUtils {

    public static int[] moveElements(int n, int[] array) {
        if(array==null)
            return null;
        if(n>=array.length)
            return array;
        else {
            int[] movedArray = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                if (i + n < array.length)
                    movedArray[i + n] = array[i];
                else
                    movedArray[i + n - array.length] = array[i];
            }
            return movedArray;
        }
    }

    public static void printElements(int[] array) {
        for(int i=0; i<array.length-1; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length-1] + "\n");
    }
}
