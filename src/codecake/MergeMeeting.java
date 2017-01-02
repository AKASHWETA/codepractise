package codecake;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeMeeting {
	
	public static  List<Meeting> mergeRanges(List<Meeting> meetings){

		//sort by start times
		 
		List<Meeting> sortedMeeting = new ArrayList<Meeting>(meetings);
		Collections.sort(sortedMeeting,new Comparator<Meeting>(){
		public int compare(Meeting m1,Meeting m2){
			return m1.startTime - m2.startTime;
		 }
		});


		List<Meeting> mergedMeeting = new ArrayList<Meeting>();
		mergedMeeting.add(sortedMeeting.get(0));

		for(Meeting currentMeeting : sortedMeeting){
			Meeting lastMergedMeeting = mergedMeeting.get(mergedMeeting.size()-1);
	
			if(currentMeeting.startTime <=lastMergedMeeting.endTime){
				lastMergedMeeting.endTime = Math.max(lastMergedMeeting.endTime, currentMeeting.endTime);
	
			}else{
			mergedMeeting.add(currentMeeting);
			}
		}
		return mergedMeeting;
	}
	public static class Meeting {

	    int startTime;
	    int endTime;

	    public Meeting(int startTime, int endTime) {
	        // number of 30 min blocks past 9:00 am
	        this.startTime = startTime;
	        this.endTime   = endTime;
	    }

	    public String toString() {
	        return String.format("(%d, %d)", startTime, endTime);
	    }
	}
}
