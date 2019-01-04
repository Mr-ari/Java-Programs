class A extends Thread{
    public void run(){
        for(int i=1;i<=5;i++) System.out.println("From class A : " + i);
        System.out.println("Exit from class A");
    }
}

class B extends Thread{
    public void run(){
        for(int j=1;j<=5;j++) System.out.println("From class B : " + j);
        System.out.println("Exit from class B");
    }
}

class C extends Thread{
    public void run(){
        for(int k=1;k<=5;k++) System.out.println("From class C : " + k);
        System.out.println("Exit from class C");
    }
}

class MyThread1{
    public static void main(String[] args) {
        new A().start();
        new B().start();
        new C().start();
    }
}