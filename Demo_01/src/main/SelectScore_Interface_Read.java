package main;
public class SelectScore_Interface_Read implements SelectScore_Interface {
    @Override
    public String SelectScore_Name(String[][] str, String name) {
        boolean f=true;
        for (int i = 1; i <str[0].length && f; i++) {
            if (str[i][1].equals(name)){
                f=false;
                return name+"的"+str[0][2]+"成绩为"+str[i][2]+","+str[0][3]
                        +"成绩为"+str[i][3]+","+str[0][4]+"成绩为"+str[i][4]+".";
            }
        }
        return "未找到相关信息";
    }

    @Override
    public String SelectScore_xh(String[][] str, String xh) {
        boolean f=true;
        for (int i = 1; i <str[0].length && f; i++) {
            if (str[i][0].equals(xh)){
                f=false;
                return xh+"的"+str[0][2]+"成绩为"+str[i][2]+","+str[0][3]
                        +"成绩为"+str[i][3]+","+str[0][4]+"成绩为"+str[i][4]+".";
            }
        }
        return "未找到相关信息";
    }
}
