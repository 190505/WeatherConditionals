

public class WeatherConditionals
{
    private int temperature;
    private String description;
    private int windchill;
    private int humidity;
    
    public static String getWeatherAdvice(int temperature, String description){
        //return (temperature + " degrees and " + description);
        boolean windy = false;
        if ((description == "snow") && (temperature > 100))
            return ("Wtf");
        if ((description != "windy") && (temperature > 30))
            return ("It’s safe to go outside, " + temperature +" degrees and " + description);
        else
        if (description == "windy") windy = true;
        return "Too windy or cold! Enjoy watching the weather through the window.";
    }
    
    public static String getHikingAdvice(int temperature, int windchill, int humidity, String description){
        if (temperature < 40 || temperature > 80) return "Too hot or cold, stay inside";
        else if (description == "snow" || description == "rain" || description == "thunderstorms") return "Snowing, Raining, or Thunderstorms. Dont leave your house";
        else if (humidity <= 30 || humidity >= 70) return "Too humid or dry";
        else if (windchill < 32) return "Too cold and windy";
        else return "The weather is gucchi fam";
    }
}
