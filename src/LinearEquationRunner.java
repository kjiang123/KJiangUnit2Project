import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a coordinate point: ");
        String point1 = scan.nextLine();
        int comma1 = point1.indexOf(",");

        String sX1 = point1.substring(1,comma1);
        int x1 = Integer.parseInt(sX1);
        String sY1 = point1.substring(comma1+2, point1.length()-1);
        int y1 = Integer.parseInt(sY1);

        System.out.print("Enter a coordinate point: ");
        String point2 = scan.nextLine();
        int comma2 = point2.indexOf(",");

        String sX2 = point2.substring(1,comma1);
        int x2 = Integer.parseInt(sX2);
        String sY2 = point2.substring(comma1+2, point2.length()-1);
        int y2 = Integer.parseInt(sY2);

        LinearEquation lin = new LinearEquation(x1, y1, x2, y2);

        if ((double)(y2-y1)/(x2-x1)%1 != 1){
            System.out.println(lin.calcSlopeFraction());
        }else{
            System.out.println(lin.calcSlopeInt());
        }

    }
}
