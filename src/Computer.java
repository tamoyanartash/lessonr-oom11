public class Computer {


    private String name;
    private String color;
    private int year;
     private double Ram;
     private String design;



     public void printinfo(){
         System.out.println("name:" + name);
         System.out.println("color:" + color);
         System.out.println("Ram:" + Ram);
         System.out.println("design:" + design);
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCcolor() {
        return color;
    }

    public void setCcolor(String ccolor) {
        this.color = ccolor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = 2024;
    }

    public double getRam() {
        return Ram;
    }

    public void setRam(double ram) {
        Ram = ram;
    }

    public String getDesign(String compact) {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }


}
