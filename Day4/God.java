package Day4;

public class God {
    public static Human[] create(){
        Human[] humans = new Human[2];
        humans[0]=new Man("Adam");
        humans[1]=new Woman("Eva");

        return humans;
    }
}
