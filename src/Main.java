public class Main {
    public static void main(String[] args) {

        double[] numbers = {12.3,-12.1,11.2,-2.3,4.5,-6.7,1.9,2.3,3.4,5.8,12.3,-12.1,11.2,-2.3,4.5};
        boolean sort = false;
int numberCount=0;
double allNumber = 0.0;
for (double cast:numbers){
    if (cast<0){
        sort = true;
    }else if (cast>0&& sort){
        numberCount++;
allNumber+=cast;
        System.out.println(cast);
    }
}
        System.out.println(allNumber/numberCount);
    }
}