public class ConvertTemperature {
    private static final int constant = 32;

    public static double convert(double temp, Enum fromTempType) {
        if (fromTempType.equals(FromTempType.FAHRENHEIT)) {
            if (temp < -459.67) throw new IllegalArgumentException("Temperature cannot be lower than absolute min");
            return (temp - constant) * (5.0 / 9.0);
        }
        if (fromTempType.equals(FromTempType.CELSIUS)) {
            if (temp < -273.15) throw new IllegalArgumentException("Temperature cannot be lower than absolute min");
            return (temp * 9.0 / 5.0) + constant;
        }
        return 0.0;
    }
}
