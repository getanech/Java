public class Song {
    public static void main(String[] args) {
        Song ns = new Song("Ququ", "Buku",120 );
        System.out.println(ns.ststus());

    }
    String name;// – שם השיר, מטיפוס מחרוזת
    String preformer;//שם המבצע, מטיפוס מחרוזת.
    int length;//אורך השיר בשניות, מטיפוס מספר שלם

    public Song(String name, String preformer, int length) {
        this.name = name;
        this.preformer = preformer;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPreformer() {
        return preformer;
    }

    public void setPreformer(String preformer) {
        this.preformer = preformer;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String ststus(){
        return preformer+ "/" + name+ ":"+length;
    }
}
