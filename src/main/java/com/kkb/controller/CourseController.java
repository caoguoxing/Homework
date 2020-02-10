package com.kkb.controller;

import com.kkb.pojo.Course;
import com.kkb.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
public class CourseController {

    @Autowired
    private CourseService courseService;

    /**
     * SSM整合后测试方法
     * @return
     */
    @RequestMapping("/test")
    public ModelAndView test() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.jsp");
        modelAndView.addObject("msg", "hello ssm!");
        return modelAndView;
    }

    @RequestMapping("/test2")
    public void test2(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, HttpSession session) throws IOException {
        String name = httpServletRequest.getParameter("name");
        System.out.println(name);
        System.out.println(session.getId());
        httpServletResponse.getWriter().println("hello world");
    }

    @RequestMapping("/test3")
    public String test3(HttpServletResponse response, Model model){
        model.addAttribute("data","12345");
        return "index.jsp";
    }


    /**
     * 获取所有课程
     * @return
     */
    @RequestMapping("/getCourse")
    public ModelAndView getCourse(){
        List<Course> courses = courseService.selectCourses();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("courses.jsp");
        modelAndView.addObject("courses",courses);
        return modelAndView;
    }

    @RequestMapping("/editCourse")
    public String editCourse(@RequestParam(value = "iid",defaultValue = "6") Integer id, Model model){
        Course course = courseService.selectById(id);
        model.addAttribute("course",course);
        return "edit.jsp";
    }







}
