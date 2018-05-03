import java.util.Scanner;
public class Reversi {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String[] temp;
        String stent = sc.nextLine();

        String delimiter = " ";

        temp = stent.split(delimiter);
        System.out.println("Input : \t"+stent);
        System.out.print("Output : \t");

        for(int i = 0 ; i<temp.length;i++){
            System.out.print(temp[temp.length-i-1]+ " ");
        }

    }
}
