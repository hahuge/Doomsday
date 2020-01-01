package forever;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/*
*   --> EnableUserBean --> UserImportSelector --> UserConfiguration --> User
* */
@EnableUserBean
public class TestApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TestApplication.class);
        User bean = ac.getBean(User.class);
        System.out.println(bean);
    }
}
