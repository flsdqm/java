public class Task2 {
    public static void main(String[] args) {

        int[] a = {0, 0, 0, 0, 0};
        int[] num = {7, 9, 11, 6, 5};

        hash(num,a);

        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
        }
    }

    private static void hash(int[] num, int[] a) {
        for (int i = 0; i < num.length; i++) {
            int m = num[i] % 5;
            a[i] = m;
        }
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Task2 task2 = (Task2) o;
//        return Arrays.equals(a, task2.a) && Arrays.equals(num, task2.num);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = Arrays.hashCode(a);
//        result = 31 * result + Arrays.hashCode(num);
//        return result;
//    }

}

