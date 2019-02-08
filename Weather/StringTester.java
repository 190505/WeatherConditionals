
public class StringTester
{
    public static String weatherCondition = "partly cloudy";
    public static void main(){
        //System.out.println(weatherCondition.length());
        //System.out.println(weatherCondition.substring(0, weatherCondition.indexOf(" ")));
        //String weatherCondition1 = new String("partly cloudy");
        //String weatherCondition2 = new String("partly cloudy");
        //boolean result1 = (weatherCondition1 == weatherCondition2);
        //boolean result2 = (weatherCondition1.equals(weatherCondition2));
        //System.out.println(result1);
        //System.out.println(result2);
        System.out.println(WeatherConditionals.getHikingAdvice(50, 40, 40, "partly cloudy"));
    }
}
