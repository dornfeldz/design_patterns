package adapter;

public class MediaAdapter implements MediaPlayer{
    private VLCPlayer vlcPlayer;

    public MediaAdapter(VLCPlayer vlcPlayer){
        this.vlcPlayer = vlcPlayer;
    }

    public void play(String filename){
        vlcPlayer.playVLCFile(filename); //call to old system
    }
}
