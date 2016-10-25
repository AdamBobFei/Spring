package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.core.Ordered;
import org.springframework.util.StopWatch;

public class SimpleProfiler implements Ordered{

   public Object profile(ProceedingJoinPoint call) throws Throwable {
	   System.out.println("环绕通知start");
	   String name="hh";
	   int age=10;
      StopWatch clock = new StopWatch(
            "Profiling for '" + name + "' and '" + age + "'");
      long start = 0; 
      long end =0;;
      try {
    	start= System.currentTimeMillis();
        clock.start(call.toShortString());
        
        if(age>150){
     	   System.out.println("age过大");
     	   return null;
        }
        
        return call.proceed();
      } finally {
         clock.stop();
         end = System.currentTimeMillis();
         System.out.println(clock.prettyPrint());
         System.out.println("end!        performance took "+(end-start)+" milliseconds");
         System.out.println("环绕通知end");
      }
   }
   
	public int getOrder() {
	// TODO Auto-generated method stub
	return 0;
}
}
