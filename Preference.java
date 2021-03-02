
public class Preference {
	protected int quietTime;
	protected int music;
	protected int reading;
	protected int chatting;
	
	public Preference(){
		
	}
	
	public Preference(int quietTime, int music, int reading, int chatting){
		this.quietTime = quietTime;
		this.music = music;
		this.reading = reading;
		this.chatting = chatting;
	}
	
	public int getQuietTime(){
		return quietTime;
	}
	
	public int getMusic(){
		return music;
	}
	
	public int getReading(){
		return reading;
	}
	
	public int getChatting(){
		return chatting;
	}
	
	/*public Preference compare(Preference pref){
		
	}*/
	
}
