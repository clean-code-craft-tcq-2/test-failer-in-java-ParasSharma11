public class alerter {
    static int alertFailureCount = 0;
    static int networkAlertStub(float celcius) {
        int THRESHOLD_TEMP = 150;
        System.out.println("ALERT: Temperature is " + celcius + " celcius");
        // Return 200 for ok
        // Return 500 for not-ok
        // stub always succeeds and returns 200
         if(celcius<THRESHOLD_TEMP){
        return 200;}
        else
         {
        return 500;
         }
       
    }
    static float convertFarenheitToCelcius(float farenheit) {
    float celcius = (farenheit - 32) * 5 / 9;
    return celcius;
    }
    
    static void alertInCelcius(float farenheit) {
        float celcius = convertFarenheitToCelcius(farenheit);
        int returnCode = networkAlertStub(celcius);
        if (returnCode != 200) {
            // non-ok response is not an error! Issues happen in life!
            // let us keep a count of failures to report
            // However, this code doesn't count failures!
            // Add a test below to catch this bug. Alter the stub above, if needed.
            alertFailureCount += 1;
        }
    }
}
