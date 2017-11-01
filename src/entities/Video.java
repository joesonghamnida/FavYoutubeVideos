package entities;

public class Video {

    private String url = "";
    private String videoType = "";
    private String tagOne = "";
    private String tagTwo = "";
    private String tagThree = "";
    private int counter = 0;

    public Video(){}

    public Video(String url, String videoType, String tagOne, String tagTwo, String tagThree, int counter) {
        this.url = url;
        this.videoType = videoType;
        this.tagOne = tagOne;
        this.tagTwo = tagTwo;
        this.tagThree = tagThree;
        this.counter = counter;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType;
    }

    public String getTagOne() {
        return tagOne;
    }

    public void setTagOne(String tagOne) {
        this.tagOne = tagOne;
    }

    public String getTagTwo() {
        return tagTwo;
    }

    public void setTagTwo(String tagTwo) {
        this.tagTwo = tagTwo;
    }

    public String getTagThree() {
        return tagThree;
    }

    public void setTagThree(String tagThree) {
        this.tagThree = tagThree;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
