/*Name: RISHI SHAH
ID: 21CE131
AIM :Create a generic method for sorting an array of Comparable objects.
*/

import java.util.Arrays;

class Sample{
    public int num;
    public Sample(int num){
        this.num = num;
    }
    public String toString(){
        return String.format("Number:"+ num);
    }
}

public class Practical7_1{
    public static void main(String[] args){
        Sample[] samples = Arrays.asList(new Sample( 97),
                                             new Sample( 114),
                                             new Sample( 103)
                                            ).toArray(new Sample[3]);

        Arrays.sort(samples, (a, b) -> a.num - b.num);
        Arrays.stream(samples).forEach(System.out :: println);
    }
}
