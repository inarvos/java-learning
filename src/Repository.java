import java.nio.file.Path;

public interface Repository<T> {
	
	void load(Path p);
	void save(Path p);
	void add(T t);
	boolean exists(String name);
	T findByNickname(String name);

}
