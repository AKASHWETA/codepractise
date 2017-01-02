package practice;
/**
 * For hour hand, 
	1 hour = (360/12) = 30 degrees movement 
	1 minute = (30/60) = 0.5 degree movement 

	For minute hand, 
	1 minute = (360/60) = 6 degrees movement 

 * @author apalewar
 *
 */
public class AngleMinHr {
	
	public static double angle(int h, int m) {
		  if (h <0 || m < 0 || h >12 || m > 60)
			  return -1;
			  System.out.println("wrong entry");
		  if (h == 12) h = 0;
		  if (m == 60) m = 0;
		  	double hAngle = 0.5 * (h * 60 + m);
		  	double mAngle = 6 * m;
		  	double angle = Math.abs(hAngle - mAngle);
		  	angle = Math.min(angle, 360 - angle);
	   
		  	return angle;
	}
	
public static double minAnle(int hr, int m){
	if(hr > 12 || m > 60 || hr<0 || m< 0){
		return -1;
	}
	
	if(hr ==12) hr = 0;
	if(m ==60) m =0;
	
	double  hrAngle = 0.5 * (hr * 60 + m);
	double minAngle = 6 * m;
	
	double angle = Math.abs(hrAngle - minAngle);
	angle = Math.min(angle, 360-angle);
	return angle;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(angle(10,-30));
	}

}
