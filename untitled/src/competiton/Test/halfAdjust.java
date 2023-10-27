package competiton.Test;


import java.lang.Math;
import java.text.DecimalFormat;

/**
 * 关于四舍五入的解决方法
 */
public class halfAdjust {
    public static void main(String[] args) {
        //定义了三个小数第三位为0，4，5的数,分别对应a,b,c
        double a = 2.100;
        double b = 2.104;
        double c = 2.105;
        //方法一：使用String类里面的format方法
        String fig1 = String.format("%.2f",a);
        String fig2 = String.format("%.2f",b);
        String fig3 = String.format("%.2f",c);
        System.out.println(fig1);//2.10
        System.out.println(fig2);//2.10
        System.out.println(fig3);//2.11
        //方法二：使用DecimalFormat类中的setMinimumFractionDigits方法
        //需要引入import java.text.DecimalFormat;
        DecimalFormat df = new DecimalFormat("0.00");
        df.setMinimumFractionDigits(2);//设置最小位数，以防小数点末尾为零被省略
        //调用df中的format方法实现数据格式化
        String format1 = df.format(a);//2.10
        String format2 = df.format(a);//2.10
        String format3 = df.format(a);//2.11

    }
}
