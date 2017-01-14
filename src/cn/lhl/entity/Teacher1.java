package cn.lhl.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by datou on 2017/1/14.
 */
public class Teacher1 {
        private Integer id;
        private  String tname;
        private Grade1 grade1;

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

    public Grade1 getGrade1() {
        return grade1;
    }

    public void setGrade1(Grade1 grade1) {
        this.grade1 = grade1;
    }


}
