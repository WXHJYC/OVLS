package cn.xdl.ovls.exam.entity;

public class QuestionType {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_type.type_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    private Integer typeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_type.type_name
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    private String typeName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_type.type_id
     *
     * @return the value of question_type.type_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_type.type_id
     *
     * @param typeId the value for question_type.type_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_type.type_name
     *
     * @return the value of question_type.type_name
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_type.type_name
     *
     * @param typeName the value for question_type.type_name
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }
}