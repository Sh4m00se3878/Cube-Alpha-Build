import sun.util.resources.be.CurrencyNames_be_BY;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
     /*   Cube myCube;
        myCube.set_Colors_Def();*/

        Cube rubix = new Cube();
        rubix.get_Upper_Face().set_Block_Color(0,2,'r');


        //rubix.rotate_Cube('g', 1);


        System.out.println(rubix);



/*        for(int row = 0; row <= 2; row++) { // row value
            for (int col = 0; col <= 2; col++) { // column value
                System.out.println(row + " " + col + "/n");
            }
        }*/


    /* Cube_Face red = new Cube_Face('r');*/
    // rubix.get_Red_Face || rubix.get_Upper_Face
     //System.out.println(rubix.get_Upper_Face); <== Displays upper face
    }

}
