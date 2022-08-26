package emp;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Employess {
	private SqlSession session;
	
	public Employess() {
		String resource ="config/configuration.xml";
		try {
			Reader reader = Resources.getResourceAsReader(resource);
			SqlSessionFactoryBuilder sqlBuilder = new SqlSessionFactoryBuilder();
		SqlSessionFactory factory =sqlBuilder.build(reader);
		session = factory.openSession(true);
		reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public List<EmpDTO> selectMethod() {
	 return	session.selectList("emp.cnt");
	}
	
}

