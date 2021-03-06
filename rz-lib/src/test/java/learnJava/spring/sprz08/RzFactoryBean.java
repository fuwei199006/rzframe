package learnJava.spring.sprz08;

import com.rz.frame.utils.RzLogger;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class RzFactoryBean implements FactoryBean<Eal> {
	//创建的实体的方法
	@Override
	public Eal getObject() throws Exception {
		RzLogger.info("创建Eal实例");
		return new Eal();
	}
	
	@Override
	public Class<?> getObjectType() {
		return Eal.class;
	}
	
	@Override
	public boolean isSingleton() {
		return true;
	}
}
