public class Rgb {
    private int red;
    private int blue;
    private int green;

    public Rgb(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRgb(String colorName) {
        switch (colorName) {
            case "red":
                return red;
            case "green":
                return green;
            case "blue":
                return blue;
            default:
                return 0;
        }
    }

    public void setRgb(String colorName, int rgbValue) {
        switch (colorName) {
            case "red":
                red = rgbValue;
                break;
            case "green":
                green = rgbValue;
                break;
            case "blue":
                blue = rgbValue;
                break;
            default:
                break;
        }
    }

    public void reset(){
        red = 0;
        blue = 0;
        green = 0;
    }
}
