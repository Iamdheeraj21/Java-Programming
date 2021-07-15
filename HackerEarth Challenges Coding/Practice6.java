public class Practice6 {
    public static void main(String[] args) {
        int[] score={1,2,3,4,5,6};
        int score2[]=null;

        System.arraycopy(score, 2, score2, 0, 2);

        for (int each : score2) {
            System.out.print(each);
        }
    }
}


/*
    Output

            :- it will throw the a NullPointerException
*/