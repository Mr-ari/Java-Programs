class A extends Thread{
    public void run(){
        System.out.println("CLASS A started");
        for(int i=1;i<=5;i++) System.out.println("From class A : " + i);
        System.out.println("Exit from class A");
    }
}

class B extends Thread{
    public void run(){
        System.out.println("CLASS B started");
        for(int j=1;j<=5;j++) System.out.println("From class B : " + j);
        System.out.println("Exit from class B");
    }
}

class C extends Thread{
    public void run(){
        System.out.println("CLASS C started");
        for(int k=1;k<=5;k++) System.out.println("From class C : " + k);
        System.out.println("Exit from class C");
    }
}

class ThreadPriority{
    public static void main(String[] args) {
        A MyA = new A();
        B MyB = new B();
        C MyC = new C();
        MyA.setPriority(Thread.MAX_PRIORITY);
        MyB.setPriority(MyB.getPriority()+1);
        MyC.setPriority(Thread.MIN_PRIORITY);
        MyA.start();
        MyB.start();
        MyC.start();
    }
}