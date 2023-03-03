import java.util.Scanner;

public class Gymnast extends Sportsman{
    int height;
    int weight;
    String style;

    public Gymnast() {
        super();
        int height = 0;
        int weight = 0;
        String style = "no style";
    }
    public Gymnast(String fullName, int age, String country, int height, int weight, String style) {
       super(fullName, age, country);
        this.height = height;
        this.weight = weight;
        this.style = style;
    }
    public String play(){
        return "Gymnast"+" "+fullName+" "+"from"+" "+country+" "+age+" "+"years"+" "+"old"+","+" "+weight+" "+"kg"+","+" "+height+" "+"cm"+" "+"with"+" "+"workout"+" "+"style"+" "+"is"+" "+"jumping";
    }
}

