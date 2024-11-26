public class Pack {
    public static void main(String[] args) {
        Pack pack = new Pack(0, new String[]{"yellow", "Green", "red"}, 10, 2);

        Pencil pencils = new Pencil("yellow", "Green", 6);
        System.out.println(pack.isFit(pencils));
    }

    private Pencil[] allPencils;//מערך עפרונות
    private String[] colors;//מערך צבעים
    private int CurNum;//מספר העפרונות בחבילה
    private int max;//אורך מקסימלי העיפרון
    private int min;//אורך מינימלי העיפרון
    private int num;


    public Pack(int num, String[] colors, int max, int min) {
        this.allPencils = new Pencil[num];
        this.colors = colors;
        CurNum = 0;
        this.max = max;
        this.min = min;
    }

    public Pencil[] getAllPencils() {
        return allPencils;
    }

    public void setAllPencils(Pencil[] allPencils) {
        this.allPencils = allPencils;
    }

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public int getCurNum() {
        return CurNum;
    }

    public void setCurNum(int curNum) {
        CurNum = curNum;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isFit(Pencil p) {
        if (p.getSize() < min || p.getSize() > max) {
            return false;
        }
        if (p.getColor1().equals(p.getColor2())) {
            return false;
        }
        boolean color1Match = false;
        boolean color2Match = false;
        for (String color : colors) {
            if (p.getColor1().equals(color)) {
                color1Match = true;
            }
            if (p.getColor2().equals(color)) {
                color2Match = true;
            }
        }
        return color1Match && color2Match;
    }

    // פעולה שמוסיפה עיפרון לחבילה אם הוא מתאים ויש מקום
    public boolean add(Pencil p) {
        if (isFit(p) && CurNum < allPencils.length) {
            allPencils[CurNum] = p;
            CurNum++;
            return true;
        }
        return false;
    }
}
