package org.oauth.social.model;

public class CalendarObj {
  
	   private String title;
	   private int startHour;
	   private int startMin;
	   private int endHour;
	   private int endMin;
	   private int duration;
	   
	   private String startEnd;
   
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public int getStartHour() {
			return startHour;
		}
		public void setStartHour(int startHour) {
			this.startHour = startHour;
		}
		public int getStartMin() {
			return startMin;
		}
		public void setStartMin(int startMin) {
			this.startMin = startMin;
		}
		public int getEndHour() {
			return endHour;
		}
		public void setEndHour(int endHour) {
			this.endHour = endHour;
		}
		public int getEndMin() {
			return endMin;
		}
		public void setEndMin(int endMin) {
			this.endMin = endMin;
		}
		public int getDuration() {
			return duration;
		}
		public void setDuration(int duration) {
			this.duration = duration;
		}
		public String getStartEnd() {
			return startEnd;
		}
		public void setStartEnd(String startEnd) {
			this.startEnd = startEnd;
		}
      
		
		
}
