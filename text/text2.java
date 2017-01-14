import cn.lhl.entity.Grade;
import cn.lhl.entity.Grade1;
import cn.lhl.entity.Teacher;
import cn.lhl.entity.Teacher1;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created by datou on 2017/1/14.
 */
public class text2 {
    public static void main(String[] args) {
        Session session=new Configuration().configure().buildSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Grade1 grade1=new Grade1();
        grade1.setGname("aaaaaa");
        Teacher1 teacher1=new Teacher1();
        teacher1.setTname("liu");
        teacher1.setGrade1(grade1);
        Teacher1 teacher2=new Teacher1();
        teacher2.setTname("l");
        teacher2.setGrade1(grade1);
        grade1.getTeacher1().add(teacher1);
        grade1.getTeacher1().add(teacher2);
        session.save(grade1);
        transaction.commit();

    }
}
