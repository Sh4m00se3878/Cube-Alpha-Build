import java.util.Scanner;
class Cube {
    // private data members
    private Cube_Face blue_Face;
    private Cube_Face orange_Face;
    private Cube_Face green_Face;
    private Cube_Face red_Face;
    private Cube_Face white_Face;
    private Cube_Face yellow_Face;

    private char fc; // : "Front Face Color" --> Center color the user is facing
    private char u; // Upper Face Color
    private char l; // Left Face Color
    private char r; // Right Face Color
    private char b; // Back Face Color
    private char w; // Underside Face Color

    public Cube() { // Cube Default Constructor
        blue_Face = new Cube_Face('b');
        orange_Face = new Cube_Face('o');
        green_Face = new Cube_Face('g');
        red_Face = new Cube_Face('r');
        white_Face = new Cube_Face('w');
        yellow_Face = new Cube_Face('y');

        fc = 'w';
        set_Spacial_Awareness('g');
        /*  this.faces = new Cube.Cube_Face[5];// arrayRefVar = new datatype[size];  ALSO: -1 for indexing. */
  }

    public Cube(char c, char n) { // Cube Constructor with parameter c
        blue_Face = new Cube_Face('b');
        orange_Face = new Cube_Face('o');
        green_Face = new Cube_Face('g');
        red_Face = new Cube_Face('r');
        white_Face = new Cube_Face('w');
        yellow_Face = new Cube_Face('y');

        fc = c;
        set_Spacial_Awareness(n);
        /*  this.faces = new Cube.Cube_Face[5];// arrayRefVar = new datatype[size];  ALSO: -1 for indexing. */
    }

    // public methods
    public void set_Spacial_Awareness(char c) {
        if(fc == 'b'){
            switch(java.lang.Character.toLowerCase(c)){
                case 'o' : u = 'o';
                    l = 'w';
                    r = 'y';
                    b = 'g';
                    w = 'r';
                    break;
                case 'w' : u = 'w';
                    l = 'r';
                    r = 'o';
                    b = 'g';
                    w = 'y';
                    break;
                case 'y' : u = 'y';
                    l = 'o';
                    r = 'r';
                    b = 'g';
                    w = 'w';
                    break;
                case 'r' : u = 'r';
                    l = 'y';
                    r = 'w';
                    b = 'g';
                    w = 'o';
                    break;
                default :
                    System.out.println("INVALID INPUT -- " + c + " is not a choice");
                    break;
            }
        }

        else if(fc == 'o'){
            switch(c){
                case 'w' : u = 'w';
                    l = 'b';
                    r = 'g';
                    b = 'r';
                    w = 'y';
                    break;
                case 'b' : u = 'b';
                    l = 'y';
                    r = 'w';
                    b = 'r';
                    w = 'g';
                    break;
                case 'g' : u = 'g';
                    l = 'w';
                    r = 'y';
                    b = 'r';
                    w = 'b';
                    break;
                case 'y' : u = 'y';
                    l = 'g';
                    r = 'b';
                    b = 'r';
                    w = 'w';
                    break;
                default :
                    System.out.println("INVALID INPUT -- " + c + " is not a choice");
                    break;
            }
        }

        else if(fc == 'g'){
            switch(c){
                case 'w' : u = 'w';
                    l = 'o';
                    r = 'r';
                    b = 'b';
                    w = 'y';
                    break;
                case 'r' : u = 'r';
                    l = 'w';
                    r = 'y';
                    b = 'b';
                    w = 'o';
                    break;
                case 'o' : u = 'o';
                    l = 'y';
                    r = 'w';
                    b = 'b';
                    w = 'r';
                    break;
                case 'y' : u = 'y';
                    l = 'r';
                    r = 'o';
                    b = 'b';
                    w = 'w';
                    System.out.println("INVALID INPUT -- " + c + " is not a choice");
                    break;
            }
        }

        else if(fc == 'r'){
            switch(c){
                case 'w' : u = 'w';
                    l = 'g';
                    r = 'b';
                    b = 'o';
                    w = 'y';
                    break;
                case 'b' : u = 'b';
                    l = 'w';
                    r = 'y';
                    b = 'o';
                    w = 'g';
                    break;
                case 'g' : u = 'g';
                    l = 'y';
                    r = 'w';
                    b = 'o';
                    w = 'b';
                    break;
                case 'y' : u = 'y';
                    l = 'b';
                    r = 'g';
                    b = 'o';
                    w = 'w';
                    break;
                default :
                    System.out.println("INVALID INPUT -- " + c + " is not a choice");
                    break;
            }
        }

       else if(fc == 'w'){
            switch(c){
                case 'o' : u = 'o';
                    l = 'g';
                    r = 'b';
                    b = 'y';
                    w = 'r';
                    break;
                case 'b' : u = 'b';
                    l = 'o';
                    r = 'r';
                    b = 'y';
                    w = 'g';
                    break;
                case 'g' : u = 'g';
                    l = 'r';
                    r = 'o';
                    b = 'y';
                    w = 'b';
                    break;
                case 'r' : u = 'r';
                    l = 'b';
                    r = 'g';
                    b = 'y';
                    w = 'o';
                    break;
                default :
                    System.out.println("INVALID INPUT -- " + c + " is not a choice");
                    break;
            }
        }

        else{
            switch(c){
                case 'o' : u = 'o';
                    l = 'g';
                    r = 'b';
                    b = 'o';
                    w = 'y';
                    break;
                case 'b' : u = 'b';
                    l = 'w';
                    r = 'y';
                    b = 'o';
                    w = 'g';
                    break;
                case 'g' : u = 'g';
                    l = 'y';
                    r = 'w';
                    b = 'o';
                    w = 'b';
                    break;
                case 'r' : u = 'r';
                    l = 'b';
                    r = 'g';
                    b = 'o';
                    w = 'w';
                    break;
                default :
                    System.out.println("INVALID INPUT -- " + c + " is not a choice");
                    break;
            }
        }
    }

