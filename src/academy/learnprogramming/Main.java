package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
       boolean comparator = areEqualByThreeDecimalPlaces(3.1756,3.175);
        System.out.println(comparator);

    }
    public static boolean areEqualByThreeDecimalPlaces(double one,double two){
        one=(int)(one*1000);
        two=(int)(two*1000);
        if (one==two)
            return true;
        else return false;
    }
}
