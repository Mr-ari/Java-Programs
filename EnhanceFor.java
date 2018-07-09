import java.lang.String;
import java.util.ArrayList;

class EnhanceFor{
    public static void main(String[] args) {
        String states[] = {"West Bengal","Mumbai","Delhi"};
        System.out.println("Normal for loop :");
        for(int i=0;i<states.length;i++) System.out.println("State name : "+states[i]);
        System.out.println("Enhance For loop :");
        for(String str : states) System.out.println("States name : "+str);
        
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Chennai");
        cities.add("Rajastan");
        cities.add("Hariana");

        for(String str : cities) System.out.println("States name : "+str);
    }
}