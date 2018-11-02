public class Main {

    public static void main(String[] args) {
int actWork=1590;
int engineer1=8, engineer2=9,engineer3=10,engineer4=11,engineer5=8,engineer6=8,engineer7=8;
int length1=3,length2=3,length3=3,length4=3,length5=4,length6=5,length7=6;
int hours1=40, hours2=35,hours3=30;

System.out.printf("With %d devs working a %d week sprint, for %d hrs/wk, we would be at %.2f%% of capacity\n",engineer1,length1,hours3,calcCap(calcPred(engineer1,length1,hours3),actWork));
System.out.printf("With %d devs working a %d week sprint, for %d hrs/wk, we would be at %.2f%% of capacity\n",engineer2,length2,hours3,calcCap(calcPred(engineer2,length2,hours3),actWork));
System.out.printf("With %d devs working a %d week sprint, for %d hrs/wk, we would be at %.2f%% of capacity\n",engineer3,length3,hours3,calcCap(calcPred(engineer3,length3,hours3),actWork));
System.out.printf("With %d devs working a %d week sprint, for %d hrs/wk, we would be at %.2f%% of capacity\n",engineer4,length4,hours3,calcCap(calcPred(engineer4,length4,hours3),actWork));
System.out.printf("With %d devs working a %d week sprint, for %d hrs/wk, we would be at %.2f%% of capacity\n",engineer5,length5,hours3,calcCap(calcPred(engineer5,length5,hours3),actWork));
System.out.printf("With %d devs working a %d week sprint, for %d hrs/wk, we would be at %.2f%% of capacity\n",engineer6,length6,hours3,calcCap(calcPred(engineer6,length6,hours3),actWork));
System.out.printf("With %d devs working a %d week sprint, for %d hrs/wk, we would be at %.2f%% of capacity\n",engineer7,length7,hours3,calcCap(calcPred(engineer7,length7,hours3),actWork));
System.out.printf("With %d devs working a %d week sprint, for %d hrs/wk, we would be at %.2f%% of capacity\n",engineer1,length1,hours2,calcCap(calcPred(engineer1,length1,hours2),actWork));
System.out.printf("With %d devs working a %d week sprint, for %d hrs/wk, we would be at %.2f%% of capacity\n",engineer2,length2,hours2,calcCap(calcPred(engineer2,length2,hours2),actWork));
System.out.printf("With %d devs working a %d week sprint, for %d hrs/wk, we would be at %.2f%% of capacity\n",engineer3,length3,hours2,calcCap(calcPred(engineer3,length3,hours2),actWork));
System.out.printf("With %d devs working a %d week sprint, for %d hrs/wk, we would be at %.2f%% of capacity\n",engineer4,length4,hours2,calcCap(calcPred(engineer4,length4,hours2),actWork));
System.out.printf("With %d devs working a %d week sprint, for %d hrs/wk, we would be at %.2f%% of capacity\n",engineer5,length5,hours2,calcCap(calcPred(engineer5,length5,hours2),actWork));
System.out.printf("With %d devs working a %d week sprint, for %d hrs/wk, we would be at %.2f%% of capacity\n",engineer6,length6,hours2,calcCap(calcPred(engineer6,length6,hours2),actWork));
System.out.printf("With %d devs working a %d week sprint, for %d hrs/wk, we would be at %.2f%% of capacity\n",engineer7,length7,hours2,calcCap(calcPred(engineer7,length7,hours2),actWork));
System.out.printf("With %d devs working a %d week sprint, for %d hrs/wk, we would be at %.2f%% of capacity\n",engineer1,length1,hours1,calcCap(calcPred(engineer1,length1,hours1),actWork));
System.out.printf("With %d devs working a %d week sprint, for %d hrs/wk, we would be at %.2f%% of capacity\n",engineer2,length2,hours1,calcCap(calcPred(engineer2,length2,hours1),actWork));
System.out.printf("With %d devs working a %d week sprint, for %d hrs/wk, we would be at %.2f%% of capacity\n",engineer3,length3,hours1,calcCap(calcPred(engineer3,length3,hours1),actWork));
System.out.printf("With %d devs working a %d week sprint, for %d hrs/wk, we would be at %.2f%% of capacity\n",engineer4,length4,hours1,calcCap(calcPred(engineer4,length4,hours1),actWork));
System.out.printf("With %d devs working a %d week sprint, for %d hrs/wk, we would be at %.2f%% of capacity\n",engineer5,length5,hours1,calcCap(calcPred(engineer5,length5,hours1),actWork));
System.out.printf("With %d devs working a %d week sprint, for %d hrs/wk, we would be at %.2f%% of capacity\n",engineer6,length6,hours1,calcCap(calcPred(engineer6,length6,hours1),actWork));
System.out.printf("With %d devs working a %d week sprint, for %d hrs/wk, we would be at %.2f%% of capacity\n",engineer7,length7,hours1,calcCap(calcPred(engineer7,length7,hours1),actWork));

    }
    public static int calcPred(int e,int l,int h){
        int predWork=l*e*h;
        return predWork;
    }
    public static double calcCap(double p,double a){
        double cap=(a/p*100);
        return cap;
    }
}
