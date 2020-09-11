import android.graphics.Color;
import java.lang.Math;
public class Face {
// these are my instance variables
   private int  skinColor;
   private int  eyeColor;
   private int hairColor;
   private int hairStyle;

    // this is my constructor
   public Face() {
    randomize();
   }
    //  this is my random component method to randomly get the RGB colors by multiplying
    // the Math.random() by 256.
     public int randomComponent(){
       int x = (int) Math.random()*256;
     return x;
     }
     // this is my random hair method to randomly get a hair style
     public int randomHair(){
       int y = (int) Math.random()*3;
         return y;
     }

    /** External Citation
     * Date 10 September 2020
     * Problem: I did not know how to properly implement my
     * randomize method.
     * Resource: Prof. Nuxoll
     * Solution: I have written the code below with help and guidence
     * of Professor Nuxoll.
     */
    // This is my randomize method to randomly generate RGB values fo the skin, eye, and
    // hair color values plus the hair style type
    public void randomize(){
       this.skinColor = Color.argb(0xFF,randomComponent(),randomComponent(), randomComponent());
       this.eyeColor= Color.argb(0xFF,randomComponent(),randomComponent(), randomComponent());
       this.hairColor = Color.argb(0xFF,randomComponent(),randomComponent(), randomComponent());
       this.hairStyle = (randomHair());
    }
}

