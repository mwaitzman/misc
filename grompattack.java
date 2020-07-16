import java.util.Scanner;
class grompattack {
  public static void main(String[] args) {
    double APS, ratio, bonus; //APS is Attacks Per Second
    APS  = 1.000; ratio = 1.000; bonus = 57.500;
    double[] APS_PostAttack = {1.000, 0.870, 0.757, 0.659, 0.573, 0.498};
    double[] diff = new double[5];

    for (int i = 0; i < APS_PostAttack.length; i++) {
      if (i != APS_PostAttack.length-1) {
        diff[i] = (APS_PostAttack[i] - APS_PostAttack[i+1]);
        System.out.println(APS_PostAttack[i] + " divided by " + APS_PostAttack[i+1] + " = " + diff[i]);
      }
    }

    for (int i = 0; i < diff.length; i++) {
      if (i != diff.length-1) {
        System.out.println(diff[i] + " divided by " + diff[i+1] + " equals " + (diff[i] / diff[i+1]));
      }
    }
  }
}
