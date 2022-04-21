package Week04;

public class TrafficLightSelector {
    public static void main(String[] args) {
        char color ='r';
        switch(color){
            case'R': case'r':
                System.out.println("Red Light");
                break;
            case 'O': case'o':
                System.out.println("Orange Light");
                break;
            case'G': case'g':
                System.out.println("Green Light");
                break;
        }
    }
}
