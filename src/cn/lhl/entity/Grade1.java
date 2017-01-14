package cn.lhl.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by datou on 2017/1/14.
 */
public class Grade1 {
    private Integer id;
    private String gname;
    private Set<Teacher1> teacher1 =new HashSet<>();

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

    public Set<Teacher1> getTeacher1() {
        return teacher1;
    }
    public void setTeacher1(Set<Teacher1> teacher1) {
        this.teacher1 = teacher1;
    }
}
