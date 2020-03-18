import com.yau.mapper.BooksMapper;
import com.yau.pojo.Book;
import com.yau.service.BooksService;
import com.yau.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test1() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession(true);
        BooksMapper mapper = sqlSession.getMapper(BooksMapper.class);
        List<Book> allBooks = mapper.getAllBooks();
        for (Book book : allBooks) {
            System.out.println(book);
        }
    }

    @Test
    public void test2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        BooksService bean = applicationContext.getBean(BooksService.class);
        List<Book> allBooks = bean.getAllBooks();
        for (Book bo : allBooks) {
            System.out.println(bo);
        }
    }
}
