public class Pencil {
    public static void main(String[] args) {
        Pencil pencil = new Pencil("red","Green",10);
        Pencil pencil1 = new Pencil("blue","yellow",9);

    }
    String color1;//צבע ראשון מטיפוס מחרוזת
     String color2;//צבע שני מטיפוס מחרוזת
     int size;//– אורך העיפרון מטיפוס מספר שלם

    public Pencil(String color1, String color2, int size) {
        this.color1 = color1;
        this.color2 = color2;
        this.size = size;
    }

    public String getColor1() {
        return color1;
    }

    public void setColor1(String color1) {
        this.color1 = color1;
    }

    public String getColor2() {
        return color2;
    }

    public void setColor2(String color2) {
        this.color2 = color2;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public boolean isSameColors(Pencil other){
        if (this.color1.equals(other.color1)  && this.color2.equals(other.color2)){
            return true;
        }
        return false;
    }

}
