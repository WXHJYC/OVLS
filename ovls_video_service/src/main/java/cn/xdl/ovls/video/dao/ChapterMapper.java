package cn.xdl.ovls.video.dao;

import cn.xdl.ovls.video.entity.Chapter;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.mapping.FetchType;
import org.apache.ibatis.type.JdbcType;

public interface ChapterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chapter
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    @Delete({
        "delete from chapter",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chapter
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    @Insert({
        "insert into chapter (id, name, ",
        "course_id)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{courseId,jdbcType=INTEGER})"
    })
    int insert(Chapter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chapter
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    @InsertProvider(type=ChapterSqlProvider.class, method="insertSelective")
    int insertSelective(Chapter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chapter
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    @Select({
        "select",
        "id, name, course_id",
        "from chapter",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="course_id", property="courseId", jdbcType=JdbcType.INTEGER)
    })
    Chapter selectByPrimaryKey(Integer id);
    
    
    /*
     
	 <resultMap id="BaseResultMap" type="cn.xdl.entity.Chapter" >
	    <id column="id" property="id" jdbcType="INTEGER" />
	    <result column="name" property="name" jdbcType="VARCHAR" />
	    <result column="course_id" property="courseId" jdbcType="INTEGER" />
	    <collection property="videos" javaType="java.util.List" 
	    	select="cn.xdl.ovls.video.dao.VideoMapper.selectByChapterId"
	    	fetchType="eager" column="id">
	    </collection>
	  </resultMap>
     
     */
    /* 
     * 按照课程ID查询章节信息
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    @Select({
        "select",
        "id, name, course_id",
        "from chapter",
        "where course_id = #{course_id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="course_id", property="courseId", jdbcType=JdbcType.INTEGER),
        @Result(property="videos",javaType=List.class,column="id",
        	many=@Many(select="cn.xdl.ovls.video.dao.VideoMapper.selectByChapterId",
        			fetchType=FetchType.EAGER))
    })
    List<Chapter> selectByCourseId(Integer course_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chapter
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    @UpdateProvider(type=ChapterSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Chapter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chapter
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    @Update({
        "update chapter",
        "set name = #{name,jdbcType=VARCHAR},",
          "course_id = #{courseId,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Chapter record);
}