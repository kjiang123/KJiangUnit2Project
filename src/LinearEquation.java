public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public LinearEquation(int x1, int y1, int x2, int y2){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }

    public String calcSlopeFraction(){
        return (y2-y1)+"/"+(x2-x1);
    }
    public int calcSlopeInt(){
        return (y2-y1)/(x2-x1);
    }
    public double yIntercept(String slope){
        if (slope.indexOf("/")>0){
            int slash = slope.indexOf("/");
            int num1 = Integer.parseInt(slope.substring(0,slash));
            int num2 = Integer.parseInt(slope.substring(slash+1));
            return y1-((double)num1/num2*x1);
        }
        return y1-(Double.parseDouble(slope)*x1);
    }
    public String slopeInterceptForm(String slope, Double yIntercept){
        return "y = " + slope +"x " + "+ " + yIntercept;
    }
    public double distance(){
        int xDistance = Math.abs(x2-x1);
        int yDistance = Math.abs(y2-y1);
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }
}
