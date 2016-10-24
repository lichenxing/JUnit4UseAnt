package com.telek.calculateParamTest;



import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;



@RunWith(Parameterized.class)
public class CalculateParamTest {
	private double x=0;
	private double y=0;
	private double expected=0;
	public CalculateParamTest(double x, double y, double expected) {
		super();
		this.x = x;
		this.y = y;
		this.expected = expected;
	}
	
	   
    @Parameters
    public static Collection<Object[]> t() {
        //这里也可以从文件中读取测试数据,也可以自己生成
        return Arrays.asList(new Object[][]{
                {1,2,3},
                {2,2,4},
                {2,1,3},
                {2,5,7}
        }) ;
    }
    
    
	@Test
    public void testAdd() {
       assertEquals(expected, x, y);
    }


}
