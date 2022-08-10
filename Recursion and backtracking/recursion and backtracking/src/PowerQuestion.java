public class PowerQuestion {


    public static void main(String[]args){
        PowerQuestion powerQuestion=new PowerQuestion();
        int result=powerQuestion.powerCalculation1(5, 3);
        System.out.println(result);
        System.out.println(powerQuestion.powerCalculation2(5, 2));

        System.out.println(powerQuestion.logarithmicPowerCal(4, 2));
    }

    public int powerCalculation1(int x, int n){
        if(n==1){
            return x;
        }
        int result=powerCalculation1(x, n-1);
        return result*x;
    }

    public int powerCalculation2(int x, int n){
        if(n==1){
            return x;
        }
        return powerCalculation2(x,n-1)*x;
    }

  /**  public int logarithmicPowerCal(int x, int n){
        if(n==0){
            return 1;
        }

        if(n%2==0){
            return logarithmicPowerCal(x, n/2)*logarithmicPowerCal(x, n/2);
        }
        return logarithmicPowerCal(x, n/2)*logarithmicPowerCal(x, n/2)*x;
    }**/
  public int logarithmicPowerCal(int x, int n){
      if(n==0){
          return 1;
      }
      int xpnb2=logarithmicPowerCal(x, n/2);
      int xn=xpnb2*xpnb2;
      if(n%2==1){
          xn=xn*x;
      }
      return xn;
  }

}
