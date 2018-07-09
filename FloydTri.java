import java.util.Scanner;
class FloydTri{
    public static void main(String[] args) {
        int x;
        int clock=1;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number of row: ");
        x=inp.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++,clock++) System.out.print(clock+" ");
            System.out.println();   
        }
        System.out.println("*******************ModiFied Version*********************** ");
        for(int i=1;i<=x;i++){
            clock = i%2;
            for(int j=1;j<=i;j++){
                System.out.print(clock+" ");
                clock = (clock+1)%2;
            }
            System.out.println();
        }
    }
}