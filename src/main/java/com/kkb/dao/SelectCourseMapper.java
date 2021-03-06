package com.kkb.dao;

import com.kkb.pojo.SelectCourse;
import com.kkb.pojo.SelectCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SelectCourseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table select_course
     *
     * @mbg.generated Sun Feb 09 13:01:13 CST 2020
     */
    long countByExample(SelectCourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table select_course
     *
     * @mbg.generated Sun Feb 09 13:01:13 CST 2020
     */
    int deleteByExample(SelectCourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table select_course
     *
     * @mbg.generated Sun Feb 09 13:01:13 CST 2020
     */
    int insert(SelectCourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table select_course
     *
     * @mbg.generated Sun Feb 09 13:01:13 CST 2020
     */
    int insertSelective(SelectCourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table select_course
     *
     * @mbg.generated Sun Feb 09 13:01:13 CST 2020
     */
    List<SelectCourse> selectByExample(SelectCourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table select_course
     *
     * @mbg.generated Sun Feb 09 13:01:13 CST 2020
     */
    int updateByExampleSelective(@Param("record") SelectCourse record, @Param("example") SelectCourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table select_course
     *
     * @mbg.generated Sun Feb 09 13:01:13 CST 2020
     */
    int updateByExample(@Param("record") SelectCourse record, @Param("example") SelectCourseExample example);
}