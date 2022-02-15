package BMI;

public class BMI {
    private double weight;
    private double height;
    private String interpretation;

    static final double WEIGHTCONVERT = 0.45359237;
    static final double HEIGHTCONVERT = 0.0254;

    public BMI(int w, int h) {
        this.weight = w * WEIGHTCONVERT;
        this.height = h * HEIGHTCONVERT;
    }

    public double calculateBMI() {
        double bmi = this.weight / Math.pow(this.height, 2);
        return bmi;
    }

    public String getInterpretation() {
        double bmi = calculateBMI();
        if (bmi < 18.5) {
            this.interpretation = "Underweight";
        }
        else {
            if (bmi >= 30.0) {
                this.interpretation = "Obese";
            }
            else {
                if (bmi < 25.0) {
                    this.interpretation = "Normal";
                }
                else {
                    this.interpretation = "Overweight";
                }
            }
        }
        return this.interpretation;
    }
}
