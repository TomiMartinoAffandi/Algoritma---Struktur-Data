package JobSheet2;

public class dragon {
    int x = 5, y = 5, width, height;

    void moveLeft(){
        x -= 1;
        if (x < 0 || x > width ) {
            detectCollision(x, y);
        }
    }
    
    void moveRight(){
        x += 1;
        if (x < 0 || x > width ) {detectCollision(x, y);}
    }

    void moveUp(){
        y -= 1;
        if (y < 0 || y > height) {detectCollision(x, y);}
    }
    
    void moveDown(){
        y += 1;
        if (y < 0 || y > height) {detectCollision(x, y);}
    }

    void printPosition(){
        System.out.println("Posisi naga: "+ x +", "+ y);
    }

    void detectCollision(int x, int y){
        System.out.println("game over");
        System.exit(0);
    }
}
