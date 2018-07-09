class A extends Thread{
    public void run(){
        for(int i=1;i<=5;i++) {
            if(i==1) yield();
            System.out.println("From class A : " + i);
        }
        System.out.println("Exit from class A");
    }
}

class B extends Thread{
    public void run(){
        for(int j=1;j<=5;j++) {
            if(j==3) stop();
            System.out.println("From class B : " + j);
        }
        System.out.println("Exit from class B");
    }
}

class C extends Thread{
    public void run(){
        for(int k=1;k<=5;k++) {
            if(k==1) {
                try{
                    sleep(100);
                }
                catch(Exception E){

                }
            }
            System.out.println("From class c : " + k);
        }
        System.out.println("Exit from class c");
    }
}

class MyThread2{
    public static void main(String[] args) {
        A MyA = new A();
        B MyB = new B();
        C MyC = new C();
        System.out.println("Thread A started ... ");
        MyA.start();
        System.out.println("Thread B started ... ");
        MyB.start();
        System.out.println("Thread C started ... ");
        MyC.start();
    }
}