import java.util.*;

class SongDetails{
	private String title;
	private String artist;
	private int bpm;

	SongDetails(String title, String artist, int bpm){
		this.title=title;
		this.artist=artist;
		this.bpm=bpm;
	}

	public String getTitle(){
		return title;
	}
	public String getArtist(){
		return artist;
	}
	public int getBpm(){
		return bpm;
	}

	public String toString(){
		return title;
	}
}

class MockSongs{
	
	public static List<String> getSongStrings(){
		List<String> songs=new ArrayList<>();
		songs.add("Shiv sama rahe mujh me");
		songs.add("Kalabhairava Astakam");
		songs.add("Mujhme Shiva");
		songs.add("Mahadev mere kese karu tera sukriya");
		return songs;
	}

	public static List<SongDetails> getSortasDetails(){
		List<SongDetails> songs=new ArrayList<>();
		songs.add(new SongDetails("Shiv Sama Rahe Mujh me","Hanshraj Raghubansi",50));
		songs.add(new SongDetails("Mujhme Shiva","Agam Agarwal",50));
		songs.add(new SongDetails("Kalabhairava Astakam","Agam Agarwal",50));
		songs.add(new SongDetails("Mahadev Ka Sawan","Akki Kalyan",120));
		return songs;
	}

	public static void main(String[] args) {
		MockSongs ms=new MockSongs();
		List<SongDetails> songs=ms.getSortasDetails();
		songs.sort((one,two) -> one.getTitle().compareTo(two.getTitle()));
		System.out.println(songs);
		songs.sort((one,two) -> one.getBpm()-two.getBpm());
		System.out.println(songs);

		Set<SongDetails> songset=new TreeSet<>(songs);
		System.out.println(songset);


	}
}