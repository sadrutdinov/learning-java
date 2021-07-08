package pro.chapter14;

public class Stats <Type extends Number> {
    Type[] nums;

    public Stats(Type[] nums) {
        this.nums = nums;
    }

    double average() {
        double sum = 0.0;

        for (int i = 0; i < nums.length ; i++) {
            sum += nums[i].doubleValue();
        }

        return sum / nums.length;

    }

    boolean sameAvg(Stats<?> ob) {
        return average() == ob.average();
    }
}

class StatsDemo {
    public static void main(String[] args) {
        Double[] nums = {1.0, 2.0, 3.0, 4.0, 5.0};
        Stats<Double> stats = new Stats<>(nums);

        Integer[] nums2 = {1, 2, 3, 4, 5};
        Stats<Integer> stats2 = new Stats<>(nums2);

        System.out.println(stats.average());
        System.out.println(stats.sameAvg(stats2));
    }
}
