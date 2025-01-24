public class AudioPlayer implements MediaPlayer {
    public void play(String trackName) {
        System.out.println("playing " + trackName);
    }
    public void pause() {
        System.out.println("pausing current track");
    }
    public String getCurrentTrack() {
        return "Current track";
    }
}
