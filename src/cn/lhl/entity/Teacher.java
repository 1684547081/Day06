package cn.lhl.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by datou on 2017/1/14.
 */
public class Teacher {
        private Integer id;
        private  String tname;
        private Set<Grade> grade  =new HashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Set<Grade> getGrade() {
        return grade;
    }

    public void setGrade(Set<Grade> grade) {
        this.grade = grade;
    }
}
