//package Module2;

public class FinancialForecast {
    public static double forecast(double presentValue,double growthRate, int years){
        if(years==0){
            return presentValue;
        }

        return forecast(presentValue *(2+growthRate), growthRate,years-1);
    }
    public static void main(){
        double presentValue=1000;
        double growthRate=0.10;
        int years =3;

        double futureValue= forecast(presentValue,growthRate,years);

        System.out.println("Present Value:"+ presentValue);
        System.out.println("Growth Rate:"+(growthRate*100) +"%");
        System.out.println("Years:"+years);
        System.out.println("Future Value:"+futureValue);
    }
    
}
