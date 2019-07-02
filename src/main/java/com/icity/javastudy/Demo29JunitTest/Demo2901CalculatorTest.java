package com.icity.javastudy.Demo29JunitTest;

import com.icity.javastudy.Demo29Junit.Demo2901Calculator;
import junit.framework.TestCase;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/*
    Junit单元测试：
        测试分类：黑盒测试，白盒测试（需要写代码）

    Junit使用白盒测试，步骤如下：
        1.定义一个测试类（测试用例）
            测试类名：被测试的类名Test
            包名：xxx.xxx.xx.test
        2.定义测试方法：可以独立运行
            方法名：test测试的方法名
            返回值：void
            参数列表：空参
        3.给方法加@Test
        4.导入junit依赖环境

    判定结果：一般使用断言操作处理结果
 */

/*
    声明一种测试方法 	                     @Test
    在当前类中的所有测试方法之前执行        @BeforeAll
    在当前类中的所有测试方法之后执行        @AfterAll
    在每个测试方法之前执行                 @BeforeEach
    每种测试方法后执行                     @AfterEach
    禁用测试方法/类                        @Disabled
    测试工厂进行动态测试                   @TestFactory
    嵌套测试                              @Nested
    标记和过滤                            @Tag
    注册自定义扩展                         @ExtendWith
 */

public class Demo2901CalculatorTest {

    //初始化方法：用于资源的申请，所有测试方法在执行前，会先执行该方法.加入注解@BeforeAll
    @BeforeAll
    public static void init() {
        System.out.println("init...");
    }

    //释放资源的方法：所有方法执行完后，自动执行该方法
    @AfterAll
    public static void close() {
        System.out.println("close...");
    }

    //测试add方法
    @Test
    public void testAdd() {
        System.out.println("测试方法被执行");
        Demo2901Calculator calculator = new Demo2901Calculator();
        int add = calculator.add(1, 2);
        calculator.sub(2, 1);

        //断言：断言此结果是3
        TestCase.assertEquals(3, add);
    }
}
