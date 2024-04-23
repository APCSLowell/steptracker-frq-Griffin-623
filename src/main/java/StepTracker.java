import java.util.ArrayList;
public class StepTracker
{
 private int dailySteps,active,activeDays;
 StepTracker(int num){
  active = num;
 }
 public void addDailySteps(int num){
  dailySteps = dailySteps + num;
  if(num>=active){
   activeDays++;
  }
 }
 public double averageSteps(){
  if(activeDays==0)
   return 0.0
  else
   return (double)dailySteps/activeDays;
 }
} 
