import java.util.Set;

public class Gift4u {
    private int code;
    private double price;
    private char type;

    public Gift4u(int code, double price, char type) {
        this.code = code;
        this.price = price;
//        this.type = type;
        setType(type);
    }

    public int getCode() {
        return code;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        if (this.type == 'M' || type == 'F' || type == 'U' || type == 'K') {
            this.type = type;

        }
    }
}

