package sorting;

import java.util.concurrent.Executors;  
import java.util.concurrent.ScheduledExecutorService;  
import java.util.concurrent.TimeUnit;  
  
public class LampController {  
    private Lamp currentLamp;  
      
    public LampController(){  
        //Just starting to get the green light from the south to the North;       
        currentLamp = Lamp.S2N;  
        currentLamp.light();  
          
        /*Every 10 seconds the lights turned red, and let the next direction of the light turns green*/        
        ScheduledExecutorService timer =  Executors.newScheduledThreadPool(1);  
        timer.scheduleAtFixedRate(  
                new Runnable(){  
                    public  void run(){  
                        System.out.println("Come on");  
                        currentLamp = currentLamp.blackOut();  
                }  
                },  
                10,  
                10,  
                TimeUnit.SECONDS);  
   }
}
