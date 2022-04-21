package day20_Array;

public class MinimalNumberOfArray {
    public static void main(String[] args) {

        int[] numbers={111,333,2222,333,112};
        int min =numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println(min);
    }
}
// Arrays.sort(numbers) kücükten büyüge sirayla dizilimini saglar.