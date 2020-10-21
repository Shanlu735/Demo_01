package test;
import org.junit.Assert;
import org.junit.Test;

import main.ScoreManage_Interface;
import main.ScoreManage_Interface_Read;
import main.ScoreManage_Interface;

import org.junit.Assert.*;
public class TestScoreManage {
    //测试根据总成绩进行排序
    @Test
    public void Test_01(){
        //虚假学生数据
        String [][] str=new String[][]{
                {"学号","姓名","语文成绩","数学成绩","英语成绩"},
                {"100001","学生1","50","60","70"},
                {"100002","学生2","60","66","7"},
                {"100003","学生3","50","60","80"},
                {"100004","学生4","50","40","70"},
                {"100005","学生5","50","30","70"}};
        ScoreManage_Interface w=new ScoreManage_Interface_Read();
        double arrays = w.max_score(str, "语文成绩");
        Assert.assertEquals(arrays,60,0);
        Assert.assertEquals(w.average_score(str,"语文成绩"),52,0);
    }
}
