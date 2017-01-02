package sorting;

/**  
 * Each Lamp element represents a direction of the lamp, a total of 12 directions, all a total of 12 Lamp elements.   
 * There are some direction as follows on the lamp, each of the two form a group, a group of light green or red, so the,   
 * The code requires only a lamp can control each lamp:   
 * s2n,n2s      
 * s2w,n2e  
 * e2w,w2e  
 * e2s,w2n  
 * s2e,n2w  
 * e2n,w2s 
 *  
 * The last two lines above the lamp is virtual, because from the East and from west to North South, and their corresponding direction without traffic lights control,   
 * So, can be imagined they always light.   
 */  
  
  
public enum Lamp {  
    //Each enumeration elements that control the lamp in one direction   
    S2N("N2S","S2W",false),
    S2W("N2E","E2W",false),
    E2W("W2E","E2S",false),
    E2S("W2N","S2N",false),  
    //The following elements                                                                                                                                                                                                                               the opposite direction with the above elements of the lamp,
    //they are "the opposite direction lamp" and "a light" should be ignored！
    N2S(null,null,false),
    N2E(null,null,false),
    W2E(null,null,false),
    W2N(null,null,false),  
    //From south to East and from west to north,
    //turn right at the lights without traffic lights control, therefore, can be imagined they always light
    S2E(null,null,true),
    E2N(null,null,true),
    N2W(null,null,true),
    W2S(null,null,true);  
     
    private boolean lighted; // The light is green
    private String opposite;  //The opposite direction of the lamp and lamp
    private String next;  //The light turned red and green lights
  private Lamp(){ }  
  
  private Lamp(String opposite,String next,boolean lighted){ 
	  this.opposite = opposite; 
	  this.next = next; 
	  this.lighted = lighted; 
	  System.out.println("opp >>" +this.opposite +" next>>" + this.next+" >> lighted >> "+ this.lighted);
	} //Method to determine whether the bright lights 
  
 public boolean isLighted(){ 
	 return lighted;
 } //Let this direction lights , The opposite direction at the same time and its corresponding light to brighten up the 

 public void light () {
	 this.lighted = true; 
	 if (opposite!= null) {
		Lamp.valueOf(opposite).light();
		// Lamp.valueOf(opposite).Light(//4);} turn right, 2 current lighting direction
	 }
 }
 //System.out.println(name() + " The direction of the light turns green, the total should have 6 directions to see a car through the！");  
 
  
  
/**  
 * A light turns red, the corresponding direction lamp will turn red, and the next direction of the light to turn green  
 * @Light green return a  
 */   
public Lamp blackOut(){  
    this.lighted = false;  
    if(opposite != null){  
        Lamp.valueOf(opposite).blackOut();  
    }         
      
    Lamp nextLamp= null;  
    if(next != null){  
//The light changed, let the lights turn green  
        nextLamp = Lamp.valueOf(next);  
        System.out.println("The green light from the " + name() + " - switch to>" + next);            
        nextLamp.light();  
    }  
    return nextLamp;  
}  
}  