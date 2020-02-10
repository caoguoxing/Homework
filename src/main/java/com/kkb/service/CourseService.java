package com.kkb.service;

import com.kkb.dao.CourseMapper;
import com.kkb.pojo.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseMapper courseMapper;


    public List<Course> selectCourses() {
        List<Course> courses = courseMapper.selectByExample(null);
        return courses;
    }

    public Course selectById(Integer id) {
        return courseMapper.selectByPrimaryKey(id);
    }
}
