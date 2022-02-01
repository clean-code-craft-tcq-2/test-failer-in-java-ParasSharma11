package alerter;

public class testAlerter{
  static void testAlertInCelcius(){
    
    alerter.alertInCelcius(400.5);
    alerter.alertInCelcius(303.6);
    alerter.alertInCelcius(522.6);
    assert(alertFailureCount == 2);
    printf("%d alerts failed.\n", alertFailureCount);
    printf("All is well (maybe!)\n");
  }
}
