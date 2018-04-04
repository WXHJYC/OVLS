package cn.xdl.ovls.video.entity;

import java.util.List;

import cn.xdl.ovls.video.service.VideoService;

public class Chapter {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chapter.id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chapter.name
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chapter.course_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    private Integer courseId;
    
    
    //追加List属性,用于存储相关联的video
    private List<Video> videos;

    public List<Video> getVideos() {
		return videos;
	}

	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chapter.id
     *
     * @return the value of chapter.id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chapter.id
     *
     * @param id the value for chapter.id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chapter.name
     *
     * @return the value of chapter.name
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chapter.name
     *
     * @param name the value for chapter.name
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chapter.course_id
     *
     * @return the value of chapter.course_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chapter.course_id
     *
     * @param courseId the value for chapter.course_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }
}