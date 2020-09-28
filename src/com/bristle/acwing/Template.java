package com.bristle.acwing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yixuanWu
 * @version 1.0
 * @description 算法模板 读取输入流数据
 * @date 2020-09-23 23:00
 */
public class Template {

    public static void main(String[] args) throws IOException {
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(streamReader);

        while (true){
            String s = reader.readLine();
            System.out.println(Integer.parseInt(s));
        }
    }
}
