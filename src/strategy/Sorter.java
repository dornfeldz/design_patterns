package strategy;

public class Sorter{
    private SortingStrategy strategy;

    public void setStrategy(SortingStrategy strategy){
        this.strategy = strategy;
    }

    public void sortNumbers(int[] numbers){
        strategy.sort(numbers);
    }

    public void getStrategy(QuickSort quickSort) {
    }
}
