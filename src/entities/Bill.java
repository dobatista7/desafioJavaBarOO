package entities;

import org.w3c.dom.ls.LSOutput;

public class Bill {

    public char gender;
    public int beer;
    public int barbecue;
    public int softDrink;

    public double feeding() {
        return (this.beer * 5.00) + (this.softDrink * 3.00) + (this.barbecue * 7.00);
    }

    public double cover() {
        if (feeding() > 30.00) {

            return 0.00;

        } else {
            return 4.00;
        }
    }

    public double ticket() {
        if (this.gender == 'F') {
            return 8.00;
        } else {
            return 10.00;
        }

    }

    public double total() {
        return feeding() + cover() + ticket();
    }


}
