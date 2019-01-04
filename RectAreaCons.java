class Rectangle{
    int length,width;
    Rectangle (){
        length=1;width=1;
    }
    Rectangle(int x,int y){
        length=x;width = y;
    }
    void print(){
        System.out.println();
        for(int i=1;i<=width;i++){
            if(i==1 || i==width) for(int k=1;k<=length;k++) System.out.print("* ");
            else{
                for(int k=1;k<=length;k++) {
                    if(k==1 || k==length) System.out.print("* ");
                    else System.out.print("  ");
                }
            }
            System.out.println();
        }        
        System.out.println();
    }
    void printData(){System.out.println("Length = "+length+" Width = "+width);}
    int getArea(){return length*width;}
}

class RectAreaCons{
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10,6);
        r.print();
        System.out.println(r.getArea());
    }
}