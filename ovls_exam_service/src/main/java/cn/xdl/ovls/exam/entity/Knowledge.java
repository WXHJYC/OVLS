package cn.xdl.ovls.exam.entity;

public class Knowledge {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge.Id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge.name
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge.subject_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    private Integer subjectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge.chapter_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    private Integer chapterId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge.Id
     *
     * @return the value of knowledge.Id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge.Id
     *
     * @param id the value for knowledge.Id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge.name
     *
     * @return the value of knowledge.name
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge.name
     *
     * @param name the value for knowledge.name
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge.subject_id
     *
     * @return the value of knowledge.subject_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public Integer getSubjectId() {
        return subjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge.subject_id
     *
     * @param subjectId the value for knowledge.subject_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge.chapter_id
     *
     * @return the value of knowledge.chapter_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public Integer getChapterId() {
        return chapterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge.chapter_id
     *
     * @param chapterId the value for knowledge.chapter_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }
}