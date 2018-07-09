import java.lang.Math;
class ExampleBala1{
    public static void main(String args[]){
        double l=1.0,r=1.0,f=1.2;
        for(double c=0.01;c<=0.1;c+=0.01){
          //  f =Math.sqrt((1/(l*c)-(Math.pow(r,2)/(4*Math.pow(c,2)))));
            System.out.println("c = "+c+"\tf = "+f);
        }
    }
}