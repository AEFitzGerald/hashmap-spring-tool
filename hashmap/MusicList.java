package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MusicList {
	private String songTrack;
	private String lyrics;
	
	//constructor
	public MusicList(String songTrackInput, String lyricsInput) {
		this.songTrack = songTrackInput;
		this.lyrics = lyricsInput;
	}
	//getters and setters
	public String getSongTrack() {
		return songTrack;
	}

	public void setSongtrack(String songTrack) {
		this.songTrack = songTrack;
	}

	public String getLyrics() {
		return lyrics;
	}

	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}

	public static void main(String[] args) {
		
	Map<String, MusicList> findMusicItemByKey = new HashMap<>();
	MusicList one = new MusicList("Sip Beats","Chupa chups jujubes caramels icing oat cake I love cake fruitcake lemon drops.");
	MusicList two = new MusicList("Eat Stroll","Candy dessert I love candy canes lemon drops marzipan liquorice.");
	MusicList three = new MusicList("Relax Chill","Brownie gingerbread soufflé gingerbread caramels jujubes cake jelly-o I love.");
	MusicList four = new MusicList("Dream Drip","I love danish candy canes candy canes danish sweet roll lemon drops caramels pudding.");
	
	findMusicItemByKey.put(one.getSongTrack(), one);
	findMusicItemByKey.put(two.getSongTrack(), two);
	findMusicItemByKey.put(three.getSongTrack(), three);
	findMusicItemByKey.put(four.getSongTrack(), four);

	
	findMusicItemByKey.forEach( (key, lyrics) -> {
	    System.out.println("Key: " + key +"\nLyrics:" + lyrics.getLyrics());
	    //do something with the key and value
	});
	}
}