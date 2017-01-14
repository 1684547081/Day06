import cn.lhl.entity.Grade;
import cn.lhl.entity.Teacher;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;

/**
 * Created by datou on 2017/1/14.
 */
public class text1 {
    public static void main(String[] args) {
        Session session=new Configuration().configure().buildSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Teacher teacher=new Teacher();
        teacher.setTname("小老师");
        Teacher teacher2=new Teacher();
        teacher2.setTname("Ddr老师");
        Grade grade=new Grade();
        grade.setGname("aaaa");
        grade.getTeacher().add(teacher);
        grade.getTeacher().add(teacher2);
        teacher.getGrade().add(grade);
        teacher2.getGrade().add(grade);
        session.save(teacher);
        session.save(teacher2);
        session.save(grade);
        transaction.commit();

    }
}
