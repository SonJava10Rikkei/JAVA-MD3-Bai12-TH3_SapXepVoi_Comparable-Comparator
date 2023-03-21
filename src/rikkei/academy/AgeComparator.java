package rikkei.academy;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        } else if (o1.getAge().equals(o2.getAge())) {
            return 0;
        } else {
            return -1;
        }
    }

//    @Override
//    public Comparator reversed() {
//        return Comparator.super.reversed();
//    }
//
//    @Override
//    public Comparator thenComparing(Comparator other) {
//        return Comparator.super.thenComparing(other);
//    }
//
//    @Override
//    public Comparator thenComparingInt(ToIntFunction keyExtractor) {
//        return Comparator.super.thenComparingInt(keyExtractor);
//    }
//
//    @Override
//    public Comparator thenComparingLong(ToLongFunction keyExtractor) {
//        return Comparator.super.thenComparingLong(keyExtractor);
//    }
//
//    @Override
//    public Comparator thenComparingDouble(ToDoubleFunction keyExtractor) {
//        return Comparator.super.thenComparingDouble(keyExtractor);
//    }
//
//    @Override
//    public Comparator thenComparing(Function keyExtractor) {
//        return Comparator.super.thenComparing(keyExtractor);
//    }
//
//    @Override
//    public Comparator thenComparing(Function keyExtractor, Comparator keyComparator) {
//        return Comparator.super.thenComparing(keyExtractor, keyComparator);
//    }
}
