import java.util.*;
class VectorPrac{
    public static void main(String[] args) {
        Vector arrNum = new Vector();
        int inp;
        Scanner i = new Scanner(System.in);
       do{
           System.out.println("Enter The Number (9999 to Exit) :");
            inp = i.nextInt();
            arrNum.addElement(inp);
        }while(inp != 9999);

        for(int i=0;i<arrNum.size();i++){
            System.out.print(arrNum[i]+" ");
        }
        System.out.println();
    }
}