    public Cube_Face get_Focal_Face(){
        Cube_Face front = new Cube_Face();
        if (fc == 'b') {
            front = blue_Face;
        }
        else if (fc == 'o'){
            front = orange_Face;
        }
        else if (fc == 'g'){
            front = green_Face;
        }
        else if (fc == 'r'){
            front = red_Face;
        }
        else if (fc == 'w'){
            front = white_Face;
        }
        else if (fc == 'y'){
            front = yellow_Face;
        }
        return front;
    }

    public Cube_Face get_Upper_Face(){
        Cube_Face upper = new Cube_Face();
        if (u == 'b') {
            upper = blue_Face;
        }
        else if (u == 'o'){
            upper = orange_Face;
        }
        else if (u == 'g'){
            upper = green_Face;
        }
        else if (u == 'r'){
            upper = red_Face;
        }
        else if (u == 'w'){
            upper = white_Face;
        }
        else if (u == 'y'){
            upper = yellow_Face;
        }
        return upper;
    }
    
    public Cube_Face get_Right_Face(){
        Cube_Face right = new Cube_Face();
        if (r == 'b') {
            right = blue_Face;
        }
        else if (r == 'o'){
            right = orange_Face;
        }
        else if (r == 'g'){
            right = green_Face;
        }
        else if (r == 'r'){
            right = red_Face;
        }
        else if (r == 'w'){
            right = white_Face;
        }
        else if (r == 'y'){
            right = yellow_Face;
        }
        return right;
    }

    public Cube_Face get_Left_Face(){
        Cube_Face left = new Cube_Face();
        if (l == 'b') {
            left = blue_Face;
        }
        else if (l == 'o'){
            left = orange_Face;
        }
        else if (l == 'g'){
            left = green_Face;
        }
        else if (l == 'r'){
            left = red_Face;
        }
        else if (l == 'w'){
            left = white_Face;
        }
        else if (l == 'y'){
            left = yellow_Face;
        }
        return left;
    }

    public Cube_Face get_Back_Face(){
        Cube_Face back = new Cube_Face();
        if (b == 'b') {
            back = blue_Face;
        }
        else if (b == 'o'){
            back = orange_Face;
        }
        else if (b == 'g'){
            back = green_Face;
        }
        else if (b == 'r'){
            back = red_Face;
        }
        else if (b == 'w'){
            back = white_Face;
        }
        else if (b == 'y'){
            back = yellow_Face;
        }
        return back;
    }

    public Cube_Face get_Bottom_Face(){
        Cube_Face bottom = new Cube_Face();
        if (w == 'b') {
            bottom = blue_Face;
        }
        else if (w == 'o'){
            bottom = orange_Face;
        }
        else if (w == 'g'){
            bottom = green_Face;
        }
        else if (w == 'r'){
            bottom = red_Face;
        }
        else if (w == 'w'){
            bottom = white_Face;
        }
        else if (w == 'y'){
            bottom = yellow_Face;
        }
        return bottom;
    }

    public char get_Front_Color(){ return fc; }

    public char get_Upper_Color() { return u; }

    public char get_Right_Color() { return r; }

    public char get_Left_Color() { return l; }

    public char get_Back_Color() { return b; }

    public char get_Bottom_Color() { return w; }

    public void set_Face(char c, Cube_Face f){ // error check for setting whole new face. i.e. turning blue face into all white.
        switch(c){
            case 'b': blue_Face = f;
                break;
            case 'o': orange_Face = f;
                break;
            case 'g': green_Face = f;
                break;
            case 'r': red_Face = f;
                break;
            case 'w': white_Face = f;
                break;
            case 'y': yellow_Face = f;
                break;
            default :
                System.out.println("INVALID INPUT -- " + c + " is not a choice");
                break;
        }
    }

