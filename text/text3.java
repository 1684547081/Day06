import cn.lhl.entity.Grade1;
import cn.lhl.entity.Grade2;
import cn.lhl.entity.Teacher1;
import cn.lhl.entity.Teacher2;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created by datou on 2017/1/14.
 */
public class text3 {
    public static void main(String[] args) {
        Session session=new Configuration().configure().buildSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Grade2 grade1=new Grade2();
        grade1.setGname("aaaaaa");
        Teacher2 teacher1=new Teacher2();
        teacher1.setTname("liu");
        teacher1.setGrade2(grade1);
        Teacher2 teacher2=new Teacher2();
        teacher2.setTname("l");
        teacher2.setGrade2(grade1);
        session.save(teacher1);
        session.save(teacher2);
        transaction.commit();

    }
}
