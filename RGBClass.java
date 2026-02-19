// RGBColor class representing a color using Red Green Blue (RGB) model.
class RGBColor {

    // The Red, Green, Blue color values range from 0 to 255.
    private int red;
    private int green;
    private int blue;

    // Constructor for RGBColor class which initializes the color with provided red, green and blue values.
    public RGBColor(int red, int green, int blue) {
        // write your code here
        if ((red >= 0 && red <= 255)
            && (blue >= 0 && blue <= 255)
            && (green >= 0 && blue <= 255)){
            this.red = red;
            this.blue = blue;
            this.green = green;
        } else {
            System.out.println("Invalid color values!!");
        }
    }

    // Getter method to get the red value of the color.
    public int getRed() {
        // write your code here
        return this.red;
    }

    // Getter method to get the green value of the color.
    public int getGreen() {
        // write your code here
        return this.green;
    }

    // Getter method to get the blue value of the color.
    public int getBlue() {
        // write your code here
        return this.blue;
    }

    // Method to invert the color. The inversion is done by subtracting each color component from 255.
    public void invert() {
        // write your code here
        this.red = 255 - this.red;
        this.blue = 255 - this.blue;
        this.green = 255 - this.green;
    }

}

public class RGBClass {
    public static void main(String[] args) {
        RGBColor rgb = new RGBColor(3, 77, 189);
        System.out.printf("(r, g, b) -> (%d, %d, %d)\n", rgb.getRed(), rgb.getGreen(), rgb.getBlue());
        System.out.println("inverting colors...");
        rgb.invert();
        System.out.printf("(r, g, b) -> (%d, %d, %d)", rgb.getRed(), rgb.getGreen(), rgb.getBlue());
    }
}