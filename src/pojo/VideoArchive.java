/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author kvo
 */
public class VideoArchive {
    private String recordID;
    private String name;
    private String description;
    private String startTime;
    private String published;
    private String playback;
    private String length;

    public VideoArchive() {
    }

    public VideoArchive(String recordID, String name, String description, String startTime, String published, String playback, String length) {
        this.recordID = recordID;
        this.name = name;
        this.description = description;
        this.startTime = startTime;
        this.published = published;
        this.playback = playback;
        this.length = length;
    }

    public String getRecordID() {
        return recordID;
    }

    public void setRecordID(String recordID) {
        this.recordID = recordID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public String getPlayback() {
        return playback;
    }

    public void setPlayback(String playback) {
        this.playback = playback;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    
}