    public void rotate_Cube(char c, int num_Rotations){ // position p ==> determines where c goes. ***********
        // implement set_face()
        char prefc, preu, prel, preb;
        Cube_Face left = get_Left_Face();
        Cube_Face right = get_Right_Face();
        Cube_Face upper = get_Upper_Face();
        Cube_Face back = get_Back_Face();
        Cube_Face bottom = get_Bottom_Face();

        if (c == u) {
            while(num_Rotations > 0){
                prefc = fc;

                left.rotate_Face_Clock();
                right.rotate_Face_CounterClock();
                back.rotate_Face_Clock();
                back.rotate_Face_Clock();
                bottom.rotate_Face_Clock();
                bottom.rotate_Face_Clock();

                set_Face(get_Left_Color(), left);
                set_Face(get_Right_Color(), right);
                set_Face(get_Back_Color(), back);
                set_Face(get_Bottom_Color(), bottom);

                fc = u;
                u = b;
                b = w;
                w = prefc;

                num_Rotations--;
            }
        }

        else if(c == b){
            while(num_Rotations > 0) {

                prefc = fc;
                prel = l;

                upper.rotate_Face_Clock();
                upper.rotate_Face_Clock();
                bottom.rotate_Face_Clock();
                bottom.rotate_Face_Clock();

                set_Face(get_Upper_Color(), upper);
                set_Face(get_Bottom_Color(), bottom);

                fc = b;
                b = prefc;
                l = r;
                r = prel;

                num_Rotations--;
            }
        }

        else if(c == w){
            while(num_Rotations > 0) {

                prefc = fc;
                preu = u;
                preb = b;

                upper.rotate_Face_Clock();
                upper.rotate_Face_Clock();
                back.rotate_Face_Clock();
                back.rotate_Face_Clock();
                right.rotate_Face_Clock();
                right.rotate_Face_Clock();
                left.rotate_Face_CounterClock();
                left.rotate_Face_CounterClock();

                set_Face(get_Upper_Color(), upper);
                set_Face(get_Back_Color(), back);
                set_Face(get_Right_Color(), right);
                set_Face(get_Left_Color(), left);

                fc = w;
                u = prefc;
                b = preu;
                w = preb;

                num_Rotations--;
            }
        }

        else if(c == l){
            while(num_Rotations > 0) {

                prefc = fc;

                upper.rotate_Face_CounterClock();
                bottom.rotate_Face_Clock();

                set_Face(get_Upper_Color(), upper);
                set_Face(get_Bottom_Color(), bottom);

                fc = l;
                l = b;
                b = r;
                r = prefc;

                num_Rotations--;
            }
        }

        else if(c == r) {
            while(num_Rotations > 0) {

                prefc = fc;

                upper.rotate_Face_Clock();
                bottom.rotate_Face_CounterClock();

                set_Face(get_Upper_Color(), upper);
                set_Face(get_Bottom_Color(), bottom);

                fc = r;
                r = b;
                b = l;
                l = prefc;

                num_Rotations--;
            }
        }
    }

    public String toString(){ // displays the current faces with: r = red, b = blue, w = white, y = yellow, g = green, o = orange

        String display_Cube = "=========\t(f)" + "       =========\t(u)" + "       =========\t(l)" + "       =========\t(r)" + "       =========\t(b)" + "       =========\t(w)\n";
        for(int col = 0; col < 3; col++) {
            for (int row = 0; row < 3; row++) {
                display_Cube += "|" + get_Focal_Face().get_Block_Color(row, col) + "|"; // + f.get_Block_Color(0, 0)
            }
            display_Cube += "             ";

            for (int row = 0; row < 3; row++) {
                display_Cube += "|" + get_Upper_Face().get_Block_Color(row, col) + "|"; // + u.get_Block_Color(0, 0)
            }
            display_Cube += "           ";

            for (int row = 0; row < 3; row++) {
                display_Cube += "|" + get_Left_Face().get_Block_Color(row, col) + "|"; // + l.get_Block_Color(0, 0)
            }
            display_Cube += "           ";

            for (int row = 0; row < 3; row++) {
                display_Cube += "|" + get_Right_Face().get_Block_Color(row, col) + "|"; // + r.get_Block_Color(0, 0)
            }
            display_Cube += "           ";

            for (int row = 0; row < 3; row++) {
                display_Cube += "|" + get_Back_Face().get_Block_Color(row, col) + "|"; // + b.get_Block_Color(0, 0)
            }
            display_Cube += "           ";

            for (int row = 0; row < 3; row++) {
                display_Cube += "|" + get_Bottom_Face().get_Block_Color(row, col) + "|"; // + w.get_Block_Color(0, 0)
            }
            display_Cube += "           \n";
        }
        display_Cube += "=========\t       " + "   =========\t       " + "   =========\t      " + "    =========\t       " + "   =========\t       " + "   =========\t\n";
        //
        // =========  (F) <-- (current face)
        // |r||r||r|
        // |r||r||r|
        // |r||r||r|
        // =========
        //
        return display_Cube;
    }

/*  public void move_upper_face(){

    }
    public void move_left_face(){

    }
    public void move_right_face(){

    }
    public void move_back_face(){

    }
    public void move_bottom_face(){

    }
    public void move_middle_Layer_Up{

    }
     public void move_middle_Layer_Down{

    }
    public void move_vertical_Layer_Right{

    }
    public void move_vertical_Layer_Left{

    }*/
}




