package cn.lhl.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by datou on 2017/1/14.
 */
public class Grade {
    private Integer id;
    private String gname;
    private Set<Teacher> teacher =new HashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public Set<Teacher> getTeacher() {
        return teacher;
    }

    public void setTeacher(Set<Teacher> teacher) {
        this.teacher = teacher;
    }
}
