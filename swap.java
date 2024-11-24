import java.util.*;
public class swap {

    public static void swp(int x, int y){
        int temp=x;
        x=y;
        y=temp;
        System.out.println("a="+x);
        System.out.println("b="+y);

    }
    public static void main(String[] args){
        int a=5;
        int b=9;
// cal by value
        System.out.println("Before Swapping ");
        System.out.println("a="+a);
        System.out.println("b="+b);


         int temp=a;
         a=b;
         b=temp;
        System.out.println("Swapping using call by reference");
        System.out.println("a="+a);
        System.out.println("b="+b);

        System.out.println("Swapping using call value:");
        swp(a,b);
    }
}
