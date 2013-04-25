/**
 * Created By: Comwave Project Team
 * Created Date: 2014-11-30 下午12:07:02
 */


import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.tool.hbm2ddl.SchemaUpdate;

/**
 * @author Tom Yang
 * @version 1.0
 */
public class CreateTable {
	// 创建CM_STOCK表
	public static void main(String args[]) {
		Configuration config = new Configuration().configure().setProperty(Environment.FORMAT_SQL, "true").addResource("com/ydev/domain/User.hbm.xml");
		SchemaUpdate su = new SchemaUpdate(config);
		su.execute(true, true);
	}

}
