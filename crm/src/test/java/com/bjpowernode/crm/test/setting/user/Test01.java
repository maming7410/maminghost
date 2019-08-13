package com.bjpowernode.crm.test.setting.user;

/**
 * 作者：马明
 * 2019/8/13
 */
public class Test01 {
    public static void main(String[] args) {
        //当账号密码正确时 还需要验证其他的东西
        //失效时间 锁定状态 ip地址

        String expireTime = "2018-10-10 10:10:10";
        /*Date date = new Date();
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentSysTime = sdf.format(date);*/
//        System.out.println(currentSysTime);

        //比较一下时间是否失效
      /*  String currentSysTime = DateTimeUtil.getSysTime();
        int i = expireTime.compareTo(currentSysTime);
        System.out.println(i);

        if(i<0){
            System.out.println("账号已失效");
        }*/
        //验证锁定状态
        String lockState = "0";
        if("0".equals(lockState)){
            System.out.println("账号已锁定 请联系管理员");
        }
        String ip = "192.168.1.6";
        String allowIps = "192.168.1.6.12.13.44";
        if(!allowIps.contains(ip)){
            System.out.println("ip地址不能访问");
        }
    }
}
