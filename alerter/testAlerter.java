package alerter;

public class testAlerter{
  static void testAlertInCelcius(){
    
    alerter.alertInCelcius(400.5f);
    alerter.alertInCelcius(303.6f);
    alerter.alertInCelcius(522.6f);
    assert(alertFailureCount == 2);
    printf("%d alerts failed.\n", alertFailureCount);
    printf("All is well (maybe!)\n");
  }
}
