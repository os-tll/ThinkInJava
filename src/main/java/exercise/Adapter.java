package exercise;

import com.sun.xml.internal.ws.api.model.MEP;

/**
 * 适配器模式
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/4 9:43
 */
public class Adapter {
    public static void main(String[] args) {

        //重构以前只支持这两方式的播放 step4
//        String[] audioTypes= {"Avi,txt"};
//        for(String audioType : audioTypes){
//            //原来的旧的媒体方式用这个
//            RealPlay realPlay = new RealPlay(new MediaPlayerImpl());
//            realPlay.playToSound(audioType,"C://");
//
//        }
        //重构后支持所有方式的播放 step 7
        String[] audioTypes= {"Mp4","Mp3","Avi","txt"};
        for(String audioType : audioTypes){
            //旧的媒体方式用这个
            RealPlay realPlay = new RealPlay(new MediaPlayerImpl());
            //新的媒体方式用这个，表现得还是RealPlay
            RealPlay realAdapterPlay = new RealPlay(new MediaPlayerAdapter());
            if(audioType.equals("Mp4")||audioType.equals("Mp3")){
                realAdapterPlay.playToSound(audioType,"C://");
            }else{
                realPlay.playToSound(audioType,"C://");
            }
        }
    }
}

/**
 * 有老式的媒体的播放方式,不兼容新式的媒体格式 step1
 */
interface MediaPlayer{
    void play(String audioType, String fileName);
}

/**
 * 有老式的媒体的播放方式,对修改关闭。这个类不能修改 step2
 */
class MediaPlayerImpl implements MediaPlayer {

    MediaPlayerAdapter m;
    @Override
    public void play(String audioType, String fileName) {
        switch (audioType){
            case "Avi":
                System.out.println("I am old Avi , name is "+fileName);
                break;
            case "txt":
                System.out.println("I am old txt , name is "+fileName);
                break;
                default:
        }
    }
}

/**
 * 将各种媒体格式进行实际的播放   这里用了策略模式 step3
 */
class RealPlay{
    MediaPlayer mediaPlayer;
    RealPlay(MediaPlayer mediaPlayer){
        this.mediaPlayer = mediaPlayer;
    }
    public void playToSound(String audioType, String fileName){
        mediaPlayer.play(audioType, fileName);
    }
}
/**
 * 可以播放新式的Mp4和Mp3格式，不兼容老式的媒体格式 step5
 */
interface AdvancedMediaPlayer{
    void playMp4(String fileName);
    void playMp3(String fileName);
}
/**
 * 创建新式的媒体的播放 step5
 */
class AdvancedMediaPlayerImpl implements AdvancedMediaPlayer{

    @Override
    public void playMp4(String fileName) {
        System.out.println("I am new Mp4 , name is "+fileName);
    }

    @Override
    public void playMp3(String fileName) {
        System.out.println("I am new Mp3 , name is "+fileName);
    }
}

/**
 * **********************重点在这里*****************************
 * 具体的播放器，将新式的媒体播放（MP4,Mp3)融合到老式的实现类里 step6
 * 通过这一步，新式的（Mp3,Mp4） act as 老式的 (txt, Avi),
 * 则所有老式的调用不用动，新式的调用的可以直接放进去用，因为是同一个接口
 */
class MediaPlayerAdapter implements MediaPlayer {

    @Override
    public void play(String audioType, String fileName) {
        switch (audioType){
            case "Mp3":
                new AdvancedMediaPlayerImpl().playMp3(fileName);
                break;
            case "Mp4":
                new AdvancedMediaPlayerImpl().playMp4(fileName);
                break;
            default:
        }
    }
}