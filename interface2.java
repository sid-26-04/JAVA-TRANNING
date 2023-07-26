interface drawing
{
     void draw();
}

class Rectangle implements drawing{
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
}

class Circle implements drawing{
    public void draw(){
        System.out.println("Drawing Circle");
    }
}

class interface2 {
    public static void main(String[] args){
        Rectangle obj = new Rectangle();
        Circle c = new Circle();
        obj.draw();
        c.draw();
        drawing d = new Circle();
        d.draw();
    }
}