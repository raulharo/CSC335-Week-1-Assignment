public class NineInts {
    public static void main (String args[]) {
        int[] numbers = {10, 15, 19, 23, 26, 29, 31, 34, 38};
        
        System.out.println("Contents of array from first to last:");
        for(int i : numbers){
            System.out.println(i);
        }

        System.out.println("Contents of array from last to first:");
        for(int i = numbers.length - 1; i > -1; i--){
            System.out.println(numbers[i]);
        }
    }
}
