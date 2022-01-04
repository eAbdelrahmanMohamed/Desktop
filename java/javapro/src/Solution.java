import java.util.*;
public class Solution {
    public static void main(String[] args) {
        int weight = 0;
        Boolean can = true;
        Boolean cannot = false;
        Scanner scanner = new Scanner(System.in);
        weight=scanner.nextInt();
        if(weight>=0 && weight<=100){
            if (weight%2==0){
            System.out.print(can);
        }
        else {
            System.out.print(cannot);
            }}
        else{
            System.out.print("unvalid value");
        }}}
