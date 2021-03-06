package cn.xdl.ovls.exam.entity;

import java.util.Date;

public class Question {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.author
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    private Integer author;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.add_date
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    private Date addDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.degree
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    private Integer degree;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.answer
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    private String answer;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.type_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    private Integer typeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.knowledge_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    private Integer knowledgeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.subject_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    private Integer subjectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.chapter_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    private Integer chapterId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.id
     *
     * @return the value of question.id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.id
     *
     * @param id the value for question.id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.author
     *
     * @return the value of question.author
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public Integer getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.author
     *
     * @param author the value for question.author
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public void setAuthor(Integer author) {
        this.author = author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.add_date
     *
     * @return the value of question.add_date
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public Date getAddDate() {
        return addDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.add_date
     *
     * @param addDate the value for question.add_date
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.degree
     *
     * @return the value of question.degree
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public Integer getDegree() {
        return degree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.degree
     *
     * @param degree the value for question.degree
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public void setDegree(Integer degree) {
        this.degree = degree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.answer
     *
     * @return the value of question.answer
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.answer
     *
     * @param answer the value for question.answer
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.type_id
     *
     * @return the value of question.type_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.type_id
     *
     * @param typeId the value for question.type_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.knowledge_id
     *
     * @return the value of question.knowledge_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public Integer getKnowledgeId() {
        return knowledgeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.knowledge_id
     *
     * @param knowledgeId the value for question.knowledge_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public void setKnowledgeId(Integer knowledgeId) {
        this.knowledgeId = knowledgeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.subject_id
     *
     * @return the value of question.subject_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public Integer getSubjectId() {
        return subjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.subject_id
     *
     * @param subjectId the value for question.subject_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.chapter_id
     *
     * @return the value of question.chapter_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public Integer getChapterId() {
        return chapterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.chapter_id
     *
     * @param chapterId the value for question.chapter_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }
}