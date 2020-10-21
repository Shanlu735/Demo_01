package main;
public class main {
    public static void main(String[] args) {
        ScoreManage_Interface w =new ScoreManage_Interface_Read();
        SelectScore_Interface h=new SelectScore_Interface_Read();
        Sort_Interface ws=new Sort_Interface_Read();
        //socre.xlsx的地址，读取excel中的信息
        excel excel=new excel("D:\\score.xlsx", "sheet2");
        String[][] str = excel.readExcelData();
//        System.out.println(w.average_score(str,"物理成绩"));//查询平均成绩
//        System.out.println(w.max_score(str,"物理成绩"));//查询最大成绩
//        System.out.println(h.SelectScore_Name(str,"费先彬1"));//根据姓名查询成绩等信息
//        System.out.println(h.SelectScore_xh(str,"100001.0"));//根据学号查询成绩等信息
        String[][] arrays = ws.Sort_bySum(str);
        System.out.println( arrays[0].length);
        System.out.println( str[0].length);
//        System.out.println(arrays.length+"--"+arrays[0].length);
        //遍历新的数组
        for(int i=0;i<arrays.length;i++) {

            for(int j=0;j<arrays[i].length;j++) {
                System.out.print(arrays[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
